package app.java.parser.dao.impl.element.leaf.rights;

import app.java.common.Utils;
import app.java.parser.dao.complex.RightsComplexTypeDAO;
import app.java.parser.dao.element.leaf.rights.RightsResourceDAO;
import app.java.parser.dao.impl.complex.RightsComplexTypeDAOImpl;
import app.java.parser.model.attribute.lido.LidoSortOrder;
import app.java.parser.model.element.leaf.rights.RightsResource;
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
