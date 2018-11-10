package app.java.parser.dao.impl.complex.actor;

import app.java.parser.dao.complex.actor.ActorInRoleComplexTypeDAO;
import app.java.parser.dao.element.leaf.actor.ActorDAO;
import app.java.parser.dao.element.leaf.actor.AttributionQualifierActorDAO;
import app.java.parser.dao.element.leaf.actor.ExtentActorDAO;
import app.java.parser.dao.element.leaf.actor.RoleActorDAO;
import app.java.parser.dao.impl.element.leaf.actor.ActorDAOImpl;
import app.java.parser.dao.impl.element.leaf.actor.AttributionQualifierActorDAOImpl;
import app.java.parser.dao.impl.element.leaf.actor.ExtentActorDAOImpl;
import app.java.parser.dao.impl.element.leaf.actor.RoleActorDAOImpl;
import app.java.parser.model.complex.actor.ActorInRoleComplexType;
import app.java.parser.model.element.leaf.actor.Actor;
import app.java.parser.model.element.leaf.actor.AttributionQualifierActor;
import app.java.parser.model.element.leaf.actor.ExtentActor;
import app.java.parser.model.element.leaf.actor.RoleActor;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.ArrayList;

public class ActorInRoleComplexTypeDAOImpl implements ActorInRoleComplexTypeDAO {
    private static ActorDAO actorParser = new ActorDAOImpl();
    private static RoleActorDAO roleActorParser = new RoleActorDAOImpl();
    private static AttributionQualifierActorDAO attributionQualifierActorParser = new AttributionQualifierActorDAOImpl();
    private static ExtentActorDAO extentActorParser = new ExtentActorDAOImpl();

    public ActorInRoleComplexType getActorInRoleComplexType(Node node) {
        Actor actor = null;
        ArrayList<RoleActor> roleActorList = new ArrayList<RoleActor>();
        ArrayList<AttributionQualifierActor> attributionQualifierActorList = new ArrayList<AttributionQualifierActor>();
        ArrayList<ExtentActor> extentActorList = new ArrayList<ExtentActor>();
        NodeList childNodeList = node.getChildNodes();

        for (int i = 0; i < childNodeList.getLength(); i++) {
            Node child = childNodeList.item(i);
            String childName = child.getNodeName();

            switch (childName) {
                case "lido:actor":
                    actor = actorParser.getActor(child);
                    break;
                case "lido:roleActor":
                    roleActorList.add(roleActorParser.getRoleActor(child));
                    break;
                case "lido:attributionQualifierActor":
                    attributionQualifierActorList.add(attributionQualifierActorParser.getAttributionQualifierActor(child));
                    break;
                case "lido:extentActor":
                    extentActorList.add(extentActorParser.getExtentActor(child));
                    break;
                default: break;
            }
        }

        return new ActorInRoleComplexType(
                actor, roleActorList,
                attributionQualifierActorList,
                extentActorList
        );
    }
}
