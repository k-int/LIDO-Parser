package ro.webdata.lido.parser.core.leaf.rightsResource;

import ro.webdata.lido.parser.common.Utils;
import ro.webdata.lido.parser.core.complex.rightsComplexType.RightsComplexTypeDAO;
import ro.webdata.lido.parser.core.complex.rightsComplexType.RightsComplexTypeDAOImpl;
import ro.webdata.lido.parser.core.attribute.LidoSortOrder;
import org.w3c.dom.Node;

import java.util.HashMap;

public class RightsResourceDAOImpl implements RightsResourceDAO {
    private static RightsComplexTypeDAO rightsComplexTypeDAO = new RightsComplexTypeDAOImpl();
    private static Utils utils = new Utils();

    public RightsResource getRightsResource(Node node) {
        HashMap<String, String> attributes = utils.getAttributes(node);

        return new RightsResource(
                rightsComplexTypeDAO.getRightsComplexType(node),
                new LidoSortOrder(attributes.get("lido:sortorder"))
        );
    }
}
