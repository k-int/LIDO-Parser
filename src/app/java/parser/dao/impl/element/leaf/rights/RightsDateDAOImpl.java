package app.java.parser.dao.impl.element.leaf.rights;

import app.java.parser.dao.complex.date.DateComplexTypeDAO;
import app.java.parser.dao.element.leaf.rights.RightsDateDAO;
import app.java.parser.dao.impl.complex.date.DateComplexTypeDAOImpl;
import app.java.parser.model.element.leaf.rights.RightsDate;
import org.w3c.dom.Node;

public class RightsDateDAOImpl implements RightsDateDAO {
    private static DateComplexTypeDAO dateComplexTypeDAO = new DateComplexTypeDAOImpl();

    public RightsDate getRightsDate(Node node) {
        return new RightsDate(dateComplexTypeDAO.getDateComplexType(node));
    }
}
