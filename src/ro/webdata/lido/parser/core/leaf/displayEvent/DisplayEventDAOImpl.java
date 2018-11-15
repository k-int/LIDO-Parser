package ro.webdata.lido.parser.core.leaf.displayEvent;

import ro.webdata.lido.parser.core.complex.textComplexType.TextComplexTypeDAO;
import ro.webdata.lido.parser.core.complex.textComplexType.TextComplexTypeDAOImpl;
import org.w3c.dom.Node;

public class DisplayEventDAOImpl implements DisplayEventDAO {
    private TextComplexTypeDAO textComplexTypeDAO = new TextComplexTypeDAOImpl();

    public DisplayEvent getDisplayEvent(Node node) {
        return new DisplayEvent(textComplexTypeDAO.getTextComplexType(node));
    }
}
