package cli.compilers;

import cli.generators.ATLGenerator;
import cli.generators.AbstractGenerator;
import cli.parsers.AbstractParser;
import cli.parsers.TransformationsDSLParser;
import cli.parsers.exceptions.SyntaxException;
import cli.utils.LoggerUtils;
import d.fe.up.pt.cicd.transformationsdsl.acceleo.main.Generate;
import d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.TransformationSet;
import d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.TransformationsPackage;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.m2m.atl.engine.compiler.AtlCompiler;
import org.eclipse.m2m.atl.engine.compiler.CompileTimeError;

import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.logging.Level;

public class TransformationsDSLToATLASMCompiler {
    private final AbstractParser<TransformationSet> parser;
    private final AbstractGenerator<TransformationSet, TransformationsPackage, Generate> generator;

    public TransformationsDSLToATLASMCompiler(AbstractParser<TransformationSet> parser, AbstractGenerator<TransformationSet, TransformationsPackage, Generate> generator) {
        this.parser = parser;
        this.generator = generator;
    }

    public TransformationsDSLToATLASMCompiler(ResourceSet resourceSet) {
        this(new TransformationsDSLParser(), new ATLGenerator(resourceSet));
    }

    public List<String> compile(String input) throws SyntaxException, IOException {
        if (parser == null || generator == null)
            throw new RuntimeException("Parser or generator not set");

        TransformationSet transformationSet = parser.parse(input);

        // Create intermediate/atl folder if it does not exist
        Path intermediateAtlFolder = Path.of("intermediate", "atl");
        if (!intermediateAtlFolder.toFile().exists())
            if (!intermediateAtlFolder.toFile().mkdirs())
                throw new IOException("Could not create intermediate/atl folder");

        generator.generate(transformationSet, intermediateAtlFolder.toString());

        List<String> asmFilePaths = new ArrayList<>();

        for (File file : Objects.requireNonNull(Path.of(intermediateAtlFolder.toString()).toFile().listFiles())) {
            if (file.isFile() && file.getName().endsWith(".atl")) {
                LoggerUtils.log(Level.INFO,"Compiling " + file.getName() + " to ATL ASM...");
                String asmPath = Path.of("intermediate", "atl", file.getName().replace(".atl", ".asm")).toAbsolutePath().toString();
                CompileTimeError[] problems = AtlCompiler.getCompiler("atl2010").compile(new InputStreamReader(file.toURI().toURL().openStream()), asmPath);
                if (problems.length > 0) {
                    LoggerUtils.log(Level.SEVERE, "Error compiling " + file.getName() + " to ATL ASM");
                    for (CompileTimeError problem : problems) {
                        LoggerUtils.log(Level.SEVERE, problem.getDescription() + " " + problem.getLocation());
                    }
                } else {
                    LoggerUtils.log(Level.INFO, "Compiled " + file.getName() + " to ATL ASM");
                    asmFilePaths.add(asmPath);
                }
            }
        }

        return asmFilePaths;
    }
}
