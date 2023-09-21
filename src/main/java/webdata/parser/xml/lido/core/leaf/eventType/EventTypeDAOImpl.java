package webdata.parser.xml.lido.core.leaf.eventType;

import org.w3c.dom.Node;
import ro.webdata.parser.xml.lido.core.complex.conceptComplexType.ConceptComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.conceptComplexType.ConceptComplexTypeDAOImpl;

public class EventTypeDAOImpl implements EventTypeDAO {
    private static ConceptComplexTypeDAO conceptComplexTypeDAO = new ConceptComplexTypeDAOImpl();

    public EventType getEventType(Node node) {
        return new EventType(conceptComplexTypeDAO.getConceptComplexType(node));
    }
}
