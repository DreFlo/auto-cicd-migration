package cli.parsers.YAML;

import com.amihaiemil.eoyaml.*;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class TrimmedYamlMapping extends BaseYamlMapping {
    private final Map<YamlNode, YamlNode> mappings = new LinkedHashMap<>();
    private final Comment comment;

    public TrimmedYamlMapping(YamlMapping original) {
        this.trim(original);
        this.comment = original.comment();
    }

    private void trim(YamlMapping yamlMapping) {
        for (YamlNode key : yamlMapping.keys()) {
            YamlNode trimmedKey;
            YamlNode value;

            if (yamlMapping.yamlMapping(key) != null)
                value = new TrimmedYamlMapping(yamlMapping.yamlMapping(key));
            else if (yamlMapping.yamlSequence(key) != null)
                value = new TrimmedMappingYamlSequence(yamlMapping.yamlSequence(key));
            else if (yamlMapping.string(key) != null)
                value = yamlMapping.value(key);
            else
                value = yamlMapping.value(key);

            if (key.type().equals(Node.SCALAR))
                trimmedKey = Yaml.createYamlScalarBuilder().addLine(key.asScalar().value().trim()).buildPlainScalar();
            else
                trimmedKey = key;

            mappings.put(trimmedKey, value);
        }
    }

    @Override
    public Set<YamlNode> keys() {
        return this.mappings.keySet();
    }

    @Override
    public YamlNode value(YamlNode key) {
        return this.mappings.get(key);
    }

    @Override
    public Comment comment() {
        return this.comment;
    }
}
