package app.java.parser.dao.impl.element.leaf.actor;

import app.java.parser.dao.complex.actor.ActorComplexTypeDAO;
import app.java.parser.dao.element.leaf.actor.ActorDAO;
import app.java.parser.dao.impl.complex.actor.ActorComplexTypeDAOImpl;
import app.java.parser.model.element.leaf.actor.Actor;
import org.w3c.dom.Node;

public class ActorDAOImpl implements ActorDAO {
    private ActorComplexTypeDAO actorComplexTypeDAO = new ActorComplexTypeDAOImpl();

    public Actor getActor(Node node) {
        return new Actor(actorComplexTypeDAO.getActorComplexType(node));
    }
}
