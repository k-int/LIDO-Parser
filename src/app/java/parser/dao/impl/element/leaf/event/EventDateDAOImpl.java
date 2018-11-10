package app.java.parser.dao.impl.element.leaf.event;

import app.java.parser.dao.complex.date.DateSetComplexTypeDAO;
import app.java.parser.dao.element.leaf.event.EventDateDAO;
import app.java.parser.dao.impl.complex.date.DateSetComplexTypeDAOImpl;
import app.java.parser.model.element.leaf.event.EventDate;
import org.w3c.dom.Node;

public class EventDateDAOImpl implements EventDateDAO {
    private DateSetComplexTypeDAO dateSetComplexTypeDAO = new DateSetComplexTypeDAOImpl();

    public EventDate getDisplayEvent(Node node) {
        return new EventDate(dateSetComplexTypeDAO.getDateSetComplexTypeParser(node));
    }
}
