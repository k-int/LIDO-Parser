package ro.webdata.lido.parser.core.leaf.rightsDate;

import ro.webdata.lido.parser.core.complex.dateComplexType.DateComplexTypeDAO;
import ro.webdata.lido.parser.core.complex.dateComplexType.DateComplexTypeDAOImpl;
import org.w3c.dom.Node;

public class RightsDateDAOImpl implements RightsDateDAO {
    private static DateComplexTypeDAO dateComplexTypeDAO = new DateComplexTypeDAOImpl();

    public RightsDate getRightsDate(Node node) {
        return new RightsDate(dateComplexTypeDAO.getDateComplexType(node));
    }
}
