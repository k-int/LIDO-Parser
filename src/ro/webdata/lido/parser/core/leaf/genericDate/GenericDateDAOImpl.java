package ro.webdata.lido.parser.core.leaf.genericDate;

import ro.webdata.lido.parser.common.Utils;
import ro.webdata.lido.parser.core.attribute.LidoEncodingAnalog;
import ro.webdata.lido.parser.core.attribute.LidoLabel;
import ro.webdata.lido.parser.core.attribute.LidoSource;
import ro.webdata.lido.parser.core.attribute.LidoType;
import org.w3c.dom.Node;

import java.util.HashMap;

public class GenericDateDAOImpl implements GenericDateDAO {
    private static Utils utils = new Utils();

    public GenericDate getGenericDate(Node node) {
        HashMap<String, String> attributes = utils.getAttributes(node);

        return new GenericDate(
                node.getTextContent(),
                new LidoType(attributes.get("lido:type")),
                new LidoSource(attributes.get(" lido:source")),
                new LidoEncodingAnalog(attributes.get("lido:encodinganalog")),
                new LidoLabel(attributes.get(" lido:label"))
        );
    }
}
