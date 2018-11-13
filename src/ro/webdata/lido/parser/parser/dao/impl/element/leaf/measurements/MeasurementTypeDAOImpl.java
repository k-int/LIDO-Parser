package ro.webdata.lido.parser.parser.dao.impl.element.leaf.measurements;

import ro.webdata.lido.parser.parser.dao.complex.TextComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.measurements.MeasurementTypeDAO;
import ro.webdata.lido.parser.parser.dao.impl.complex.TextComplexTypeDAOImpl;
import ro.webdata.lido.parser.parser.model.element.leaf.measurements.MeasurementType;
import org.w3c.dom.Node;

public class MeasurementTypeDAOImpl implements MeasurementTypeDAO {
    private static TextComplexTypeDAO textComplexTypeDAO = new TextComplexTypeDAOImpl();

    public MeasurementType getMeasurementType(Node node) {
        return new MeasurementType(textComplexTypeDAO.getTextComplexType(node));
    }
}
