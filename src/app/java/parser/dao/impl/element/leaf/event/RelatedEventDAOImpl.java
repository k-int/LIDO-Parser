package app.java.parser.dao.impl.element.leaf.event;

import app.java.parser.dao.complex.event.EventSetComplexTypeDAO;
import app.java.parser.dao.element.leaf.event.RelatedEventDAO;
import app.java.parser.dao.impl.complex.event.EventSetComplexTypeDAOImpl;
import app.java.parser.model.element.leaf.event.RelatedEvent;
import org.w3c.dom.Node;

public class RelatedEventDAOImpl implements RelatedEventDAO {
    private static EventSetComplexTypeDAO eventSetComplexTypeDAO = new EventSetComplexTypeDAOImpl();

    public RelatedEvent getRelatedEvent(Node node) {
        return new RelatedEvent(eventSetComplexTypeDAO.getEventSetComplexType(node));
    }
}
