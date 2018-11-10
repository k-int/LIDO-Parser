package app.java.parser.dao.impl.element.leaf.actor;

import app.java.parser.dao.complex.actor.ActorInRoleComplexTypeDAO;
import app.java.parser.dao.element.leaf.actor.ActorInRoleDAO;
import app.java.parser.dao.impl.complex.actor.ActorInRoleComplexTypeDAOImpl;
import app.java.parser.model.element.leaf.actor.ActorInRole;
import org.w3c.dom.Node;

public class ActorInRoleDAOImpl implements ActorInRoleDAO {
    private static ActorInRoleComplexTypeDAO actorInRoleComplexTypeDAO = new ActorInRoleComplexTypeDAOImpl();

    public ActorInRole getActorInRole(Node node) {
        return new ActorInRole(actorInRoleComplexTypeDAO.getActorInRoleComplexType(node));
    }
}
