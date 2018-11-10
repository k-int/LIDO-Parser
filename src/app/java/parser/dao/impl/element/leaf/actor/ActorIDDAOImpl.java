package app.java.parser.dao.impl.element.leaf.actor;

import app.java.parser.dao.complex.IdentifierComplexTypeDAO;
import app.java.parser.dao.element.leaf.actor.ActorIDDAO;
import app.java.parser.dao.impl.complex.IdentifierComplexTypeDAOImpl;
import app.java.parser.model.element.leaf.actor.ActorID;
import org.w3c.dom.Node;

public class ActorIDDAOImpl implements ActorIDDAO {
    private static IdentifierComplexTypeDAO identifierComplexTypeDAO = new IdentifierComplexTypeDAOImpl();

    public ActorID getActorID(Node node) {
        return new ActorID(identifierComplexTypeDAO.getIdentifierComplexType(node));
    }
}
