package app.java.parser.dao.impl.element.set;

import app.java.common.Utils;
import app.java.parser.dao.complex.MeasurementsSetComplexTypeDAO;
import app.java.parser.dao.element.set.MeasurementsSetDAO;
import app.java.parser.dao.impl.complex.MeasurementsSetComplexTypeDAOImpl;
import app.java.parser.model.attribute.lido.LidoSortOrder;
import app.java.parser.model.element.set.MeasurementsSet;
import org.w3c.dom.Node;

import java.util.HashMap;

public class MeasurementsSetDAOImpl implements MeasurementsSetDAO {
    private MeasurementsSetComplexTypeDAO measurementsSetComplexTypeDAO = new MeasurementsSetComplexTypeDAOImpl();
    private Utils utils = new Utils();

    public MeasurementsSet getMeasurementsSet(Node node) {
        HashMap<String, String> attributes = utils.getAttributes(node);

        return new MeasurementsSet(
                measurementsSetComplexTypeDAO.getMeasurementsSetComplexType(node),
                new LidoSortOrder(attributes.get("lido:sortorder"))
        );
    }
}
