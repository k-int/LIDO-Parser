package app.java.parser.dao.impl.element.leaf.measurements;

import app.java.common.Utils;
import app.java.parser.dao.complex.TextComplexTypeDAO;
import app.java.parser.dao.element.leaf.measurements.ShapeMeasurementsDAO;
import app.java.parser.dao.impl.complex.TextComplexTypeDAOImpl;
import app.java.parser.model.attribute.lido.LidoSortOrder;
import app.java.parser.model.element.leaf.measurements.ShapeMeasurements;
import org.w3c.dom.Node;

import java.util.HashMap;

public class ShapeMeasurementsDAOImpl implements ShapeMeasurementsDAO {
    private static TextComplexTypeDAO textComplexTypeDAO = new TextComplexTypeDAOImpl();
    private static Utils utils = new Utils();

    public ShapeMeasurements getShapeMeasurements(Node node) {
        HashMap<String, String> attributes = utils.getAttributes(node);

        return new ShapeMeasurements(
                textComplexTypeDAO.getTextComplexType(node),
                new LidoSortOrder(attributes.get("lido:sortorder"))
        );
    }
}
