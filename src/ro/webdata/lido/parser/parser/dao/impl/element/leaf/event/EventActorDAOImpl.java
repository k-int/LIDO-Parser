package ro.webdata.lido.parser.parser.dao.impl.element.leaf.event;

import ro.webdata.lido.parser.common.Utils;
import ro.webdata.lido.parser.parser.dao.complex.actor.ActorInRoleSetComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.event.EventActorDAO;
import ro.webdata.lido.parser.parser.dao.impl.complex.actor.ActorInRoleSetComplexTypeDAOImpl;
import ro.webdata.lido.parser.parser.model.attribute.lido.LidoSortOrder;
import ro.webdata.lido.parser.parser.model.element.leaf.event.EventActor;
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
