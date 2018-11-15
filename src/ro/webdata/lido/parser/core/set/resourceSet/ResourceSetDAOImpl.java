package ro.webdata.lido.parser.core.set.resourceSet;

import ro.webdata.lido.parser.common.Utils;
import ro.webdata.lido.parser.core.complex.resourceSetComplexType.ResourceSetComplexTypeDAO;
import ro.webdata.lido.parser.core.complex.resourceSetComplexType.ResourceSetComplexTypeDAOImpl;
import ro.webdata.lido.parser.core.attribute.LidoSortOrder;
import org.w3c.dom.Node;

import java.util.HashMap;

public class ResourceSetDAOImpl implements ResourceSetDAO {
    private static ResourceSetComplexTypeDAO resourceSetComplexTypeDAO = new ResourceSetComplexTypeDAOImpl();
    private static Utils utils = new Utils();

    public ResourceSet getResourceSet(Node node) {
        HashMap<String, String> attributes = utils.getAttributes(node);

        return new ResourceSet(
                resourceSetComplexTypeDAO.getResourceSetComplexType(node),
                new LidoSortOrder(attributes.get("lido:sortorder"))
        );
    }
}
