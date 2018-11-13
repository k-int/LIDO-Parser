package ro.webdata.lido.parser.parser.dao.impl.element.leaf.event;

import ro.webdata.lido.parser.common.Utils;
import ro.webdata.lido.parser.parser.dao.complex.object.ObjectSetComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.event.ThingPresentDAO;
import ro.webdata.lido.parser.parser.dao.impl.complex.object.ObjectSetComplexTypeDAOImpl;
import ro.webdata.lido.parser.parser.model.attribute.lido.LidoSortOrder;
import ro.webdata.lido.parser.parser.model.element.leaf.event.ThingPresent;
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
