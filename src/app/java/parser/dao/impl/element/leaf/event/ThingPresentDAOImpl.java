package app.java.parser.dao.impl.element.leaf.event;

import app.java.common.Utils;
import app.java.parser.dao.complex.object.ObjectSetComplexTypeDAO;
import app.java.parser.dao.element.leaf.event.ThingPresentDAO;
import app.java.parser.dao.impl.complex.object.ObjectSetComplexTypeDAOImpl;
import app.java.parser.model.attribute.lido.LidoSortOrder;
import app.java.parser.model.element.leaf.event.ThingPresent;
import org.w3c.dom.Node;

import java.util.HashMap;

public class ThingPresentDAOImpl implements ThingPresentDAO {
    private static ObjectSetComplexTypeDAO objectSetComplexTypeDAO = new ObjectSetComplexTypeDAOImpl();
    private static Utils utils = new Utils();

    public ThingPresent getThingPresent(Node node) {
        HashMap<String, String> attributes = utils.getAttributes(node);

        return new ThingPresent(
                objectSetComplexTypeDAO.getObjectSetComplexType(node),
                new LidoSortOrder(attributes.get("lido:sortorder"))
        );
    }
}
