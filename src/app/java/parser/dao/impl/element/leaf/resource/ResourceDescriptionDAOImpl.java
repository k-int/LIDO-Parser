package app.java.parser.dao.impl.element.leaf.resource;

import app.java.common.Utils;
import app.java.parser.dao.complex.TextComplexTypeDAO;
import app.java.parser.dao.element.leaf.resource.ResourceDescriptionDAO;
import app.java.parser.dao.impl.complex.TextComplexTypeDAOImpl;
import app.java.parser.model.attribute.lido.LidoSortOrder;
import app.java.parser.model.attribute.lido.LidoType;
import app.java.parser.model.element.leaf.resource.ResourceDescription;
import org.w3c.dom.Node;

import java.util.HashMap;

public class ResourceDescriptionDAOImpl implements ResourceDescriptionDAO {
    private static TextComplexTypeDAO textComplexTypeDAO = new TextComplexTypeDAOImpl();
    private static Utils utils = new Utils();

    public ResourceDescription getResourceDescription(Node node) {
        HashMap<String, String> attributes = utils.getAttributes(node);

        return new ResourceDescription(
                textComplexTypeDAO.getTextComplexType(node),
                new LidoType(attributes.get("lido:type")),
                new LidoSortOrder(attributes.get("lido:sortorder"))
        );
    }
}
