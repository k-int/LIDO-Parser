package webdata.parser.xml.lido.core.leaf.displayObject;

import org.w3c.dom.Node;
import ro.webdata.parser.xml.lido.core.complex.textComplexType.TextComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.textComplexType.TextComplexTypeDAOImpl;

public class DisplayObjectDAOImpl implements DisplayObjectDAO {
    private static TextComplexTypeDAO textComplexTypeDAO = new TextComplexTypeDAOImpl();

    public DisplayObject getDisplayObject(Node node) {
        return new DisplayObject(textComplexTypeDAO.getTextComplexType(node));
    }
}
