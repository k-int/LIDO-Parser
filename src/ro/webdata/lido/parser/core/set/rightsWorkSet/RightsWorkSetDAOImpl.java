package ro.webdata.lido.parser.core.set.rightsWorkSet;

import ro.webdata.lido.parser.common.Utils;
import ro.webdata.lido.parser.core.complex.rightsComplexType.RightsComplexTypeDAO;
import ro.webdata.lido.parser.core.complex.rightsComplexType.RightsComplexTypeDAOImpl;
import ro.webdata.lido.parser.core.attribute.LidoSortOrder;
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
