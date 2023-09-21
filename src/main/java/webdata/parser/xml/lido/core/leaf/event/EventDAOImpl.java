package webdata.parser.xml.lido.core.leaf.event;

import org.w3c.dom.Node;
import ro.webdata.parser.xml.lido.core.complex.eventComplexType.EventComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.eventComplexType.EventComplexTypeDAOImpl;

public class EventDAOImpl implements EventDAO {
    private EventComplexTypeDAO eventComplexTypeDAO = new EventComplexTypeDAOImpl();

    public Event getDisplayEvent(Node node) {
        return new Event(eventComplexTypeDAO.getEventComplexType(node));
    }
}
