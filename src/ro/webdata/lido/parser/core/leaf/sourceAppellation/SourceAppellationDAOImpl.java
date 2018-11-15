package ro.webdata.lido.parser.core.leaf.sourceAppellation;

import ro.webdata.lido.parser.common.Utils;
import ro.webdata.lido.parser.core.attribute.LidoEncodingAnalog;
import ro.webdata.lido.parser.core.attribute.LidoLabel;
import ro.webdata.lido.parser.core.attribute.XmlLang;
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
