package ro.webdata.lido.parser.core.complex.webResourceComplexType;

import ro.webdata.lido.parser.common.Utils;
import ro.webdata.lido.parser.core.attribute.LidoEncodingAnalog;
import ro.webdata.lido.parser.core.attribute.LidoFormatResource;
import ro.webdata.lido.parser.core.attribute.LidoLabel;
import ro.webdata.lido.parser.core.attribute.LidoPref;
import ro.webdata.lido.parser.core.attribute.XmlLang;
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
