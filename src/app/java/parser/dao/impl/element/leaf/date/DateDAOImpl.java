package app.java.parser.dao.impl.element.leaf.date;

import app.java.parser.dao.complex.date.DateComplexTypeDAO;
import app.java.parser.dao.element.leaf.date.DateDAO;
import app.java.parser.dao.impl.complex.date.DateComplexTypeDAOImpl;
import app.java.parser.model.element.leaf.date.Date;
import org.w3c.dom.Node;

public class DateDAOImpl implements DateDAO {
    private static DateComplexTypeDAO dateComplexTypeDAO = new DateComplexTypeDAOImpl();

    public Date getDate(Node node) {
        return new Date(dateComplexTypeDAO.getDateComplexType(node));
    }
}
