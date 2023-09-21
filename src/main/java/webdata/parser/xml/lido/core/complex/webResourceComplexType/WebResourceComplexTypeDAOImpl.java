package webdata.parser.xml.lido.core.complex.webResourceComplexType;

import org.w3c.dom.Node;
import ro.webdata.echo.commons.graph.Graph;
import ro.webdata.parser.xml.lido.core.attribute.LidoEncodingAnalog;
import ro.webdata.parser.xml.lido.core.attribute.LidoFormatResource;
import ro.webdata.parser.xml.lido.core.attribute.LidoLabel;
import ro.webdata.parser.xml.lido.core.attribute.LidoPref;
import ro.webdata.parser.xml.lido.core.attribute.XmlLang;

import java.util.HashMap;

public class WebResourceComplexTypeDAOImpl implements WebResourceComplexTypeDAO {
    public WebResourceComplexType getWebResourceComplexType(Node node) {
        HashMap<String, String> attributes = Graph.getAttributes(node);

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
