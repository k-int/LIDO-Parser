package ro.webdata.lido.parser.core.leaf.event;

import ro.webdata.lido.parser.core.complex.eventComplexType.EventComplexTypeDAO;
import ro.webdata.lido.parser.core.complex.eventComplexType.EventComplexTypeDAOImpl;
import org.w3c.dom.Node;

public class EventDAOImpl implements EventDAO {
    private EventComplexTypeDAO eventComplexTypeDAO = new EventComplexTypeDAOImpl();

    public Event getDisplayEvent(Node node) {
        return new Event(eventComplexTypeDAO.getEventComplexType(node));
    }
}
