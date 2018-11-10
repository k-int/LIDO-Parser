package app.java.parser.dao.impl.element.leaf.rights;

import app.java.common.Utils;
import app.java.parser.dao.complex.LegalBodyRefComplexTypeDAO;
import app.java.parser.dao.element.leaf.rights.RightsHolderDAO;
import app.java.parser.dao.impl.complex.LegalBodyRefComplexTypeDAOImpl;
import app.java.parser.model.attribute.lido.LidoSortOrder;
import app.java.parser.model.element.leaf.rights.RightsHolder;
import org.w3c.dom.Node;

import java.util.HashMap;

public class RightsHolderDAOImpl implements RightsHolderDAO {
    private static LegalBodyRefComplexTypeDAO legalBodyRefComplexTypeDAO = new LegalBodyRefComplexTypeDAOImpl();
    private static Utils utils = new Utils();

    public RightsHolder getRightsHolder(Node node) {
        HashMap<String, String> attributes = utils.getAttributes(node);

        return new RightsHolder(
                legalBodyRefComplexTypeDAO.getLegalBodyRefComplexType(node),
                new LidoSortOrder(attributes.get("lido:sortorder"))
        );
    }
}
