package ro.webdata.lido.parser.core.leaf.displayObject;

import ro.webdata.lido.parser.core.complex.textComplexType.TextComplexTypeDAO;
import ro.webdata.lido.parser.core.complex.textComplexType.TextComplexTypeDAOImpl;
import org.w3c.dom.Node;

public class DisplayObjectDAOImpl implements DisplayObjectDAO {
    private static TextComplexTypeDAO textComplexTypeDAO = new TextComplexTypeDAOImpl();

    public DisplayObject getDisplayObject(Node node) {
        return new DisplayObject(textComplexTypeDAO.getTextComplexType(node));
    }
}
