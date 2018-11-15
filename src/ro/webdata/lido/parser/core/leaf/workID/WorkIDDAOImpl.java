package ro.webdata.lido.parser.core.leaf.workID;

import ro.webdata.lido.parser.common.Utils;
import ro.webdata.lido.parser.core.attribute.LidoEncodingAnalog;
import ro.webdata.lido.parser.core.attribute.LidoLabel;
import ro.webdata.lido.parser.core.attribute.LidoSortOrder;
import ro.webdata.lido.parser.core.attribute.LidoType;
import org.w3c.dom.Node;

import java.util.HashMap;

public class WorkIDDAOImpl implements WorkIDDAO {
    private static Utils utils = new Utils();

    public WorkID getWorkID(Node node) {
        HashMap<String, String> attributes = utils.getAttributes(node);

        return new WorkID(
                node.getTextContent(),
                new LidoType(attributes.get("lido:type")),
                new LidoSortOrder(attributes.get(" lido:sortorder")),
                new LidoEncodingAnalog(attributes.get("lido:encodinganalog")),
                new LidoLabel(attributes.get("lido:label"))
        );
    }
}
