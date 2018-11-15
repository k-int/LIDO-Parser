package ro.webdata.lido.parser.core.set.resourceMeasurementsSet;

import ro.webdata.lido.parser.core.complex.measurementsSetComplexType.MeasurementsSetComplexTypeDAO;
import ro.webdata.lido.parser.core.complex.measurementsSetComplexType.MeasurementsSetComplexTypeDAOImpl;
import org.w3c.dom.Node;

public class ResourceMeasurementsSetDAOImpl implements ResourceMeasurementsSetDAO {
    private static MeasurementsSetComplexTypeDAO measurementsSetComplexTypeDAO = new MeasurementsSetComplexTypeDAOImpl();

    public ResourceMeasurementsSet getResourceMeasurementsSet(Node node) {
        return new ResourceMeasurementsSet(measurementsSetComplexTypeDAO.getMeasurementsSetComplexType(node));
    }
}
