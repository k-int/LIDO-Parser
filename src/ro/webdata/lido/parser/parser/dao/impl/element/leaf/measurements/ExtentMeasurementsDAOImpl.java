package ro.webdata.lido.parser.parser.dao.impl.element.leaf.measurements;

import ro.webdata.lido.parser.common.Utils;
import ro.webdata.lido.parser.parser.dao.complex.TextComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.measurements.ExtentMeasurementsDAO;
import ro.webdata.lido.parser.parser.dao.impl.complex.TextComplexTypeDAOImpl;
import ro.webdata.lido.parser.parser.model.attribute.lido.LidoSortOrder;
import ro.webdata.lido.parser.parser.model.element.leaf.measurements.ExtentMeasurements;
import org.w3c.dom.Node;

import java.util.HashMap;

public class ExtentMeasurementsDAOImpl implements ExtentMeasurementsDAO {
    private static TextComplexTypeDAO textComplexTypeDAO = new TextComplexTypeDAOImpl();
    private static Utils utils = new Utils();

    public ExtentMeasurements getExtentMeasurements(Node node) {
        HashMap<String, String> attributes = utils.getAttributes(node);

        return new ExtentMeasurements(
                textComplexTypeDAO.getTextComplexType(node),
                new LidoSortOrder(attributes.get("lido:sortorder"))
        );
    }
}
