package webdata.parser.xml.lido.core.leaf.eventID;

import org.w3c.dom.Node;
import ro.webdata.parser.xml.lido.core.complex.identifierComplexType.IdentifierComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.identifierComplexType.IdentifierComplexTypeDAOImpl;

public class EventIDDAOImpl implements EventIDDAO {
    private IdentifierComplexTypeDAO identifierComplexTypeDAO = new IdentifierComplexTypeDAOImpl();

    public EventID getEventID(Node node) {
        return new EventID(identifierComplexTypeDAO.getIdentifierComplexType(node));
    }
}
