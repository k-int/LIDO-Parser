package webdata.parser.xml.lido.core.leaf.measurementUnit;

import org.w3c.dom.Node;
import ro.webdata.parser.xml.lido.core.complex.textComplexType.TextComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.textComplexType.TextComplexTypeDAOImpl;

public class MeasurementUnitDAOImpl implements MeasurementUnitDAO {
    private static TextComplexTypeDAO textComplexTypeDAO = new TextComplexTypeDAOImpl();

    public MeasurementUnit getMeasurementUnit(Node node) {
        return new MeasurementUnit(textComplexTypeDAO.getTextComplexType(node));
    }
}
