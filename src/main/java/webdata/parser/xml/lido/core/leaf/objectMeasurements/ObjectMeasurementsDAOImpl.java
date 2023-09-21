package webdata.parser.xml.lido.core.leaf.objectMeasurements;

import org.w3c.dom.Node;
import ro.webdata.parser.xml.lido.core.complex.objectMeasurementsComplexType.ObjectMeasurementsComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.objectMeasurementsComplexType.ObjectMeasurementsComplexTypeDAOImpl;

public class ObjectMeasurementsDAOImpl implements ObjectMeasurementsDAO {
    private static ObjectMeasurementsComplexTypeDAO objectMeasurementsComplexTypeDAO = new ObjectMeasurementsComplexTypeDAOImpl();

    public ObjectMeasurements getObjectMeasurements(Node node) {
        return new ObjectMeasurements(objectMeasurementsComplexTypeDAO.getObjectMeasurementsComplexType(node));
    }
}
