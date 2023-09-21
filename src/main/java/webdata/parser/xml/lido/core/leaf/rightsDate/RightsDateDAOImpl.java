package webdata.parser.xml.lido.core.leaf.rightsDate;

import org.w3c.dom.Node;
import ro.webdata.parser.xml.lido.core.complex.dateComplexType.DateComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.dateComplexType.DateComplexTypeDAOImpl;

public class RightsDateDAOImpl implements RightsDateDAO {
    private static DateComplexTypeDAO dateComplexTypeDAO = new DateComplexTypeDAOImpl();

    public RightsDate getRightsDate(Node node) {
        return new RightsDate(dateComplexTypeDAO.getDateComplexType(node));
    }
}
