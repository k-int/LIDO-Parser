package ro.webdata.lido.parser.core.leaf.shapeMeasurements;

import ro.webdata.lido.parser.common.Utils;
import ro.webdata.lido.parser.core.complex.textComplexType.TextComplexTypeDAO;
import ro.webdata.lido.parser.core.complex.textComplexType.TextComplexTypeDAOImpl;
import ro.webdata.lido.parser.core.attribute.LidoSortOrder;
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