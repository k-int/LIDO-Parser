package ro.webdata.lido.parser.parser.dao.impl.element.leaf.event;

import ro.webdata.lido.parser.parser.dao.complex.IdentifierComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.event.EventIDDAO;
import ro.webdata.lido.parser.parser.dao.impl.complex.IdentifierComplexTypeDAOImpl;
import ro.webdata.lido.parser.parser.model.element.leaf.event.EventID;
import org.w3c.dom.Node;

public class EventIDDAOImpl implements EventIDDAO {
    private IdentifierComplexTypeDAO identifierComplexTypeDAO = new IdentifierComplexTypeDAOImpl();

    public EventID getEventID(Node node) {
        return new EventID(identifierComplexTypeDAO.getIdentifierComplexType(node));
    }
}
