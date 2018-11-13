package ro.webdata.lido.parser.parser.dao.impl.complex;

import org.w3c.dom.Node;
import ro.webdata.lido.parser.common.Utils;
import ro.webdata.lido.parser.parser.dao.complex.IdentifierComplexTypeDAO;
import ro.webdata.lido.parser.parser.model.attribute.lido.*;
import ro.webdata.lido.parser.parser.model.complex.IdentifierComplexType;

import java.util.HashMap;

public class IdentifierComplexTypeDAOImpl implements IdentifierComplexTypeDAO {
    private Utils utils = new Utils();

    public IdentifierComplexType getIdentifierComplexType(Node node) {
        HashMap<String, String> attributes = utils.getAttributes(node);

        return new IdentifierComplexType(
                node.getTextContent(),
                new LidoPref(attributes.get("lido:pref")),
                new LidoType(attributes.get("lido:type")),
                new LidoSource(attributes.get("lido:source")),
                new LidoEncodingAnalog(attributes.get("lido:encodinganalog")),
                new LidoLabel(attributes.get("lido:label"))
        );
    }
}
