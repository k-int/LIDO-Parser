package app.java.parser.dao.impl.complex;

import app.java.common.Utils;
import app.java.parser.dao.complex.IdentifierComplexTypeDAO;
import app.java.parser.model.attribute.lido.*;
import app.java.parser.model.complex.IdentifierComplexType;
import org.w3c.dom.Node;

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
