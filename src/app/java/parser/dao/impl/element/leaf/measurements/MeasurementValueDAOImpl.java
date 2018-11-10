package app.java.parser.dao.impl.element.leaf.measurements;

import app.java.parser.dao.complex.TextComplexTypeDAO;
import app.java.parser.dao.element.leaf.measurements.MeasurementValueDAO;
import app.java.parser.dao.impl.complex.TextComplexTypeDAOImpl;
import app.java.parser.model.element.leaf.measurements.MeasurementValue;
import org.w3c.dom.Node;

public class MeasurementValueDAOImpl implements MeasurementValueDAO {
    private static TextComplexTypeDAO textComplexTypeDAO = new TextComplexTypeDAOImpl();

    public MeasurementValue getMeasurementValue(Node node) {
        return new MeasurementValue(textComplexTypeDAO.getTextComplexType(node));
    }
}
