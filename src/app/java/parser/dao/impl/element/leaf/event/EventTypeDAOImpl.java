package app.java.parser.dao.impl.element.leaf.event;

import app.java.parser.dao.complex.ConceptComplexTypeDAO;
import app.java.parser.dao.element.leaf.event.EventTypeDAO;
import app.java.parser.dao.impl.complex.ConceptComplexTypeDAOImpl;
import app.java.parser.model.element.leaf.event.EventType;
import org.w3c.dom.Node;

public class EventTypeDAOImpl implements EventTypeDAO {
    private static ConceptComplexTypeDAO conceptComplexTypeDAO = new ConceptComplexTypeDAOImpl();

    public EventType getEventType(Node node) {
        return new EventType(conceptComplexTypeDAO.getConceptComplexType(node));
    }
}
