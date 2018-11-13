package ro.webdata.lido.parser.parser.dao.impl.element.leaf.resource;

import ro.webdata.lido.parser.common.Utils;
import ro.webdata.lido.parser.parser.dao.complex.LegalBodyRefComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.resource.ResourceSourceDAO;
import ro.webdata.lido.parser.parser.dao.impl.complex.LegalBodyRefComplexTypeDAOImpl;
import ro.webdata.lido.parser.parser.model.attribute.lido.LidoSortOrder;
import ro.webdata.lido.parser.parser.model.attribute.lido.LidoType;
import ro.webdata.lido.parser.parser.model.element.leaf.resource.ResourceSource;
import org.w3c.dom.Node;

import java.util.HashMap;

public class ResourceSourceDAOImpl implements ResourceSourceDAO {
    private static LegalBodyRefComplexTypeDAO legalBodyRefComplexTypeDAO = new LegalBodyRefComplexTypeDAOImpl();
    private static Utils utils = new Utils();

    public ResourceSource getResourceSource(Node node) {
        HashMap<String, String> attributes = utils.getAttributes(node);

        return new ResourceSource(
                legalBodyRefComplexTypeDAO.getLegalBodyRefComplexType(node),
                new LidoType(attributes.get("lido:type")),
                new LidoSortOrder(attributes.get("lido:sortorder"))
        );
    }
}
