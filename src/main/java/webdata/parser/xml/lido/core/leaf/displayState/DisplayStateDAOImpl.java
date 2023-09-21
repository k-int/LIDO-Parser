package webdata.parser.xml.lido.core.leaf.displayState;

import org.w3c.dom.Node;
import ro.webdata.parser.xml.lido.core.complex.textComplexType.TextComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.textComplexType.TextComplexTypeDAOImpl;

public class DisplayStateDAOImpl implements DisplayStateDAO {
    private static TextComplexTypeDAO textComplexTypeDAO = new TextComplexTypeDAOImpl();

    public DisplayState getDisplayState(Node node) {
        return new DisplayState(textComplexTypeDAO.getTextComplexType(node));
    }
}
