package ro.webdata.lido.parser.parser.dao.impl.element.leaf.rights;

import ro.webdata.lido.parser.common.Utils;
import ro.webdata.lido.parser.parser.dao.complex.LegalBodyRefComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.rights.RightsHolderDAO;
import ro.webdata.lido.parser.parser.dao.impl.complex.LegalBodyRefComplexTypeDAOImpl;
import ro.webdata.lido.parser.parser.model.attribute.lido.LidoSortOrder;
import ro.webdata.lido.parser.parser.model.element.leaf.rights.RightsHolder;
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
