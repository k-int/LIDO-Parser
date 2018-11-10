package app.java.parser.dao.impl.complex.actor;

import app.java.common.Utils;
import app.java.parser.dao.complex.actor.ActorComplexTypeDAO;
import app.java.parser.dao.element.leaf.actor.ActorIDDAO;
import app.java.parser.dao.element.leaf.actor.GenderActorDAO;
import app.java.parser.dao.element.leaf.actor.NationalityActorDAO;
import app.java.parser.dao.element.leaf.actor.VitalDatesActorDAO;
import app.java.parser.dao.element.set.NameActorSetDAO;
import app.java.parser.dao.impl.element.leaf.actor.ActorIDDAOImpl;
import app.java.parser.dao.impl.element.leaf.actor.GenderActorDAOImpl;
import app.java.parser.dao.impl.element.leaf.actor.NationalityActorDAOImpl;
import app.java.parser.dao.impl.element.leaf.actor.VitalDatesActorDAOImpl;
import app.java.parser.dao.impl.element.set.NameActorSetDAOImpl;
import app.java.parser.model.attribute.lido.LidoType;
import app.java.parser.model.complex.actor.ActorComplexType;
import app.java.parser.model.element.leaf.actor.ActorID;
import app.java.parser.model.element.leaf.actor.GenderActor;
import app.java.parser.model.element.leaf.actor.NationalityActor;
import app.java.parser.model.element.leaf.actor.VitalDatesActor;
import app.java.parser.model.element.set.NameActorSet;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.ArrayList;
import java.util.HashMap;

public class ActorComplexTypeDAOImpl implements ActorComplexTypeDAO {
    private static ActorIDDAO actorIDParser = new ActorIDDAOImpl();
    private static NameActorSetDAO nameActorSetParser = new NameActorSetDAOImpl();
    private static NationalityActorDAO nationalityActorParser = new NationalityActorDAOImpl();
    private static VitalDatesActorDAO vitalDatesActorParser = new VitalDatesActorDAOImpl();
    private static GenderActorDAO genderActorParser = new GenderActorDAOImpl();
    private static Utils utils = new Utils();

    public ActorComplexType getActorComplexType(Node node) {
        ArrayList<ActorID> actorIDList = new ArrayList<ActorID>();
        ArrayList<NameActorSet> nameActorSetList = new ArrayList<NameActorSet>();
        ArrayList<NationalityActor> nationalityActorList = new ArrayList<NationalityActor>();
        VitalDatesActor vitalDatesActor = null;
        ArrayList<GenderActor> genderActorList = new ArrayList<GenderActor>();
        HashMap<String, String> attributes = utils.getAttributes(node);

        NodeList childNodeList = node.getChildNodes();
        for (int i = 0; i < childNodeList.getLength(); i++) {
            Node child = childNodeList.item(i);
            String childName = child.getNodeName();

            switch (childName) {
                case "lido:actorID":
                    actorIDList.add(actorIDParser.getActorID(child));
                    break;
                case "lido:nameActorSet":
                    nameActorSetList.add(nameActorSetParser.getNameActorSet(child));
                    break;
                case "lido:nationalityActor":
                    nationalityActorList.add(nationalityActorParser.getNationalityActor(child));
                    break;
                case "lido:vitalDatesActor":
                    vitalDatesActor = vitalDatesActorParser.getVitalDatesActor(child);
                    break;
                case "lido:genderActor":
                    genderActorList.add(genderActorParser.getGenderActor(child));
                    break;
                default: break;
            }
        }

        return new ActorComplexType(
                actorIDList, nameActorSetList, nationalityActorList,
                vitalDatesActor, genderActorList,
                new LidoType(attributes.get("lido:type"))
        );
    }
}
