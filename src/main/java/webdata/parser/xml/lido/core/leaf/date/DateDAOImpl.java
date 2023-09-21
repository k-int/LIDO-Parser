package webdata.parser.xml.lido.core.leaf.date;

import org.w3c.dom.Node;
import ro.webdata.parser.xml.lido.core.complex.dateComplexType.DateComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.dateComplexType.DateComplexTypeDAOImpl;

public class DateDAOImpl implements DateDAO {
    private static DateComplexTypeDAO dateComplexTypeDAO = new DateComplexTypeDAOImpl();

    public Date getDate(Node node) {
        return new Date(dateComplexTypeDAO.getDateComplexType(node));
    }
}
