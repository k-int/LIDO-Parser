package app.java.parser.dao.impl.element.set;

import app.java.common.Utils;
import app.java.parser.dao.complex.RightsComplexTypeDAO;
import app.java.parser.dao.element.set.RightsWorkSetDAO;
import app.java.parser.dao.impl.complex.RightsComplexTypeDAOImpl;
import app.java.parser.model.attribute.lido.LidoSortOrder;
import app.java.parser.model.element.set.RightsWorkSet;
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
