package app.java.parser.dao.impl.element.leaf.date;

import app.java.parser.dao.element.leaf.date.GenericDateDAO;
import app.java.parser.dao.element.leaf.date.LatestDateDAO;
import app.java.parser.model.element.leaf.date.LatestDate;
import org.w3c.dom.Node;

public class LatestDateDAOImpl implements LatestDateDAO {
    private static GenericDateDAO genericDateDAO = new GenericDateDAOImpl();

    public LatestDate getLatestDate(Node node) {
        return new LatestDate(genericDateDAO.getGenericDate(node));
    }
}
