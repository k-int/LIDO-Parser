package app.java.parser.dao.impl.element.leaf.work;

import app.java.common.Utils;
import app.java.parser.dao.element.leaf.work.WorkIDDAO;
import app.java.parser.model.attribute.lido.LidoEncodingAnalog;
import app.java.parser.model.attribute.lido.LidoLabel;
import app.java.parser.model.attribute.lido.LidoSortOrder;
import app.java.parser.model.attribute.lido.LidoType;
import app.java.parser.model.element.leaf.work.WorkID;
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
