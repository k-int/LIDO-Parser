package ro.webdata.lido.parser.parser.dao.impl.complex.object;

import ro.webdata.lido.parser.parser.dao.complex.object.ObjectMeasurementsSetComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.object.DisplayObjectMeasurementsDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.object.ObjectMeasurementsDAO;
import ro.webdata.lido.parser.parser.dao.impl.element.leaf.object.DisplayObjectMeasurementsDAOImpl;
import ro.webdata.lido.parser.parser.dao.impl.element.leaf.object.ObjectMeasurementsDAOImpl;
import ro.webdata.lido.parser.parser.model.complex.object.ObjectMeasurementsSetComplexType;
import ro.webdata.lido.parser.parser.model.element.leaf.object.DisplayObjectMeasurements;
import ro.webdata.lido.parser.parser.model.element.leaf.object.ObjectMeasurements;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.ArrayList;

public class ObjectMeasurementsSetComplexTypeDAOImpl implements ObjectMeasurementsSetComplexTypeDAO {
    private static DisplayObjectMeasurementsDAO displayObjectMeasurementsParser = new DisplayObjectMeasurementsDAOImpl();
    private static ObjectMeasurementsDAO objectMeasurementsParser = new ObjectMeasurementsDAOImpl();

    public ObjectMeasurementsSetComplexType getObjectMeasurementsSetComplexType(Node node) {
        ArrayList<DisplayObjectMeasurements> displayObjectMeasurementsList = new ArrayList<DisplayObjectMeasurements>();
        ObjectMeasurements objectMeasurements = null;

        NodeList childNodeList = node.getChildNodes();
        for (int i = 0; i < childNodeList.getLength(); i++) {
            Node child = childNodeList.item(i);
            String childName = child.getNodeName();

            switch (childName) {
                case "lido:displayObjectMeasurements":
                    displayObjectMeasurementsList.add(displayObjectMeasurementsParser.getDisplayObjectMeasurements(child));
                    break;
                case "lido:objectMeasurements":
                    objectMeasurements = objectMeasurementsParser.getObjectMeasurements(child);
                    break;
                default: break;
            }
        }

        return new ObjectMeasurementsSetComplexType(
                displayObjectMeasurementsList,
                objectMeasurements
        );
    }
}
