package app.java.parser.dao.impl.element.leaf.object;

import app.java.parser.dao.complex.TextComplexTypeDAO;
import app.java.parser.dao.element.leaf.object.DisplayObjectDAO;
import app.java.parser.dao.impl.complex.TextComplexTypeDAOImpl;
import app.java.parser.model.element.leaf.object.DisplayObject;
import org.w3c.dom.Node;

public class DisplayObjectDAOImpl implements DisplayObjectDAO {
    private static TextComplexTypeDAO textComplexTypeDAO = new TextComplexTypeDAOImpl();

    public DisplayObject getDisplayObject(Node node) {
        return new DisplayObject(textComplexTypeDAO.getTextComplexType(node));
    }
}
