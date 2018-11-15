package ro.webdata.lido.parser.core.leaf.displayState;

import ro.webdata.lido.parser.core.complex.textComplexType.TextComplexTypeDAO;
import ro.webdata.lido.parser.core.complex.textComplexType.TextComplexTypeDAOImpl;
import org.w3c.dom.Node;

public class DisplayStateDAOImpl implements DisplayStateDAO {
    private static TextComplexTypeDAO textComplexTypeDAO = new TextComplexTypeDAOImpl();

    public DisplayState getDisplayState(Node node) {
        return new DisplayState(textComplexTypeDAO.getTextComplexType(node));
    }
}
