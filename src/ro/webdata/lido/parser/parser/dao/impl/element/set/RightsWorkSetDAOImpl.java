package ro.webdata.lido.parser.parser.dao.impl.element.set;

import ro.webdata.lido.parser.common.Utils;
import ro.webdata.lido.parser.parser.dao.complex.RightsComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.set.RightsWorkSetDAO;
import ro.webdata.lido.parser.parser.dao.impl.complex.RightsComplexTypeDAOImpl;
import ro.webdata.lido.parser.parser.model.attribute.lido.LidoSortOrder;
import ro.webdata.lido.parser.parser.model.element.set.RightsWorkSet;
import org.w3c.dom.Node;

import java.util.HashMap;

public class RightsWorkSetDAOImpl implements RightsWorkSetDAO {
    private static RightsComplexTypeDAO rightsComplexTypeDAO = new RightsComplexTypeDAOImpl();
    private static Utils utils = new Utils();

    public RightsWorkSet getRightsWorkSet(Node node) {
        HashMap<String, String> attributes = utils.getAttributes(node);

        return new RightsWorkSet(
                rightsComplexTypeDAO.getRightsComplexType(node),
                new LidoSortOrder(attributes.get("lido:sortorder"))
        );
    }
}
