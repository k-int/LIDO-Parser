package ro.webdata.lido.parser.core.leaf.measurementUnit;

import ro.webdata.lido.parser.core.complex.textComplexType.TextComplexTypeDAO;
import ro.webdata.lido.parser.core.complex.textComplexType.TextComplexTypeDAOImpl;
import org.w3c.dom.Node;

public class MeasurementUnitDAOImpl implements MeasurementUnitDAO {
    private static TextComplexTypeDAO textComplexTypeDAO = new TextComplexTypeDAOImpl();

    public MeasurementUnit getMeasurementUnit(Node node) {
        return new MeasurementUnit(textComplexTypeDAO.getTextComplexType(node));
    }
}
