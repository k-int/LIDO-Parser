package ro.webdata.lido.parser.core.leaf.eventID;

import ro.webdata.lido.parser.core.complex.identifierComplexType.IdentifierComplexTypeDAO;
import ro.webdata.lido.parser.core.complex.identifierComplexType.IdentifierComplexTypeDAOImpl;
import org.w3c.dom.Node;

public class EventIDDAOImpl implements EventIDDAO {
    private IdentifierComplexTypeDAO identifierComplexTypeDAO = new IdentifierComplexTypeDAOImpl();

    public EventID getEventID(Node node) {
        return new EventID(identifierComplexTypeDAO.getIdentifierComplexType(node));
    }
}
