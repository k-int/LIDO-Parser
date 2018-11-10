package app.java.parser.dao.impl.element.set;

import app.java.common.Utils;
import app.java.parser.dao.complex.ResourceSetComplexTypeDAO;
import app.java.parser.dao.element.set.ResourceSetDAO;
import app.java.parser.dao.impl.complex.ResourceSetComplexTypeDAOImpl;
import app.java.parser.model.attribute.lido.LidoSortOrder;
import app.java.parser.model.element.set.ResourceSet;
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
