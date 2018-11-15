package ro.webdata.lido.parser.core.leaf.earliestDate;

import org.w3c.dom.Node;
import ro.webdata.lido.parser.core.leaf.genericDate.GenericDateDAO;
import ro.webdata.lido.parser.core.leaf.genericDate.GenericDateDAOImpl;

public class EarliestDateDAOImpl implements EarliestDateDAO {
    private static GenericDateDAO genericDateDAO = new GenericDateDAOImpl();

    public EarliestDate getEarliestDate(Node node) {
        return new EarliestDate(genericDateDAO.getGenericDate(node));
    }
}
