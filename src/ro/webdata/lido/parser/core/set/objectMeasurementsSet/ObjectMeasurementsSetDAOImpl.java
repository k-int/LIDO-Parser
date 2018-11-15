package ro.webdata.lido.parser.core.set.objectMeasurementsSet;

import ro.webdata.lido.parser.common.Utils;
import ro.webdata.lido.parser.core.complex.objectMeasurementsSetComplexType.ObjectMeasurementsSetComplexTypeDAO;
import ro.webdata.lido.parser.core.complex.objectMeasurementsSetComplexType.ObjectMeasurementsSetComplexTypeDAOImpl;
import ro.webdata.lido.parser.core.attribute.LidoSortOrder;
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
