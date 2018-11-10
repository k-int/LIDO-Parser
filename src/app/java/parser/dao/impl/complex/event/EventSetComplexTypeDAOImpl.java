package app.java.parser.dao.impl.complex.event;

import app.java.parser.dao.complex.event.EventSetComplexTypeDAO;
import app.java.parser.dao.element.leaf.event.DisplayEventDAO;
import app.java.parser.dao.element.leaf.event.EventDAO;
import app.java.parser.dao.impl.element.leaf.event.DisplayEventDAOImpl;
import app.java.parser.dao.impl.element.leaf.event.EventDAOImpl;
import app.java.parser.model.complex.event.EventSetComplexType;
import app.java.parser.model.element.leaf.event.DisplayEvent;
import app.java.parser.model.element.leaf.event.Event;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.ArrayList;

public class EventSetComplexTypeDAOImpl implements EventSetComplexTypeDAO {
    private static DisplayEventDAO displayEventParser = new DisplayEventDAOImpl();
    private static EventDAO eventParser = new EventDAOImpl();

    public EventSetComplexType getEventSetComplexType(Node node) {
        ArrayList<DisplayEvent> displayEventList = new ArrayList<DisplayEvent>();
        Event event = new Event();

        NodeList childNodeList = node.getChildNodes();
        for (int i = 0; i < childNodeList.getLength(); i++) {
            Node child = childNodeList.item(i);
            String childName = child.getNodeName();

            switch (childName) {
                case "lido:displayEvent":
                    displayEventList.add(displayEventParser.getDisplayEvent(child));
                    break;
                case "lido:event":
                    event = eventParser.getDisplayEvent(child);
                    break;
                default: break;
            }
        }

        return new EventSetComplexType(displayEventList, event);
    }
}
