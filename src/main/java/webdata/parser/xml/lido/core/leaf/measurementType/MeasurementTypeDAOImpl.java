package webdata.parser.xml.lido.core.leaf.measurementType;

import org.w3c.dom.Node;
import ro.webdata.parser.xml.lido.core.complex.textComplexType.TextComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.textComplexType.TextComplexTypeDAOImpl;

public class MeasurementTypeDAOImpl implements MeasurementTypeDAO {
    private static TextComplexTypeDAO textComplexTypeDAO = new TextComplexTypeDAOImpl();

    public MeasurementType getMeasurementType(Node node) {
        return new MeasurementType(textComplexTypeDAO.getTextComplexType(node));
    }
}
