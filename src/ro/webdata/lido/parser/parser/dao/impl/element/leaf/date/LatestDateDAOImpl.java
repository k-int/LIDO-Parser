package ro.webdata.lido.parser.parser.dao.impl.element.leaf.date;

import ro.webdata.lido.parser.parser.dao.element.leaf.date.GenericDateDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.date.LatestDateDAO;
import ro.webdata.lido.parser.parser.model.element.leaf.date.LatestDate;
import org.w3c.dom.Node;

public class LatestDateDAOImpl implements LatestDateDAO {
    private static GenericDateDAO genericDateDAO = new GenericDateDAOImpl();

    public LatestDate getLatestDate(Node node) {
        return new LatestDate(genericDateDAO.getGenericDate(node));
    }
}
