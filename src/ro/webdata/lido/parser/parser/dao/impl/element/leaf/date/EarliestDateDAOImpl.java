package ro.webdata.lido.parser.parser.dao.impl.element.leaf.date;

import ro.webdata.lido.parser.parser.dao.element.leaf.date.EarliestDateDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.date.GenericDateDAO;
import ro.webdata.lido.parser.parser.model.element.leaf.date.EarliestDate;
import org.w3c.dom.Node;

public class EarliestDateDAOImpl implements EarliestDateDAO {
    private static GenericDateDAO genericDateDAO = new GenericDateDAOImpl();

    public EarliestDate getEarliestDate(Node node) {
        return new EarliestDate(genericDateDAO.getGenericDate(node));
    }
}
