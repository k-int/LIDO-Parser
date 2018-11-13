package ro.webdata.lido.parser.parser.dao.impl.element.leaf.measurements;

import ro.webdata.lido.parser.parser.dao.complex.TextComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.measurements.MeasurementUnitDAO;
import ro.webdata.lido.parser.parser.dao.impl.complex.TextComplexTypeDAOImpl;
import ro.webdata.lido.parser.parser.model.element.leaf.measurements.MeasurementUnit;
import org.w3c.dom.Node;

public class MeasurementUnitDAOImpl implements MeasurementUnitDAO {
    private static TextComplexTypeDAO textComplexTypeDAO = new TextComplexTypeDAOImpl();

    public MeasurementUnit getMeasurementUnit(Node node) {
        return new MeasurementUnit(textComplexTypeDAO.getTextComplexType(node));
    }
}
