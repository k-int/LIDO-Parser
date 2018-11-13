package ro.webdata.lido.parser.parser.dao.impl.complex.actor;

import ro.webdata.lido.parser.common.Utils;
import ro.webdata.lido.parser.parser.dao.complex.actor.ActorComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.actor.ActorIDDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.actor.GenderActorDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.actor.NationalityActorDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.actor.VitalDatesActorDAO;
import ro.webdata.lido.parser.parser.dao.element.set.NameActorSetDAO;
import ro.webdata.lido.parser.parser.dao.impl.element.leaf.actor.ActorIDDAOImpl;
import ro.webdata.lido.parser.parser.dao.impl.element.leaf.actor.GenderActorDAOImpl;
import ro.webdata.lido.parser.parser.dao.impl.element.leaf.actor.NationalityActorDAOImpl;
import ro.webdata.lido.parser.parser.dao.impl.element.leaf.actor.VitalDatesActorDAOImpl;
import ro.webdata.lido.parser.parser.dao.impl.element.set.NameActorSetDAOImpl;
import ro.webdata.lido.parser.parser.model.attribute.lido.LidoType;
import ro.webdata.lido.parser.parser.model.complex.actor.ActorComplexType;
import ro.webdata.lido.parser.parser.model.element.leaf.actor.ActorID;
import ro.webdata.lido.parser.parser.model.element.leaf.actor.GenderActor;
import ro.webdata.lido.parser.parser.model.element.leaf.actor.NationalityActor;
import ro.webdata.lido.parser.parser.model.element.leaf.actor.VitalDatesActor;
import ro.webdata.lido.parser.parser.model.element.set.NameActorSet;
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
