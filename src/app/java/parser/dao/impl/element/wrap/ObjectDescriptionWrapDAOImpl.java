package app.java.parser.dao.impl.element.wrap;

import app.java.parser.dao.element.set.ObjectDescriptionSetDAO;
import app.java.parser.dao.element.wrap.ObjectDescriptionWrapDAO;
import app.java.parser.dao.impl.element.set.ObjectDescriptionSetDAOImpl;
import app.java.parser.model.element.set.ObjectDescriptionSet;
import app.java.parser.model.element.wrap.ObjectDescriptionWrap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.ArrayList;

public class ObjectDescriptionWrapDAOImpl implements ObjectDescriptionWrapDAO {
    private static ObjectDescriptionSetDAO objectDescriptionSetParser = new ObjectDescriptionSetDAOImpl();

    public ObjectDescriptionWrap getObjectDescriptionWrap(Node node) {
        ArrayList<ObjectDescriptionSet> objectDescriptionSetList = new ArrayList<ObjectDescriptionSet>();
        NodeList childNodeList = node.getChildNodes();

        for (int i = 0; i < childNodeList.getLength(); i++) {
            Node child = childNodeList.item(i);
            String childName = child.getNodeName();

            if (childName.equals("lido:objectDescriptionSet")) {
                objectDescriptionSetList.add(objectDescriptionSetParser.getObjectDescriptionSet(child));
            }
        }

        return new ObjectDescriptionWrap(objectDescriptionSetList);
    }
}
