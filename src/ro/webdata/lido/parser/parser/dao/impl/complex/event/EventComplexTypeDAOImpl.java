package ro.webdata.lido.parser.parser.dao.impl.complex.event;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import ro.webdata.lido.parser.parser.dao.complex.event.EventComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.event.*;
import ro.webdata.lido.parser.parser.dao.element.set.EventDescriptionSetDAO;
import ro.webdata.lido.parser.parser.dao.element.set.RelatedEventSetDAO;
import ro.webdata.lido.parser.parser.dao.impl.element.leaf.event.*;
import ro.webdata.lido.parser.parser.dao.impl.element.set.EventDescriptionSetDAOImpl;
import ro.webdata.lido.parser.parser.dao.impl.element.set.RelatedEventSetDAOImpl;
import ro.webdata.lido.parser.parser.model.complex.event.EventComplexType;
import ro.webdata.lido.parser.parser.model.element.leaf.event.*;
import ro.webdata.lido.parser.parser.model.element.set.EventDescriptionSet;
import ro.webdata.lido.parser.parser.model.element.set.RelatedEventSet;

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
