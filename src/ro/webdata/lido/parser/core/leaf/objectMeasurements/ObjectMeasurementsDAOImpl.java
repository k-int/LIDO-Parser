package ro.webdata.lido.parser.core.leaf.objectMeasurements;

import ro.webdata.lido.parser.core.complex.objectMeasurementsComplexType.ObjectMeasurementsComplexTypeDAO;
import ro.webdata.lido.parser.core.complex.objectMeasurementsComplexType.ObjectMeasurementsComplexTypeDAOImpl;
import org.w3c.dom.Node;

public class ObjectMeasurementsDAOImpl implements ObjectMeasurementsDAO {
    private static ObjectMeasurementsComplexTypeDAO objectMeasurementsComplexTypeDAO = new ObjectMeasurementsComplexTypeDAOImpl();

    public ObjectMeasurements getObjectMeasurements(Node node) {
        return new ObjectMeasurements(objectMeasurementsComplexTypeDAO.getObjectMeasurementsComplexType(node));
    }
}
