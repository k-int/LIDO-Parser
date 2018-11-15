package ro.webdata.lido.parser.core.set.measurementsSet;

import ro.webdata.lido.parser.common.Utils;
import ro.webdata.lido.parser.core.complex.measurementsSetComplexType.MeasurementsSetComplexTypeDAO;
import ro.webdata.lido.parser.core.complex.measurementsSetComplexType.MeasurementsSetComplexTypeDAOImpl;
import ro.webdata.lido.parser.core.attribute.LidoSortOrder;
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
