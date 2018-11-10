package app.java.parser.dao.impl.element.leaf.event;

import app.java.parser.dao.complex.event.EventComplexTypeDAO;
import app.java.parser.dao.element.leaf.event.EventDAO;
import app.java.parser.dao.impl.complex.event.EventComplexTypeDAOImpl;
import app.java.parser.model.element.leaf.event.Event;
import org.w3c.dom.Node;

public class EventDAOImpl implements EventDAO {
    private EventComplexTypeDAO eventComplexTypeDAO = new EventComplexTypeDAOImpl();

    public Event getDisplayEvent(Node node) {
        return new Event(eventComplexTypeDAO.getEventComplexType(node));
    }
}
