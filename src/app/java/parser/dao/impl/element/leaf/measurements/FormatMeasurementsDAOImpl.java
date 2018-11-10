package app.java.parser.dao.impl.element.leaf.measurements;

import app.java.common.Utils;
import app.java.parser.dao.complex.TextComplexTypeDAO;
import app.java.parser.dao.element.leaf.measurements.FormatMeasurementsDAO;
import app.java.parser.dao.impl.complex.TextComplexTypeDAOImpl;
import app.java.parser.model.attribute.lido.LidoSortOrder;
import app.java.parser.model.element.leaf.measurements.FormatMeasurements;
import org.w3c.dom.Node;

import java.util.HashMap;

public class FormatMeasurementsDAOImpl implements FormatMeasurementsDAO {
    private static TextComplexTypeDAO textComplexTypeDAO = new TextComplexTypeDAOImpl();
    private static Utils utils = new Utils();

    public FormatMeasurements getFormatMeasurements(Node node) {
        HashMap<String, String> attributes = utils.getAttributes(node);

        return new FormatMeasurements(
                textComplexTypeDAO.getTextComplexType(node),
                new LidoSortOrder(attributes.get("lido:sortorder"))
        );
    }
}
