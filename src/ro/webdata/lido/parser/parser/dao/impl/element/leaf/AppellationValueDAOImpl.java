package ro.webdata.lido.parser.parser.dao.impl.element.leaf;

import ro.webdata.lido.parser.common.Utils;
import ro.webdata.lido.parser.parser.dao.element.leaf.AppellationValueDAO;
import ro.webdata.lido.parser.parser.model.attribute.lido.LidoEncodingAnalog;
import ro.webdata.lido.parser.parser.model.attribute.lido.LidoLabel;
import ro.webdata.lido.parser.parser.model.attribute.lido.LidoPref;
import ro.webdata.lido.parser.parser.model.attribute.xml.XmlLang;
import ro.webdata.lido.parser.parser.model.element.leaf.AppellationValue;
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
