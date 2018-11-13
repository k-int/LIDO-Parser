package ro.webdata.lido.parser.parser.dao.impl.element.set;

import ro.webdata.lido.parser.parser.dao.complex.MeasurementsSetComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.set.ResourceMeasurementsSetDAO;
import ro.webdata.lido.parser.parser.dao.impl.complex.MeasurementsSetComplexTypeDAOImpl;
import ro.webdata.lido.parser.parser.model.element.set.ResourceMeasurementsSet;
import org.w3c.dom.Node;

public class ResourceMeasurementsSetDAOImpl implements ResourceMeasurementsSetDAO {
    private static MeasurementsSetComplexTypeDAO measurementsSetComplexTypeDAO = new MeasurementsSetComplexTypeDAOImpl();

    public ResourceMeasurementsSet getResourceMeasurementsSet(Node node) {
        return new ResourceMeasurementsSet(measurementsSetComplexTypeDAO.getMeasurementsSetComplexType(node));
    }
}
