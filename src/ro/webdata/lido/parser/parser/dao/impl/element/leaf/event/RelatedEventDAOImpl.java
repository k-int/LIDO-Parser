package ro.webdata.lido.parser.parser.dao.impl.element.leaf.event;

import ro.webdata.lido.parser.parser.dao.complex.event.EventSetComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.event.RelatedEventDAO;
import ro.webdata.lido.parser.parser.dao.impl.complex.event.EventSetComplexTypeDAOImpl;
import ro.webdata.lido.parser.parser.model.element.leaf.event.RelatedEvent;
import org.w3c.dom.Node;

public class RelatedEventDAOImpl implements RelatedEventDAO {
    private static EventSetComplexTypeDAO eventSetComplexTypeDAO = new EventSetComplexTypeDAOImpl();

    public RelatedEvent getRelatedEvent(Node node) {
        return new RelatedEvent(eventSetComplexTypeDAO.getEventSetComplexType(node));
    }
}
