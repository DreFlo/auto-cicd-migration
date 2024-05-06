package cli.parsers.YAML;

import com.amihaiemil.eoyaml.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class TrimmedMappingYamlSequence extends BaseYamlSequence {
    private final List<YamlNode> nodes = new ArrayList<>();
    private final Comment comment;

    public TrimmedMappingYamlSequence(YamlSequence yamlSequence) {
        this.trim(yamlSequence);
        this.comment = yamlSequence.comment();
    }

    private void trim(YamlSequence yamlSequence) {
        for (YamlNode node : yamlSequence.values()) {
            if (node.type().equals(Node.MAPPING)) {
                nodes.add(new TrimmedYamlMapping(node.asMapping()));
            } else if (node.type().equals(Node.SEQUENCE)) {
                nodes.add(new TrimmedMappingYamlSequence(node.asSequence()));
            } else {
                nodes.add(node);
            }
        }
    }

    @Override
    public Collection<YamlNode> values() {
        return new ArrayList<>(this.nodes);
    }

    @Override
    public Comment comment() {
        return this.comment;
    }
}
