package ro.webdata.lido.parser.parser.dao.impl.element.wrap;

import ro.webdata.lido.parser.parser.dao.element.leaf.object.ObjectWorkTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.wrap.ObjectWorkTypeWrapDAO;
import ro.webdata.lido.parser.parser.dao.impl.element.leaf.object.ObjectWorkTypeDAOImpl;
import ro.webdata.lido.parser.parser.model.element.leaf.object.ObjectWorkType;
import ro.webdata.lido.parser.parser.model.element.wrap.ObjectWorkTypeWrap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.ArrayList;

public class ObjectWorkTypeWrapDAOImpl implements ObjectWorkTypeWrapDAO {
    private static ObjectWorkTypeDAO objectWorkTypeParser = new ObjectWorkTypeDAOImpl();

    public ObjectWorkTypeWrap getObjectWorkTypeWrap(Node node) {
        ArrayList<ObjectWorkType> objectWorkTypeList = new ArrayList<ObjectWorkType>();
        NodeList childNodeList = node.getChildNodes();

        for (int i = 0; i < childNodeList.getLength(); i++) {
            Node child = childNodeList.item(i);
            String childNodeName = child.getNodeName();

            if (childNodeName.equals("lido:objectWorkType")) {
                objectWorkTypeList.add(objectWorkTypeParser.getObjectWorkType(child));
            }
        }

        return new ObjectWorkTypeWrap(objectWorkTypeList);
    }
}
