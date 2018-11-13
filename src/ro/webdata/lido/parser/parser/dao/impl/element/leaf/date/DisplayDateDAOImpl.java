package ro.webdata.lido.parser.parser.dao.impl.element.leaf.date;

import ro.webdata.lido.parser.parser.dao.complex.TextComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.date.DisplayDateDAO;
import ro.webdata.lido.parser.parser.dao.impl.complex.TextComplexTypeDAOImpl;
import ro.webdata.lido.parser.parser.model.element.leaf.date.DisplayDate;
import org.w3c.dom.Node;

public class DisplayDateDAOImpl implements DisplayDateDAO {
    private static TextComplexTypeDAO textComplexTypeDAO = new TextComplexTypeDAOImpl();

    public DisplayDate getDisplayDate(Node node) {
        return new DisplayDate(textComplexTypeDAO.getTextComplexType(node));
    }
}
