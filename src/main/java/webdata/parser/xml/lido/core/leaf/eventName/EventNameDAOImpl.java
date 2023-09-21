package webdata.parser.xml.lido.core.leaf.eventName;

import org.w3c.dom.Node;
import ro.webdata.parser.xml.lido.core.complex.appellationComplexType.AppellationComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.appellationComplexType.AppellationComplexTypeDAOImpl;

public class EventNameDAOImpl implements EventNameDAO {
    private static AppellationComplexTypeDAO appellationComplexTypeDAO = new AppellationComplexTypeDAOImpl();

    public EventName getEventName(Node node) {
        return new EventName(appellationComplexTypeDAO.getAppellationComplexType(node));
    }
}
