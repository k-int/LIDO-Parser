package ro.webdata.lido.parser.parser.dao.impl.element.leaf.rights;

import ro.webdata.lido.parser.parser.dao.complex.date.DateComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.rights.RightsDateDAO;
import ro.webdata.lido.parser.parser.dao.impl.complex.date.DateComplexTypeDAOImpl;
import ro.webdata.lido.parser.parser.model.element.leaf.rights.RightsDate;
import org.w3c.dom.Node;

public class RightsDateDAOImpl implements RightsDateDAO {
    private static DateComplexTypeDAO dateComplexTypeDAO = new DateComplexTypeDAOImpl();

    public RightsDate getRightsDate(Node node) {
        return new RightsDate(dateComplexTypeDAO.getDateComplexType(node));
    }
}
