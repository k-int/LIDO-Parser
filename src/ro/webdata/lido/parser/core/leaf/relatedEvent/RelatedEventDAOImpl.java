package ro.webdata.lido.parser.core.leaf.relatedEvent;

import ro.webdata.lido.parser.core.complex.eventSetComplexType.EventSetComplexTypeDAO;
import ro.webdata.lido.parser.core.complex.eventSetComplexType.EventSetComplexTypeDAOImpl;
import org.w3c.dom.Node;

public class RelatedEventDAOImpl implements RelatedEventDAO {
    private static EventSetComplexTypeDAO eventSetComplexTypeDAO = new EventSetComplexTypeDAOImpl();

    public RelatedEvent getRelatedEvent(Node node) {
        return new RelatedEvent(eventSetComplexTypeDAO.getEventSetComplexType(node));
    }
}
