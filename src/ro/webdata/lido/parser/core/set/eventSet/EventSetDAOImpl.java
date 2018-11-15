package ro.webdata.lido.parser.core.set.eventSet;

import ro.webdata.lido.parser.common.Utils;
import ro.webdata.lido.parser.core.complex.eventSetComplexType.EventSetComplexTypeDAO;
import ro.webdata.lido.parser.core.complex.eventSetComplexType.EventSetComplexTypeDAOImpl;
import ro.webdata.lido.parser.core.attribute.LidoSortOrder;
import org.w3c.dom.Node;

import java.util.HashMap;

public class EventSetDAOImpl implements EventSetDAO {
    private EventSetComplexTypeDAO eventSetComplexTypeDAO = new EventSetComplexTypeDAOImpl();
    private Utils utils = new Utils();

    public EventSet getEventSet(Node node) {
        HashMap<String, String> attributes = utils.getAttributes(node);

        return new EventSet(
                eventSetComplexTypeDAO.getEventSetComplexType(node),
                new LidoSortOrder(attributes.get("lido:sortorder"))
        );
    }
}
