package ro.webdata.lido.parser.parser.dao.impl.complex;

import ro.webdata.lido.parser.common.Utils;
import ro.webdata.lido.parser.parser.dao.complex.TextComplexTypeDAO;
import ro.webdata.lido.parser.parser.model.attribute.lido.LidoEncodingAnalog;
import ro.webdata.lido.parser.parser.model.attribute.lido.LidoLabel;
import ro.webdata.lido.parser.parser.model.attribute.xml.XmlLang;
import ro.webdata.lido.parser.parser.model.complex.TextComplexType;
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
