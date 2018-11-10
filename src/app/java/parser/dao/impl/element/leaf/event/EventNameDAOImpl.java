package app.java.parser.dao.impl.element.leaf.event;

import app.java.parser.dao.complex.AppellationComplexTypeDAO;
import app.java.parser.dao.element.leaf.event.EventNameDAO;
import app.java.parser.dao.impl.complex.AppellationComplexTypeDAOImpl;
import app.java.parser.model.element.leaf.event.EventName;
import org.w3c.dom.Node;

public class EventNameDAOImpl implements EventNameDAO {
    private static AppellationComplexTypeDAO appellationComplexTypeDAO = new AppellationComplexTypeDAOImpl();

    public EventName getEventName(Node node) {
        return new EventName(appellationComplexTypeDAO.getAppellationComplexType(node));
    }
}
