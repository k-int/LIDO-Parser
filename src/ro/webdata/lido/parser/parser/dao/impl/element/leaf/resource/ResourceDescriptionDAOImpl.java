package ro.webdata.lido.parser.parser.dao.impl.element.leaf.resource;

import ro.webdata.lido.parser.common.Utils;
import ro.webdata.lido.parser.parser.dao.complex.TextComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.resource.ResourceDescriptionDAO;
import ro.webdata.lido.parser.parser.dao.impl.complex.TextComplexTypeDAOImpl;
import ro.webdata.lido.parser.parser.model.attribute.lido.LidoSortOrder;
import ro.webdata.lido.parser.parser.model.attribute.lido.LidoType;
import ro.webdata.lido.parser.parser.model.element.leaf.resource.ResourceDescription;
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
