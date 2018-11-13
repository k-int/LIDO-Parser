package ro.webdata.lido.parser.parser.dao.impl.element.wrap;

import ro.webdata.lido.parser.parser.dao.element.set.ObjectDescriptionSetDAO;
import ro.webdata.lido.parser.parser.dao.element.wrap.ObjectDescriptionWrapDAO;
import ro.webdata.lido.parser.parser.dao.impl.element.set.ObjectDescriptionSetDAOImpl;
import ro.webdata.lido.parser.parser.model.element.set.ObjectDescriptionSet;
import ro.webdata.lido.parser.parser.model.element.wrap.ObjectDescriptionWrap;
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
