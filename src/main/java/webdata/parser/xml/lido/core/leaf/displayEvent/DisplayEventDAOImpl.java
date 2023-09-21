package webdata.parser.xml.lido.core.leaf.displayEvent;

import org.w3c.dom.Node;
import ro.webdata.parser.xml.lido.core.complex.textComplexType.TextComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.textComplexType.TextComplexTypeDAOImpl;

public class DisplayEventDAOImpl implements DisplayEventDAO {
    private TextComplexTypeDAO textComplexTypeDAO = new TextComplexTypeDAOImpl();

    public DisplayEvent getDisplayEvent(Node node) {
        return new DisplayEvent(textComplexTypeDAO.getTextComplexType(node));
    }
}
