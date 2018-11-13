package ro.webdata.lido.parser.parser.dao.impl.element.set;

import ro.webdata.lido.parser.common.Utils;
import ro.webdata.lido.parser.parser.dao.complex.MeasurementsSetComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.set.MeasurementsSetDAO;
import ro.webdata.lido.parser.parser.dao.impl.complex.MeasurementsSetComplexTypeDAOImpl;
import ro.webdata.lido.parser.parser.model.attribute.lido.LidoSortOrder;
import ro.webdata.lido.parser.parser.model.element.set.MeasurementsSet;
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
