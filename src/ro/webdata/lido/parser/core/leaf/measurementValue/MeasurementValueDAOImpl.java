package ro.webdata.lido.parser.core.leaf.measurementValue;

import ro.webdata.lido.parser.core.complex.textComplexType.TextComplexTypeDAO;
import ro.webdata.lido.parser.core.complex.textComplexType.TextComplexTypeDAOImpl;
import org.w3c.dom.Node;

public class MeasurementValueDAOImpl implements MeasurementValueDAO {
    private static TextComplexTypeDAO textComplexTypeDAO = new TextComplexTypeDAOImpl();

    public MeasurementValue getMeasurementValue(Node node) {
        return new MeasurementValue(textComplexTypeDAO.getTextComplexType(node));
    }
}
