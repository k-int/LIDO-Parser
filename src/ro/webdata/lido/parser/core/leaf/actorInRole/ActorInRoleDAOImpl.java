package ro.webdata.lido.parser.core.leaf.actorInRole;

import ro.webdata.lido.parser.core.complex.actorInRoleComplexType.ActorInRoleComplexTypeDAO;
import ro.webdata.lido.parser.core.complex.actorInRoleComplexType.ActorInRoleComplexTypeDAOImpl;
import org.w3c.dom.Node;

public class ActorInRoleDAOImpl implements ActorInRoleDAO {
    private static ActorInRoleComplexTypeDAO actorInRoleComplexTypeDAO = new ActorInRoleComplexTypeDAOImpl();

    public ActorInRole getActorInRole(Node node) {
        return new ActorInRole(actorInRoleComplexTypeDAO.getActorInRoleComplexType(node));
    }
}
