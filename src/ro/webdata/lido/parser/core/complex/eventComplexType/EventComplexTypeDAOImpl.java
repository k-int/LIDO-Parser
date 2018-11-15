package ro.webdata.lido.parser.core.complex.eventComplexType;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import ro.webdata.lido.parser.core.set.eventDescriptionSet.EventDescriptionSetDAO;
import ro.webdata.lido.parser.core.set.relatedEventSet.RelatedEventSetDAO;
import ro.webdata.lido.parser.core.set.eventDescriptionSet.EventDescriptionSetDAOImpl;
import ro.webdata.lido.parser.core.set.relatedEventSet.RelatedEventSetDAOImpl;
import ro.webdata.lido.parser.core.set.eventDescriptionSet.EventDescriptionSet;
import ro.webdata.lido.parser.core.set.relatedEventSet.RelatedEventSet;
import ro.webdata.lido.parser.core.leaf.culture.Culture;
import ro.webdata.lido.parser.core.leaf.culture.CultureDAO;
import ro.webdata.lido.parser.core.leaf.culture.CultureDAOImpl;
import ro.webdata.lido.parser.core.leaf.eventActor.EventActor;
import ro.webdata.lido.parser.core.leaf.eventActor.EventActorDAO;
import ro.webdata.lido.parser.core.leaf.eventActor.EventActorDAOImpl;
import ro.webdata.lido.parser.core.leaf.eventDate.EventDate;
import ro.webdata.lido.parser.core.leaf.eventDate.EventDateDAO;
import ro.webdata.lido.parser.core.leaf.eventDate.EventDateDAOImpl;
import ro.webdata.lido.parser.core.leaf.eventID.EventID;
import ro.webdata.lido.parser.core.leaf.eventID.EventIDDAO;
import ro.webdata.lido.parser.core.leaf.eventID.EventIDDAOImpl;
import ro.webdata.lido.parser.core.leaf.eventMaterialsTech.EventMaterialsTech;
import ro.webdata.lido.parser.core.leaf.eventMaterialsTech.EventMaterialsTechDAO;
import ro.webdata.lido.parser.core.leaf.eventMaterialsTech.EventMaterialsTechDAOImpl;
import ro.webdata.lido.parser.core.leaf.eventMethod.EventMethod;
import ro.webdata.lido.parser.core.leaf.eventMethod.EventMethodDAO;
import ro.webdata.lido.parser.core.leaf.eventMethod.EventMethodDAOImpl;
import ro.webdata.lido.parser.core.leaf.eventName.EventName;
import ro.webdata.lido.parser.core.leaf.eventName.EventNameDAO;
import ro.webdata.lido.parser.core.leaf.eventName.EventNameDAOImpl;
import ro.webdata.lido.parser.core.leaf.eventPlace.EventPlace;
import ro.webdata.lido.parser.core.leaf.eventPlace.EventPlaceDAO;
import ro.webdata.lido.parser.core.leaf.eventPlace.EventPlaceDAOImpl;
import ro.webdata.lido.parser.core.leaf.eventType.EventType;
import ro.webdata.lido.parser.core.leaf.eventType.EventTypeDAO;
import ro.webdata.lido.parser.core.leaf.eventType.EventTypeDAOImpl;
import ro.webdata.lido.parser.core.leaf.periodName.PeriodName;
import ro.webdata.lido.parser.core.leaf.periodName.PeriodNameDAO;
import ro.webdata.lido.parser.core.leaf.periodName.PeriodNameDAOImpl;
import ro.webdata.lido.parser.core.leaf.roleInEvent.RoleInEvent;
import ro.webdata.lido.parser.core.leaf.roleInEvent.RoleInEventDAO;
import ro.webdata.lido.parser.core.leaf.roleInEvent.RoleInEventDAOImpl;
import ro.webdata.lido.parser.core.leaf.thingPresent.ThingPresent;
import ro.webdata.lido.parser.core.leaf.thingPresent.ThingPresentDAO;
import ro.webdata.lido.parser.core.leaf.thingPresent.ThingPresentDAOImpl;

import java.util.ArrayList;

