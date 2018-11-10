package app.java.parser.dao.impl.element.wrap;

import app.java.parser.dao.element.set.EventSetDAO;
import app.java.parser.dao.element.wrap.EventWrapDAO;
import app.java.parser.dao.impl.element.set.EventSetDAOImpl;
import app.java.parser.model.element.set.EventSet;
import app.java.parser.model.element.wrap.EventWrap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.ArrayList;

public class EventWrapDAOImpl implements EventWrapDAO {
    private static EventSetDAO eventSetParser = new EventSetDAOImpl();

    public EventWrap getEventWrap(Node node) {
        ArrayList<EventSet> eventSetList = new ArrayList<EventSet>();
        NodeList childNodeList = node.getChildNodes();

        for (int i = 0; i < childNodeList.getLength(); i++) {
            Node child = childNodeList.item(i);
            String childName = child.getNodeName();

            if (childName.equals("lido:classification")) {
                eventSetList.add(eventSetParser.getEventSet(child));
            }
        }

        return new EventWrap(eventSetList);
    }
}
