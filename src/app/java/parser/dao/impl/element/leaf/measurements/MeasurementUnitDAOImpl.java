package app.java.parser.dao.impl.element.leaf.measurements;

import app.java.parser.dao.complex.TextComplexTypeDAO;
import app.java.parser.dao.element.leaf.measurements.MeasurementUnitDAO;
import app.java.parser.dao.impl.complex.TextComplexTypeDAOImpl;
import app.java.parser.model.element.leaf.measurements.MeasurementUnit;
import org.w3c.dom.Node;

public class MeasurementUnitDAOImpl implements MeasurementUnitDAO {
    private static TextComplexTypeDAO textComplexTypeDAO = new TextComplexTypeDAOImpl();

    public MeasurementUnit getMeasurementUnit(Node node) {
        return new MeasurementUnit(textComplexTypeDAO.getTextComplexType(node));
    }
}
