package ro.webdata.parser.xml.lido.core.leaf.rightsHolder;

import ro.webdata.parser.xml.lido.common.Utils;
import ro.webdata.parser.xml.lido.core.complex.legalBodyRefComplexType.LegalBodyRefComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.legalBodyRefComplexType.LegalBodyRefComplexTypeDAOImpl;
import ro.webdata.parser.xml.lido.core.attribute.LidoSortOrder;
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
