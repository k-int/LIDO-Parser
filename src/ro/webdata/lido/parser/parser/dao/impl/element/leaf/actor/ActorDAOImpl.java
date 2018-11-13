package ro.webdata.lido.parser.parser.dao.impl.element.leaf.actor;

import ro.webdata.lido.parser.parser.dao.complex.actor.ActorComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.actor.ActorDAO;
import ro.webdata.lido.parser.parser.dao.impl.complex.actor.ActorComplexTypeDAOImpl;
import ro.webdata.lido.parser.parser.model.element.leaf.actor.Actor;
import org.w3c.dom.Node;

public class ActorDAOImpl implements ActorDAO {
    private ActorComplexTypeDAO actorComplexTypeDAO = new ActorComplexTypeDAOImpl();

    public Actor getActor(Node node) {
        return new Actor(actorComplexTypeDAO.getActorComplexType(node));
    }
}
