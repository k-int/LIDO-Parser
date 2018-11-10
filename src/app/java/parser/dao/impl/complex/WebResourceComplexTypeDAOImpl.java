package app.java.parser.dao.impl.complex;

import app.java.common.Utils;
import app.java.parser.dao.complex.WebResourceComplexTypeDAO;
import app.java.parser.model.attribute.lido.LidoEncodingAnalog;
import app.java.parser.model.attribute.lido.LidoFormatResource;
import app.java.parser.model.attribute.lido.LidoLabel;
import app.java.parser.model.attribute.lido.LidoPref;
import app.java.parser.model.attribute.xml.XmlLang;
import app.java.parser.model.complex.WebResourceComplexType;
import org.w3c.dom.Node;

import java.util.HashMap;

public class WebResourceComplexTypeDAOImpl implements WebResourceComplexTypeDAO {
    private static Utils utils = new Utils();

    public WebResourceComplexType getWebResourceComplexType(Node node) {
        HashMap<String, String> attributes = utils.getAttributes(node);

        return new WebResourceComplexType(
                node.getTextContent(),
                new LidoPref(attributes.get("lido:pref")),
                new LidoFormatResource(attributes.get("formatResource")),
                new XmlLang(attributes.get("xml:lang")),
                new LidoEncodingAnalog(attributes.get("lido:encodinganalog")),
                new LidoLabel(attributes.get("lido:label"))
        );
    }
}
