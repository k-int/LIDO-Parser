package app.java.parser.dao.impl.element.set;

import app.java.common.Utils;
import app.java.parser.dao.complex.event.EventSetComplexTypeDAO;
import app.java.parser.dao.element.set.EventSetDAO;
import app.java.parser.dao.impl.complex.event.EventSetComplexTypeDAOImpl;
import app.java.parser.model.attribute.lido.LidoSortOrder;
import app.java.parser.model.element.set.EventSet;
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
