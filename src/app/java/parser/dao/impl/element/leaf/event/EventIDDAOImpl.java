package app.java.parser.dao.impl.element.leaf.event;

import app.java.parser.dao.complex.IdentifierComplexTypeDAO;
import app.java.parser.dao.element.leaf.event.EventIDDAO;
import app.java.parser.dao.impl.complex.IdentifierComplexTypeDAOImpl;
import app.java.parser.model.element.leaf.event.EventID;
import org.w3c.dom.Node;

public class EventIDDAOImpl implements EventIDDAO {
    private IdentifierComplexTypeDAO identifierComplexTypeDAO = new IdentifierComplexTypeDAOImpl();

    public EventID getEventID(Node node) {
        return new EventID(identifierComplexTypeDAO.getIdentifierComplexType(node));
    }
}
