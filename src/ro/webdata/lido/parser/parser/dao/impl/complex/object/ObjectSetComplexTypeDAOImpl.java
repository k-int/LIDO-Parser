package ro.webdata.lido.parser.parser.dao.impl.complex.object;

import ro.webdata.lido.parser.parser.dao.complex.object.ObjectSetComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.object.DisplayObjectDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.object.ObjectDAO;
import ro.webdata.lido.parser.parser.dao.impl.element.leaf.object.DisplayObjectDAOImpl;
import ro.webdata.lido.parser.parser.dao.impl.element.leaf.object.ObjectDAOImpl;
import ro.webdata.lido.parser.parser.model.complex.object.ObjectSetComplexType;
import ro.webdata.lido.parser.parser.model.element.leaf.object.DisplayObject;
import ro.webdata.lido.parser.parser.model.element.leaf.object.Object;
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
