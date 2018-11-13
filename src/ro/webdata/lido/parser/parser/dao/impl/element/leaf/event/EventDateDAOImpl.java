package ro.webdata.lido.parser.parser.dao.impl.element.leaf.event;

import ro.webdata.lido.parser.parser.dao.complex.date.DateSetComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.event.EventDateDAO;
import ro.webdata.lido.parser.parser.dao.impl.complex.date.DateSetComplexTypeDAOImpl;
import ro.webdata.lido.parser.parser.model.element.leaf.event.EventDate;
import org.w3c.dom.Node;

public class EventDateDAOImpl implements EventDateDAO {
    private DateSetComplexTypeDAO dateSetComplexTypeDAO = new DateSetComplexTypeDAOImpl();

    public EventDate getDisplayEvent(Node node) {
        return new EventDate(dateSetComplexTypeDAO.getDateSetComplexTypeParser(node));
    }
}
