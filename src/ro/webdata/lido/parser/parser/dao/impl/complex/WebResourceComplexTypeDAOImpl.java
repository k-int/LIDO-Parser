package ro.webdata.lido.parser.parser.dao.impl.complex;

import ro.webdata.lido.parser.common.Utils;
import ro.webdata.lido.parser.parser.dao.complex.WebResourceComplexTypeDAO;
import ro.webdata.lido.parser.parser.model.attribute.lido.LidoEncodingAnalog;
import ro.webdata.lido.parser.parser.model.attribute.lido.LidoFormatResource;
import ro.webdata.lido.parser.parser.model.attribute.lido.LidoLabel;
import ro.webdata.lido.parser.parser.model.attribute.lido.LidoPref;
import ro.webdata.lido.parser.parser.model.attribute.xml.XmlLang;
import ro.webdata.lido.parser.parser.model.complex.WebResourceComplexType;
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
