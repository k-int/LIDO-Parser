package ro.webdata.lido.parser.core.leaf.formatMeasurements;

import ro.webdata.lido.parser.common.Utils;
import ro.webdata.lido.parser.core.complex.textComplexType.TextComplexTypeDAO;
import ro.webdata.lido.parser.core.complex.textComplexType.TextComplexTypeDAOImpl;
import ro.webdata.lido.parser.core.attribute.LidoSortOrder;
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
