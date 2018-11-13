package ro.webdata.lido.parser.parser.dao.impl.element.leaf;

import ro.webdata.lido.parser.common.Utils;
import ro.webdata.lido.parser.parser.dao.element.leaf.SourceAppellationDAO;
import ro.webdata.lido.parser.parser.model.attribute.lido.LidoEncodingAnalog;
import ro.webdata.lido.parser.parser.model.attribute.lido.LidoLabel;
import ro.webdata.lido.parser.parser.model.attribute.xml.XmlLang;
import ro.webdata.lido.parser.parser.model.element.leaf.SourceAppellation;
import org.w3c.dom.Node;

import java.util.HashMap;

public class SourceAppellationDAOImpl implements SourceAppellationDAO {
    private static Utils utils = new Utils();

    public SourceAppellation getSourceAppellation(Node node) {
        HashMap<String, String> attributes = utils.getAttributes(node);

        return new SourceAppellation(
                node.getTextContent(),
                new XmlLang(attributes.get("xml:lang")),
                new LidoEncodingAnalog(attributes.get("lido:encodinganalog")),
                new LidoLabel(attributes.get("lido:label"))
        );
    }
}
