package ro.webdata.lido.parser.parser.dao.impl.element.leaf.measurements;

import ro.webdata.lido.parser.parser.dao.complex.TextComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.measurements.MeasurementValueDAO;
import ro.webdata.lido.parser.parser.dao.impl.complex.TextComplexTypeDAOImpl;
import ro.webdata.lido.parser.parser.model.element.leaf.measurements.MeasurementValue;
import org.w3c.dom.Node;

public class MeasurementValueDAOImpl implements MeasurementValueDAO {
    private static TextComplexTypeDAO textComplexTypeDAO = new TextComplexTypeDAOImpl();

    public MeasurementValue getMeasurementValue(Node node) {
        return new MeasurementValue(textComplexTypeDAO.getTextComplexType(node));
    }
}
