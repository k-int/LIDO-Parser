package ro.webdata.lido.parser.parser.dao.impl.element.leaf.event;

import ro.webdata.lido.parser.parser.dao.complex.ConceptComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.event.EventTypeDAO;
import ro.webdata.lido.parser.parser.dao.impl.complex.ConceptComplexTypeDAOImpl;
import ro.webdata.lido.parser.parser.model.element.leaf.event.EventType;
import org.w3c.dom.Node;

public class EventTypeDAOImpl implements EventTypeDAO {
    private static ConceptComplexTypeDAO conceptComplexTypeDAO = new ConceptComplexTypeDAOImpl();

    public EventType getEventType(Node node) {
        return new EventType(conceptComplexTypeDAO.getConceptComplexType(node));
    }
}
