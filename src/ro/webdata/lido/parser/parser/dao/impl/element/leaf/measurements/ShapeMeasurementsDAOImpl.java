package ro.webdata.lido.parser.parser.dao.impl.element.leaf.measurements;

import ro.webdata.lido.parser.common.Utils;
import ro.webdata.lido.parser.parser.dao.complex.TextComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.measurements.ShapeMeasurementsDAO;
import ro.webdata.lido.parser.parser.dao.impl.complex.TextComplexTypeDAOImpl;
import ro.webdata.lido.parser.parser.model.attribute.lido.LidoSortOrder;
import ro.webdata.lido.parser.parser.model.element.leaf.measurements.ShapeMeasurements;
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
