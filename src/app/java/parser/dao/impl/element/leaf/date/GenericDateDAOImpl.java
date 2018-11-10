package app.java.parser.dao.impl.element.leaf.date;

import app.java.common.Utils;
import app.java.parser.dao.element.leaf.date.GenericDateDAO;
import app.java.parser.model.attribute.lido.LidoEncodingAnalog;
import app.java.parser.model.attribute.lido.LidoLabel;
import app.java.parser.model.attribute.lido.LidoSource;
import app.java.parser.model.attribute.lido.LidoType;
import app.java.parser.model.element.leaf.date.GenericDate;
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
