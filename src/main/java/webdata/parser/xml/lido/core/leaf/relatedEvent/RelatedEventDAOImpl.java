package webdata.parser.xml.lido.core.leaf.relatedEvent;

import org.w3c.dom.Node;
import ro.webdata.parser.xml.lido.core.complex.eventSetComplexType.EventSetComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.eventSetComplexType.EventSetComplexTypeDAOImpl;

public class RelatedEventDAOImpl implements RelatedEventDAO {
    private static EventSetComplexTypeDAO eventSetComplexTypeDAO = new EventSetComplexTypeDAOImpl();

    public RelatedEvent getRelatedEvent(Node node) {
        return new RelatedEvent(eventSetComplexTypeDAO.getEventSetComplexType(node));
    }
}
