package ro.webdata.lido.parser.parser.dao.impl.element.leaf.object;

import ro.webdata.lido.parser.parser.dao.complex.object.ObjectMeasurementsComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.object.ObjectMeasurementsDAO;
import ro.webdata.lido.parser.parser.dao.impl.complex.object.ObjectMeasurementsComplexTypeDAOImpl;
import ro.webdata.lido.parser.parser.model.element.leaf.object.ObjectMeasurements;
import org.w3c.dom.Node;

public class ObjectMeasurementsDAOImpl implements ObjectMeasurementsDAO {
    private static ObjectMeasurementsComplexTypeDAO objectMeasurementsComplexTypeDAO = new ObjectMeasurementsComplexTypeDAOImpl();

    public ObjectMeasurements getObjectMeasurements(Node node) {
        return new ObjectMeasurements(objectMeasurementsComplexTypeDAO.getObjectMeasurementsComplexType(node));
    }
}
