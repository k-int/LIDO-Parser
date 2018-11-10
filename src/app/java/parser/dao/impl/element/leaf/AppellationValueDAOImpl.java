package app.java.parser.dao.impl.element.leaf;

import app.java.common.Utils;
import app.java.parser.dao.element.leaf.AppellationValueDAO;
import app.java.parser.model.attribute.lido.LidoEncodingAnalog;
import app.java.parser.model.attribute.lido.LidoLabel;
import app.java.parser.model.attribute.lido.LidoPref;
import app.java.parser.model.attribute.xml.XmlLang;
import app.java.parser.model.element.leaf.AppellationValue;
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
