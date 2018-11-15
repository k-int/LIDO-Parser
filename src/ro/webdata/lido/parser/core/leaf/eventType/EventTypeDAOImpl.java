package ro.webdata.lido.parser.core.leaf.eventType;

import ro.webdata.lido.parser.core.complex.conceptComplexType.ConceptComplexTypeDAO;
import ro.webdata.lido.parser.core.complex.conceptComplexType.ConceptComplexTypeDAOImpl;
import org.w3c.dom.Node;

public class EventTypeDAOImpl implements EventTypeDAO {
    private static ConceptComplexTypeDAO conceptComplexTypeDAO = new ConceptComplexTypeDAOImpl();

    public EventType getEventType(Node node) {
        return new EventType(conceptComplexTypeDAO.getConceptComplexType(node));
    }
}
