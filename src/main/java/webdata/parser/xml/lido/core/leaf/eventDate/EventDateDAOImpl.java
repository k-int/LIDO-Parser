package webdata.parser.xml.lido.core.leaf.eventDate;

import org.w3c.dom.Node;
import ro.webdata.parser.xml.lido.core.complex.dateSetComplexType.DateSetComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.dateSetComplexType.DateSetComplexTypeDAOImpl;

public class EventDateDAOImpl implements EventDateDAO {
    private DateSetComplexTypeDAO dateSetComplexTypeDAO = new DateSetComplexTypeDAOImpl();

    public EventDate getDisplayEvent(Node node) {
        return new EventDate(dateSetComplexTypeDAO.getDateSetComplexTypeParser(node));
    }
}
