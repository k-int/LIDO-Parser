package ro.webdata.lido.parser.parser.dao.impl.element.leaf.date;

import ro.webdata.lido.parser.parser.dao.complex.date.DateComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.date.DateDAO;
import ro.webdata.lido.parser.parser.dao.impl.complex.date.DateComplexTypeDAOImpl;
import ro.webdata.lido.parser.parser.model.element.leaf.date.Date;
import org.w3c.dom.Node;

public class DateDAOImpl implements DateDAO {
    private static DateComplexTypeDAO dateComplexTypeDAO = new DateComplexTypeDAOImpl();

    public Date getDate(Node node) {
        return new Date(dateComplexTypeDAO.getDateComplexType(node));
    }
}
