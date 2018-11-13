package ro.webdata.lido.parser.parser.dao.impl.complex.actor;

import ro.webdata.lido.parser.parser.dao.complex.actor.ActorInRoleSetComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.actor.ActorInRoleDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.actor.DisplayActorInRoleDAO;
import ro.webdata.lido.parser.parser.dao.impl.element.leaf.actor.ActorInRoleDAOImpl;
import ro.webdata.lido.parser.parser.dao.impl.element.leaf.actor.DisplayActorInRoleDAOImpl;
import ro.webdata.lido.parser.parser.model.complex.actor.ActorInRoleSetComplexType;
import ro.webdata.lido.parser.parser.model.element.leaf.actor.ActorInRole;
import ro.webdata.lido.parser.parser.model.element.leaf.actor.DisplayActorInRole;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.ArrayList;

public class ActorInRoleSetComplexTypeDAOImpl implements ActorInRoleSetComplexTypeDAO {
    private static DisplayActorInRoleDAO displayActorInRoleParser = new DisplayActorInRoleDAOImpl();
    private static ActorInRoleDAO actorInRoleParser = new ActorInRoleDAOImpl();

    public ActorInRoleSetComplexType getActorInRoleSetComplexType(Node node) {
        ArrayList<DisplayActorInRole> displayActorInRoleList = new ArrayList<DisplayActorInRole>();
        ActorInRole actorInRole = null;

        NodeList childNodeList = node.getChildNodes();
        for (int i = 0; i < childNodeList.getLength(); i++) {
            Node child = childNodeList.item(i);
            String childName = child.getNodeName();

            switch (childName) {
                case "lido:displayActorInRole":
                    displayActorInRoleList.add(displayActorInRoleParser.getDisplayActorInRole(child));
                    break;
                case "lido:actorInRole":
                    actorInRole = actorInRoleParser.getActorInRole(child);
                    break;
                default: break;
            }
        }

        return new ActorInRoleSetComplexType(displayActorInRoleList, actorInRole);
    }
}
