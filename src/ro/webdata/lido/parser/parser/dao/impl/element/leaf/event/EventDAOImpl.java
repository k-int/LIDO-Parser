package ro.webdata.lido.parser.parser.dao.impl.element.leaf.event;

import ro.webdata.lido.parser.parser.dao.complex.event.EventComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.event.EventDAO;
import ro.webdata.lido.parser.parser.dao.impl.complex.event.EventComplexTypeDAOImpl;
import ro.webdata.lido.parser.parser.model.element.leaf.event.Event;
import org.w3c.dom.Node;

public class EventDAOImpl implements EventDAO {
    private EventComplexTypeDAO eventComplexTypeDAO = new EventComplexTypeDAOImpl();

    public Event getDisplayEvent(Node node) {
        return new Event(eventComplexTypeDAO.getEventComplexType(node));
    }
}
