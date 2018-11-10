package app.java.parser.dao.impl.element.leaf.object;

import app.java.parser.dao.complex.object.ObjectMeasurementsComplexTypeDAO;
import app.java.parser.dao.element.leaf.object.ObjectMeasurementsDAO;
import app.java.parser.dao.impl.complex.object.ObjectMeasurementsComplexTypeDAOImpl;
import app.java.parser.model.element.leaf.object.ObjectMeasurements;
import org.w3c.dom.Node;

public class ObjectMeasurementsDAOImpl implements ObjectMeasurementsDAO {
    private static ObjectMeasurementsComplexTypeDAO objectMeasurementsComplexTypeDAO = new ObjectMeasurementsComplexTypeDAOImpl();

    public ObjectMeasurements getObjectMeasurements(Node node) {
        return new ObjectMeasurements(objectMeasurementsComplexTypeDAO.getObjectMeasurementsComplexType(node));
    }
}
