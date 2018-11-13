package ro.webdata.lido.parser.parser.dao.impl.element.leaf.actor;

import ro.webdata.lido.parser.parser.dao.complex.actor.ActorInRoleComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.actor.ActorInRoleDAO;
import ro.webdata.lido.parser.parser.dao.impl.complex.actor.ActorInRoleComplexTypeDAOImpl;
import ro.webdata.lido.parser.parser.model.element.leaf.actor.ActorInRole;
import org.w3c.dom.Node;

public class ActorInRoleDAOImpl implements ActorInRoleDAO {
    private static ActorInRoleComplexTypeDAO actorInRoleComplexTypeDAO = new ActorInRoleComplexTypeDAOImpl();

    public ActorInRole getActorInRole(Node node) {
        return new ActorInRole(actorInRoleComplexTypeDAO.getActorInRoleComplexType(node));
    }
}
