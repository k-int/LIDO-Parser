package ro.webdata.lido.parser.parser.dao.impl.element.wrap;

import ro.webdata.lido.parser.parser.dao.element.set.EventSetDAO;
import ro.webdata.lido.parser.parser.dao.element.wrap.EventWrapDAO;
import ro.webdata.lido.parser.parser.dao.impl.element.set.EventSetDAOImpl;
import ro.webdata.lido.parser.parser.model.element.set.EventSet;
import ro.webdata.lido.parser.parser.model.element.wrap.EventWrap;
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
