package ro.webdata.lido.parser.parser.dao.impl.element.leaf.rights;

import ro.webdata.lido.parser.common.Utils;
import ro.webdata.lido.parser.parser.dao.complex.RightsComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.rights.RightsResourceDAO;
import ro.webdata.lido.parser.parser.dao.impl.complex.RightsComplexTypeDAOImpl;
import ro.webdata.lido.parser.parser.model.attribute.lido.LidoSortOrder;
import ro.webdata.lido.parser.parser.model.element.leaf.rights.RightsResource;
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
