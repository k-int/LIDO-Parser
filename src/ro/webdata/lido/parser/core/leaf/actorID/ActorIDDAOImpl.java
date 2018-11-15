package ro.webdata.lido.parser.core.leaf.actorID;

import ro.webdata.lido.parser.core.complex.identifierComplexType.IdentifierComplexTypeDAO;
import ro.webdata.lido.parser.core.complex.identifierComplexType.IdentifierComplexTypeDAOImpl;
import org.w3c.dom.Node;

public class ActorIDDAOImpl implements ActorIDDAO {
    private static IdentifierComplexTypeDAO identifierComplexTypeDAO = new IdentifierComplexTypeDAOImpl();

    public ActorID getActorID(Node node) {
        return new ActorID(identifierComplexTypeDAO.getIdentifierComplexType(node));
    }
}
