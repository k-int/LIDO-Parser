package app.java.parser.dao.impl.element.leaf;

import app.java.common.Utils;
import app.java.parser.dao.element.leaf.SourceAppellationDAO;
import app.java.parser.model.attribute.lido.LidoEncodingAnalog;
import app.java.parser.model.attribute.lido.LidoLabel;
import app.java.parser.model.attribute.xml.XmlLang;
import app.java.parser.model.element.leaf.SourceAppellation;
import org.w3c.dom.Node;

import java.util.HashMap;

public class SourceAppellationDAOImpl implements SourceAppellationDAO {
    private static Utils utils = new Utils();

    public SourceAppellation getSourceAppellation(Node node) {
        HashMap<String, String> attributes = utils.getAttributes(node);

        return new app.java.parser.model.element.leaf.SourceAppellation(
                node.getTextContent(),
                new XmlLang(attributes.get("xml:lang")),
                new LidoEncodingAnalog(attributes.get("lido:encodinganalog")),
                new LidoLabel(attributes.get("lido:label"))
        );
    }
}
