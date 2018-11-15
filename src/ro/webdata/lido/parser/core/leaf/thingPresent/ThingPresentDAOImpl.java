package ro.webdata.lido.parser.core.leaf.thingPresent;

import ro.webdata.lido.parser.common.Utils;
import ro.webdata.lido.parser.core.complex.objectSetComplexType.ObjectSetComplexTypeDAO;
import ro.webdata.lido.parser.core.complex.objectSetComplexType.ObjectSetComplexTypeDAOImpl;
import ro.webdata.lido.parser.core.attribute.LidoSortOrder;
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
