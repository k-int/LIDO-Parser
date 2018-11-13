package ro.webdata.lido.parser.parser.dao.impl.element.leaf.actor;

import ro.webdata.lido.parser.parser.dao.complex.IdentifierComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.actor.ActorIDDAO;
import ro.webdata.lido.parser.parser.dao.impl.complex.IdentifierComplexTypeDAOImpl;
import ro.webdata.lido.parser.parser.model.element.leaf.actor.ActorID;
import org.w3c.dom.Node;

public class ActorIDDAOImpl implements ActorIDDAO {
    private static IdentifierComplexTypeDAO identifierComplexTypeDAO = new IdentifierComplexTypeDAOImpl();

    public ActorID getActorID(Node node) {
        return new ActorID(identifierComplexTypeDAO.getIdentifierComplexType(node));
    }
}
