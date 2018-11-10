package app.java.parser.dao.impl.element.set;

import app.java.common.Utils;
import app.java.parser.dao.complex.object.ObjectMeasurementsSetComplexTypeDAO;
import app.java.parser.dao.element.set.ObjectMeasurementsSetDAO;
import app.java.parser.dao.impl.complex.object.ObjectMeasurementsSetComplexTypeDAOImpl;
import app.java.parser.model.attribute.lido.LidoSortOrder;
import app.java.parser.model.element.set.ObjectMeasurementsSet;
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
