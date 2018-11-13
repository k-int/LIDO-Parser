package ro.webdata.lido.parser.parser.dao.impl.element.leaf.event;

import ro.webdata.lido.parser.parser.dao.complex.AppellationComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.event.EventNameDAO;
import ro.webdata.lido.parser.parser.dao.impl.complex.AppellationComplexTypeDAOImpl;
import ro.webdata.lido.parser.parser.model.element.leaf.event.EventName;
import org.w3c.dom.Node;

public class EventNameDAOImpl implements EventNameDAO {
    private static AppellationComplexTypeDAO appellationComplexTypeDAO = new AppellationComplexTypeDAOImpl();

    public EventName getEventName(Node node) {
        return new EventName(appellationComplexTypeDAO.getAppellationComplexType(node));
    }
}
