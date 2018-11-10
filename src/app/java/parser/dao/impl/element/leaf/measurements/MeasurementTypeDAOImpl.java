package app.java.parser.dao.impl.element.leaf.measurements;

import app.java.parser.dao.complex.TextComplexTypeDAO;
import app.java.parser.dao.element.leaf.measurements.MeasurementTypeDAO;
import app.java.parser.dao.impl.complex.TextComplexTypeDAOImpl;
import app.java.parser.model.element.leaf.measurements.MeasurementType;
import org.w3c.dom.Node;

public class MeasurementTypeDAOImpl implements MeasurementTypeDAO {
    private static TextComplexTypeDAO textComplexTypeDAO = new TextComplexTypeDAOImpl();

    public MeasurementType getMeasurementType(Node node) {
        return new MeasurementType(textComplexTypeDAO.getTextComplexType(node));
    }
}
