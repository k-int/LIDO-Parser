package ro.webdata.lido.parser.core.leaf.latestDate;

import org.w3c.dom.Node;
import ro.webdata.lido.parser.core.leaf.genericDate.GenericDateDAO;
import ro.webdata.lido.parser.core.leaf.genericDate.GenericDateDAOImpl;

public class LatestDateDAOImpl implements LatestDateDAO {
    private static GenericDateDAO genericDateDAO = new GenericDateDAOImpl();

    public LatestDate getLatestDate(Node node) {
        return new LatestDate(genericDateDAO.getGenericDate(node));
    }
}
