package app.java.parser.dao.impl.element.leaf.event;

import app.java.common.Utils;
import app.java.parser.dao.complex.actor.ActorInRoleSetComplexTypeDAO;
import app.java.parser.dao.element.leaf.event.EventActorDAO;
import app.java.parser.dao.impl.complex.actor.ActorInRoleSetComplexTypeDAOImpl;
import app.java.parser.model.attribute.lido.LidoSortOrder;
import app.java.parser.model.element.leaf.event.EventActor;
import org.w3c.dom.Node;

import java.util.HashMap;

public class EventActorDAOImpl implements EventActorDAO {
    private ActorInRoleSetComplexTypeDAO actorInRoleSetComplexTypeDAO = new ActorInRoleSetComplexTypeDAOImpl();
    private Utils utils = new Utils();

    public EventActor getEventActor(Node node) {
        HashMap<String, String> attributes = utils.getAttributes(node);

        return new EventActor(
                actorInRoleSetComplexTypeDAO.getActorInRoleSetComplexType(node),
                new LidoSortOrder(attributes.get("lido:sortorder"))
        );
    }
}
