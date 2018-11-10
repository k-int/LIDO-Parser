package app.java.parser.dao.impl.element.leaf.object;

import app.java.parser.dao.complex.TextComplexTypeDAO;
import app.java.parser.dao.element.leaf.object.DisplayObjectMeasurementsDAO;
import app.java.parser.dao.impl.complex.TextComplexTypeDAOImpl;
import app.java.parser.model.element.leaf.object.DisplayObjectMeasurements;
import org.w3c.dom.Node;

public class DisplayObjectMeasurementsDAOImpl implements DisplayObjectMeasurementsDAO {
    private static TextComplexTypeDAO textComplexTypeDAO = new TextComplexTypeDAOImpl();

    public DisplayObjectMeasurements getDisplayObjectMeasurements(Node node) {
        return new DisplayObjectMeasurements(textComplexTypeDAO.getTextComplexType(node));
    }
}
