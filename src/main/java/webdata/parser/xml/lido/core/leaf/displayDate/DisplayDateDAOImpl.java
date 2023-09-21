package webdata.parser.xml.lido.core.leaf.displayDate;

import org.w3c.dom.Node;
import ro.webdata.parser.xml.lido.core.complex.textComplexType.TextComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.textComplexType.TextComplexTypeDAOImpl;

public class DisplayDateDAOImpl implements DisplayDateDAO {
    private static TextComplexTypeDAO textComplexTypeDAO = new TextComplexTypeDAOImpl();

    public DisplayDate getDisplayDate(Node node) {
        return new DisplayDate(textComplexTypeDAO.getTextComplexType(node));
    }
}
