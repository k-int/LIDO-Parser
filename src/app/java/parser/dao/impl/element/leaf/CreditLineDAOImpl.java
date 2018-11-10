package app.java.parser.dao.impl.element.leaf;

import app.java.parser.dao.complex.TextComplexTypeDAO;
import app.java.parser.dao.element.leaf.CreditLineDAO;
import app.java.parser.dao.impl.complex.TextComplexTypeDAOImpl;
import app.java.parser.model.element.leaf.CreditLine;
import org.w3c.dom.Node;

public class CreditLineDAOImpl implements CreditLineDAO {
    private static TextComplexTypeDAO textComplexTypeDAO = new TextComplexTypeDAOImpl();

    public CreditLine getCreditLine(Node node) {
        return new CreditLine(textComplexTypeDAO.getTextComplexType(node));
    }
}
