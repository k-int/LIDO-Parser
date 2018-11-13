package ro.webdata.lido.parser.parser.dao.impl.element.set;

import ro.webdata.lido.parser.common.Utils;
import ro.webdata.lido.parser.parser.dao.complex.event.EventSetComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.set.EventSetDAO;
import ro.webdata.lido.parser.parser.dao.impl.complex.event.EventSetComplexTypeDAOImpl;
import ro.webdata.lido.parser.parser.model.attribute.lido.LidoSortOrder;
import ro.webdata.lido.parser.parser.model.element.set.EventSet;
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
