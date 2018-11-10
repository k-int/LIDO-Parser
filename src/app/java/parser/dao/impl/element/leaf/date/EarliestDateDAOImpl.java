package app.java.parser.dao.impl.element.leaf.date;

import app.java.parser.dao.element.leaf.date.EarliestDateDAO;
import app.java.parser.dao.element.leaf.date.GenericDateDAO;
import app.java.parser.model.element.leaf.date.EarliestDate;
import org.w3c.dom.Node;

public class EarliestDateDAOImpl implements EarliestDateDAO {
    private static GenericDateDAO genericDateDAO = new GenericDateDAOImpl();

    public EarliestDate getEarliestDate(Node node) {
        return new EarliestDate(genericDateDAO.getGenericDate(node));
    }
}
