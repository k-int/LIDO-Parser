package app.java.parser.dao.impl.element.set;

import app.java.parser.dao.complex.MeasurementsSetComplexTypeDAO;
import app.java.parser.dao.element.set.ResourceMeasurementsSetDAO;
import app.java.parser.dao.impl.complex.MeasurementsSetComplexTypeDAOImpl;
import app.java.parser.model.element.set.ResourceMeasurementsSet;
import org.w3c.dom.Node;

public class ResourceMeasurementsSetDAOImpl implements ResourceMeasurementsSetDAO {
    private static MeasurementsSetComplexTypeDAO measurementsSetComplexTypeDAO = new MeasurementsSetComplexTypeDAOImpl();

    public ResourceMeasurementsSet getResourceMeasurementsSet(Node node) {
        return new ResourceMeasurementsSet(measurementsSetComplexTypeDAO.getMeasurementsSetComplexType(node));
    }
}
