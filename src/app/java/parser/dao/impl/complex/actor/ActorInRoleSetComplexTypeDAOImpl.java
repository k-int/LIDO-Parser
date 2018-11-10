package app.java.parser.dao.impl.complex.actor;

import app.java.parser.dao.complex.actor.ActorInRoleSetComplexTypeDAO;
import app.java.parser.dao.element.leaf.actor.ActorInRoleDAO;
import app.java.parser.dao.element.leaf.actor.DisplayActorInRoleDAO;
import app.java.parser.dao.impl.element.leaf.actor.ActorInRoleDAOImpl;
import app.java.parser.dao.impl.element.leaf.actor.DisplayActorInRoleDAOImpl;
import app.java.parser.model.complex.actor.ActorInRoleSetComplexType;
import app.java.parser.model.element.leaf.actor.ActorInRole;
import app.java.parser.model.element.leaf.actor.DisplayActorInRole;
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
