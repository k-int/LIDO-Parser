package app.java.parser.dao.impl.complex.object;

import app.java.parser.dao.complex.object.ObjectSetComplexTypeDAO;
import app.java.parser.dao.element.leaf.object.DisplayObjectDAO;
import app.java.parser.dao.element.leaf.object.ObjectDAO;
import app.java.parser.dao.impl.element.leaf.object.DisplayObjectDAOImpl;
import app.java.parser.dao.impl.element.leaf.object.ObjectDAOImpl;
import app.java.parser.model.complex.object.ObjectSetComplexType;
import app.java.parser.model.element.leaf.object.DisplayObject;
import app.java.parser.model.element.leaf.object.Object;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.ArrayList;

public class ObjectSetComplexTypeDAOImpl implements ObjectSetComplexTypeDAO {
    private static DisplayObjectDAO displayObjectParser = new DisplayObjectDAOImpl();
    private static ObjectDAO objectParser = new ObjectDAOImpl();

    public ObjectSetComplexType getObjectSetComplexType(Node node) {
        ArrayList<DisplayObject> displayObjectList = new ArrayList<DisplayObject>();
        Object object = null;

        NodeList childNodeList = node.getChildNodes();
        for (int i = 0; i < childNodeList.getLength(); i++) {
            Node child = childNodeList.item(i);
            String childName = child.getNodeName();

            switch (childName) {
                case "lido:displayObject":
                    displayObjectList.add(displayObjectParser.getDisplayObject(child));
                    break;
                case "lido:object":
                    object = objectParser.getObject(child);
                    break;
                default: break;
            }
        }

        return new ObjectSetComplexType(displayObjectList, object);
    }
}
