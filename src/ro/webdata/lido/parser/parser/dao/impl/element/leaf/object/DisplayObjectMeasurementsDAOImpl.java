package ro.webdata.lido.parser.parser.dao.impl.element.leaf.object;

import ro.webdata.lido.parser.parser.dao.complex.TextComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.object.DisplayObjectMeasurementsDAO;
import ro.webdata.lido.parser.parser.dao.impl.complex.TextComplexTypeDAOImpl;
import ro.webdata.lido.parser.parser.model.element.leaf.object.DisplayObjectMeasurements;
import org.w3c.dom.Node;

public class DisplayObjectMeasurementsDAOImpl implements DisplayObjectMeasurementsDAO {
    private static TextComplexTypeDAO textComplexTypeDAO = new TextComplexTypeDAOImpl();

    public DisplayObjectMeasurements getDisplayObjectMeasurements(Node node) {
        return new DisplayObjectMeasurements(textComplexTypeDAO.getTextComplexType(node));
    }
}
