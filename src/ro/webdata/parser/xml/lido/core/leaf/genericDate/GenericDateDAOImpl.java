package ro.webdata.parser.xml.lido.core.leaf.genericDate;

import ro.webdata.parser.Graph;
import ro.webdata.parser.xml.lido.core.attribute.LidoEncodingAnalog;
import ro.webdata.parser.xml.lido.core.attribute.LidoLabel;
import ro.webdata.parser.xml.lido.core.attribute.LidoSource;
import ro.webdata.parser.xml.lido.core.attribute.LidoType;
import org.w3c.dom.Node;

import java.util.HashMap;

public class GenericDateDAOImpl implements GenericDateDAO {
    public GenericDate getGenericDate(Node node) {
        HashMap<String, String> attributes = Graph.getAttributes(node);

        return new GenericDate(
                node.getTextContent(),
                new LidoType(attributes.get("lido:type")),
                new LidoSource(attributes.get(" lido:source")),
                new LidoEncodingAnalog(attributes.get("lido:encodinganalog")),
                new LidoLabel(attributes.get(" lido:label"))
        );
    }
}
