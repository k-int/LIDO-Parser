package ro.webdata.lido.parser.core.leaf.actor;

import ro.webdata.lido.parser.core.complex.actorComplexType.ActorComplexTypeDAO;
import ro.webdata.lido.parser.core.complex.actorComplexType.ActorComplexTypeDAOImpl;
import org.w3c.dom.Node;

public class ActorDAOImpl implements ActorDAO {
    private ActorComplexTypeDAO actorComplexTypeDAO = new ActorComplexTypeDAOImpl();

    public Actor getActor(Node node) {
        return new Actor(actorComplexTypeDAO.getActorComplexType(node));
    }
}
