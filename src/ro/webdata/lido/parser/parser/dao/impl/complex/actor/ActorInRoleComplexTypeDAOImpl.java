package ro.webdata.lido.parser.parser.dao.impl.complex.actor;

import ro.webdata.lido.parser.parser.dao.complex.actor.ActorInRoleComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.actor.ActorDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.actor.AttributionQualifierActorDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.actor.ExtentActorDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.actor.RoleActorDAO;
import ro.webdata.lido.parser.parser.dao.impl.element.leaf.actor.ActorDAOImpl;
import ro.webdata.lido.parser.parser.dao.impl.element.leaf.actor.AttributionQualifierActorDAOImpl;
import ro.webdata.lido.parser.parser.dao.impl.element.leaf.actor.ExtentActorDAOImpl;
import ro.webdata.lido.parser.parser.dao.impl.element.leaf.actor.RoleActorDAOImpl;
import ro.webdata.lido.parser.parser.model.complex.actor.ActorInRoleComplexType;
import ro.webdata.lido.parser.parser.model.element.leaf.actor.Actor;
import ro.webdata.lido.parser.parser.model.element.leaf.actor.AttributionQualifierActor;
import ro.webdata.lido.parser.parser.model.element.leaf.actor.ExtentActor;
import ro.webdata.lido.parser.parser.model.element.leaf.actor.RoleActor;
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
