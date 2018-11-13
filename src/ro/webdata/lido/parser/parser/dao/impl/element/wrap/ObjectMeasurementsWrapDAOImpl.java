package ro.webdata.lido.parser.parser.dao.impl.element.wrap;

import ro.webdata.lido.parser.parser.dao.element.set.ObjectMeasurementsSetDAO;
import ro.webdata.lido.parser.parser.dao.element.wrap.ObjectMeasurementsWrapDAO;
import ro.webdata.lido.parser.parser.dao.impl.element.set.ObjectMeasurementsSetDAOImpl;
import ro.webdata.lido.parser.parser.model.element.set.ObjectMeasurementsSet;
import ro.webdata.lido.parser.parser.model.element.wrap.ObjectMeasurementsWrap;
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
