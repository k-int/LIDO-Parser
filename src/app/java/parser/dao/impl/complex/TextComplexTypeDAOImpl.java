package app.java.parser.dao.impl.complex;

import app.java.common.Utils;
import app.java.parser.dao.complex.TextComplexTypeDAO;
import app.java.parser.model.attribute.lido.LidoEncodingAnalog;
import app.java.parser.model.attribute.lido.LidoLabel;
import app.java.parser.model.attribute.xml.XmlLang;
import app.java.parser.model.complex.TextComplexType;
import org.w3c.dom.Node;

import java.util.HashMap;

public class TextComplexTypeDAOImpl implements TextComplexTypeDAO {
    private static Utils utils = new Utils();

    public TextComplexType getTextComplexType(Node node) {
        HashMap<String, String> attributes = utils.getAttributes(node);

        return new TextComplexType(
                node.getTextContent(),
                new XmlLang(attributes.get("xml:lang")),
                new LidoEncodingAnalog(attributes.get(" lido:encodinganalog")),
                new LidoLabel(attributes.get("lido:label"))
        );
    }
}
