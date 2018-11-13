package ro.webdata.lido.parser.parser.dao.impl.element.set;

import ro.webdata.lido.parser.common.Utils;
import ro.webdata.lido.parser.parser.dao.complex.ResourceSetComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.set.ResourceSetDAO;
import ro.webdata.lido.parser.parser.dao.impl.complex.ResourceSetComplexTypeDAOImpl;
import ro.webdata.lido.parser.parser.model.attribute.lido.LidoSortOrder;
import ro.webdata.lido.parser.parser.model.element.set.ResourceSet;
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
