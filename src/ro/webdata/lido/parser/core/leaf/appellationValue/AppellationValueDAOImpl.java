package ro.webdata.lido.parser.core.leaf.appellationValue;

import ro.webdata.lido.parser.common.Utils;
import ro.webdata.lido.parser.core.attribute.LidoEncodingAnalog;
import ro.webdata.lido.parser.core.attribute.LidoLabel;
import ro.webdata.lido.parser.core.attribute.LidoPref;
import ro.webdata.lido.parser.core.attribute.XmlLang;
import org.w3c.dom.Node;

import java.util.HashMap;

public class AppellationValueDAOImpl implements AppellationValueDAO {
    private Utils utils = new Utils();

    public AppellationValue getAppellationValue(Node node) {
        HashMap<String, String> attributes = utils.getAttributes(node);

        return new AppellationValue(
                node.getTextContent(),
                new LidoPref(attributes.get("lido:pref")),
                new XmlLang(attributes.get("xml:lang")),
                new LidoEncodingAnalog(attributes.get("lido:encodinganalog")),
                new LidoLabel(attributes.get("lido:label"))
        );
    }
}
