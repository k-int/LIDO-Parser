package ro.webdata.lido.parser.parser.dao.impl.element.set;

import ro.webdata.lido.parser.common.Utils;
import ro.webdata.lido.parser.parser.dao.complex.object.ObjectMeasurementsSetComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.set.ObjectMeasurementsSetDAO;
import ro.webdata.lido.parser.parser.dao.impl.complex.object.ObjectMeasurementsSetComplexTypeDAOImpl;
import ro.webdata.lido.parser.parser.model.attribute.lido.LidoSortOrder;
import ro.webdata.lido.parser.parser.model.element.set.ObjectMeasurementsSet;
import org.w3c.dom.Node;

import java.util.HashMap;

public class ObjectMeasurementsSetDAOImpl implements ObjectMeasurementsSetDAO {
    private static ObjectMeasurementsSetComplexTypeDAO objectMeasurementsSetComplexTypeDAO = new ObjectMeasurementsSetComplexTypeDAOImpl();
    private static Utils utils = new Utils();

    public ObjectMeasurementsSet getObjectMeasurementsSet(Node node) {
        HashMap<String, String> attributes = utils.getAttributes(node);

        return new ObjectMeasurementsSet(
                objectMeasurementsSetComplexTypeDAO.getObjectMeasurementsSetComplexType(node),
                new LidoSortOrder(attributes.get("lido:sortorder"))
        );
    }
}
