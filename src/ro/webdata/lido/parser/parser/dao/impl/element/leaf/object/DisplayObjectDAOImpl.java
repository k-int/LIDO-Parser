package ro.webdata.lido.parser.parser.dao.impl.element.leaf.object;

import ro.webdata.lido.parser.parser.dao.complex.TextComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.object.DisplayObjectDAO;
import ro.webdata.lido.parser.parser.dao.impl.complex.TextComplexTypeDAOImpl;
import ro.webdata.lido.parser.parser.model.element.leaf.object.DisplayObject;
import org.w3c.dom.Node;

public class DisplayObjectDAOImpl implements DisplayObjectDAO {
    private static TextComplexTypeDAO textComplexTypeDAO = new TextComplexTypeDAOImpl();

    public DisplayObject getDisplayObject(Node node) {
        return new DisplayObject(textComplexTypeDAO.getTextComplexType(node));
    }
}
