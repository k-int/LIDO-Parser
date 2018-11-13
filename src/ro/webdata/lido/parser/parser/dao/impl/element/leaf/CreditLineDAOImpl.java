package ro.webdata.lido.parser.parser.dao.impl.element.leaf;

import ro.webdata.lido.parser.parser.dao.complex.TextComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.CreditLineDAO;
import ro.webdata.lido.parser.parser.dao.impl.complex.TextComplexTypeDAOImpl;
import ro.webdata.lido.parser.parser.model.element.leaf.CreditLine;
import org.w3c.dom.Node;

public class CreditLineDAOImpl implements CreditLineDAO {
    private static TextComplexTypeDAO textComplexTypeDAO = new TextComplexTypeDAOImpl();

    public CreditLine getCreditLine(Node node) {
        return new CreditLine(textComplexTypeDAO.getTextComplexType(node));
    }
}
