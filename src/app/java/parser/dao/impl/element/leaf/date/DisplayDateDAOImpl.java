package app.java.parser.dao.impl.element.leaf.date;

import app.java.parser.dao.complex.TextComplexTypeDAO;
import app.java.parser.dao.element.leaf.date.DisplayDateDAO;
import app.java.parser.dao.impl.complex.TextComplexTypeDAOImpl;
import app.java.parser.model.element.leaf.date.DisplayDate;
import org.w3c.dom.Node;

public class DisplayDateDAOImpl implements DisplayDateDAO {
    private static TextComplexTypeDAO textComplexTypeDAO = new TextComplexTypeDAOImpl();

    public DisplayDate getDisplayDate(Node node) {
        return new DisplayDate(textComplexTypeDAO.getTextComplexType(node));
    }
}