public class EventComplexTypeDAOImpl implements EventComplexTypeDAO {
    private static EventIDDAO eventIDParser = new EventIDDAOImpl();
    private static EventTypeDAO eventTypeParser = new EventTypeDAOImpl();
    private static RoleInEventDAO roleInEventParser = new RoleInEventDAOImpl();
    private static EventActorDAO eventActorParser = new EventActorDAOImpl();
    private static EventNameDAO eventNameParser = new EventNameDAOImpl();
    private static CultureDAO cultureParser = new CultureDAOImpl();
    private static EventDateDAO eventDateParser = new EventDateDAOImpl();
    private static PeriodNameDAO periodNameParser = new PeriodNameDAOImpl();
    private static EventPlaceDAO eventPlaceParser = new EventPlaceDAOImpl();
    private static EventMethodDAO eventMethodParser = new EventMethodDAOImpl();
    private static EventMaterialsTechDAO eventMaterialsTechParser = new EventMaterialsTechDAOImpl();
    private static ThingPresentDAO thingPresentParser = new ThingPresentDAOImpl();
    private static RelatedEventSetDAO relatedEventSetParser = new RelatedEventSetDAOImpl();
    private static EventDescriptionSetDAO eventDescriptionSetParser = new EventDescriptionSetDAOImpl();

    public EventComplexType getEventComplexType(Node node) {
        ArrayList<EventID> eventIDList = new ArrayList<EventID>();
        EventType eventType = null;
        ArrayList<RoleInEvent> roleInEventList = new ArrayList<RoleInEvent>();
        ArrayList<EventName> eventNameList = new ArrayList<EventName>();
        ArrayList<EventActor> eventActorList = new ArrayList<EventActor>();
        ArrayList<Culture> cultureList = new ArrayList<Culture>();
        EventDate eventDate = null;
        ArrayList<PeriodName> periodNameList = new ArrayList<PeriodName>();
        ArrayList<EventPlace> eventPlaceList = new ArrayList<EventPlace>();
        ArrayList<EventMethod> eventMethodList = new ArrayList<EventMethod>();
        ArrayList<EventMaterialsTech> eventMaterialsTechList = new ArrayList<EventMaterialsTech>();
        ArrayList<ThingPresent> thingPresentList = new ArrayList<ThingPresent>();
        ArrayList<RelatedEventSet> relatedEventSetList = new ArrayList<RelatedEventSet>();
        ArrayList<EventDescriptionSet> eventDescriptionSetList = new ArrayList<EventDescriptionSet>();

        NodeList childNodeList = node.getChildNodes();
        for (int i = 0; i < childNodeList.getLength(); i++) {
            Node child = childNodeList.item(i);
            String childName = child.getNodeName();

            switch (childName) {
                case "lido:eventID":
                    eventIDList.add(eventIDParser.getEventID(child));
                    break;
                case "lido:eventType":
                    eventType = eventTypeParser.getEventType(child);
                    break;
                case "lido:roleInEvent":
                    roleInEventList.add(roleInEventParser.getRoleInEvent(child));
                    break;
                case "lido:eventName":
                    eventNameList.add(eventNameParser.getEventName(child));
                    break;
                case "lido:eventActor":
                    eventActorList.add(eventActorParser.getEventActor(child));
                    break;
                case "lido:culture":
                    cultureList.add(cultureParser.getCulture(child));
                    break;
                case "lido:eventDate":
                    eventDate = eventDateParser.getDisplayEvent(child);
                    break;
                case "lido:periodName":
                    periodNameList.add(periodNameParser.getPeriodName(child));
                    break;
                case "lido:eventPlace":
                    eventPlaceList.add(eventPlaceParser.getEventPlace(child));
                    break;
                case "lido:eventMethod":
                    eventMethodList.add(eventMethodParser.getEventMethod(child));
                    break;
                case "lido:eventMaterialsTech":
                    eventMaterialsTechList.add(eventMaterialsTechParser.getEventMaterialsTech(child));
                    break;
                case "lido:thingPresent":
                    thingPresentList.add(thingPresentParser.getThingPresent(child));
                    break;
                case "lido:relatedEventSet":
                    relatedEventSetList.add(relatedEventSetParser.getRelatedEventSet(child));
                    break;
                case "lido:eventDescriptionSet":
                    eventDescriptionSetList.add(eventDescriptionSetParser.getEventDescriptionSet(child));
                    break;
                default: break;
            }
        }

        return new EventComplexType(
                eventIDList, eventType, roleInEventList, eventNameList,
                eventActorList, cultureList, eventDate, periodNameList,
                eventPlaceList, eventMethodList, eventMaterialsTechList,
                thingPresentList, relatedEventSetList, eventDescriptionSetList
        );
    }
}
