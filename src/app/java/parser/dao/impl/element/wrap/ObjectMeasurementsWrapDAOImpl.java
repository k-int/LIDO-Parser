package app.java.parser.dao.impl.element.wrap;

import app.java.parser.dao.element.set.ObjectMeasurementsSetDAO;
import app.java.parser.dao.element.wrap.ObjectMeasurementsWrapDAO;
import app.java.parser.dao.impl.element.set.ObjectMeasurementsSetDAOImpl;
import app.java.parser.model.element.set.ObjectMeasurementsSet;
import app.java.parser.model.element.wrap.ObjectMeasurementsWrap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.ArrayList;

public class ObjectMeasurementsWrapDAOImpl implements ObjectMeasurementsWrapDAO {
    private static ObjectMeasurementsSetDAO objectMeasurementsSetParser = new ObjectMeasurementsSetDAOImpl();

    public ObjectMeasurementsWrap getObjectMeasurementsWrap(Node node) {
        ArrayList<ObjectMeasurementsSet> objectMeasurementsSetList = new ArrayList<ObjectMeasurementsSet>();
        NodeList childNodeList = node.getChildNodes();

        for (int i = 0; i < childNodeList.getLength(); i++) {
            Node child = childNodeList.item(i);
            String childName = child.getNodeName();

            if (childName.equals("lido:objectMeasurementsSet")) {
                objectMeasurementsSetList.add(objectMeasurementsSetParser.getObjectMeasurementsSet(child));
            }
        }

        return new ObjectMeasurementsWrap(objectMeasurementsSetList);
    }
}
