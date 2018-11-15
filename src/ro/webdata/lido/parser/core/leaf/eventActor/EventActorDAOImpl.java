package ro.webdata.lido.parser.core.leaf.eventActor;

import ro.webdata.lido.parser.common.Utils;
import ro.webdata.lido.parser.core.complex.actorInRoleSetComplexType.ActorInRoleSetComplexTypeDAO;
import ro.webdata.lido.parser.core.complex.actorInRoleSetComplexType.ActorInRoleSetComplexTypeDAOImpl;
import ro.webdata.lido.parser.core.attribute.LidoSortOrder;
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
