package ro.webdata.lido.parser.parser.dao.impl.complex.actor;

import ro.webdata.lido.parser.parser.dao.complex.actor.ActorSetComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.actor.ActorDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.actor.DisplayActorDAO;
import ro.webdata.lido.parser.parser.dao.impl.element.leaf.actor.ActorDAOImpl;
import ro.webdata.lido.parser.parser.dao.impl.element.leaf.actor.DisplayActorDAOImpl;
import ro.webdata.lido.parser.parser.model.complex.actor.ActorSetComplexType;
import ro.webdata.lido.parser.parser.model.element.leaf.actor.Actor;
import ro.webdata.lido.parser.parser.model.element.leaf.actor.DisplayActor;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.ArrayList;

public class ActorSetComplexTypeDAOImpl implements ActorSetComplexTypeDAO {
    private static DisplayActorDAO displayActorParser = new DisplayActorDAOImpl();
    private static ActorDAO actorParser = new ActorDAOImpl();

    public ActorSetComplexType getActorSetComplexType(Node node) {
        ArrayList<DisplayActor> displayActorList = new ArrayList<DisplayActor>();
        Actor actor = null;

        NodeList childNodeList = node.getChildNodes();
        for (int i = 0; i < childNodeList.getLength(); i++) {
            Node child = childNodeList.item(i);
            String childName = child.getNodeName();

            switch (childName) {
                case "lido:displayActor":
                    displayActorList.add(displayActorParser.getDisplayActor(child));
                    break;
                case "lido:actor":
                    actor = actorParser.getActor(child);
                    break;
                default: break;
            }
        }

        return new ActorSetComplexType(displayActorList, actor);
    }
}
