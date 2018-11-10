package app.java.parser.dao.impl.element.leaf.resource;

import app.java.common.Utils;
import app.java.parser.dao.complex.LegalBodyRefComplexTypeDAO;
import app.java.parser.dao.element.leaf.resource.ResourceSourceDAO;
import app.java.parser.dao.impl.complex.LegalBodyRefComplexTypeDAOImpl;
import app.java.parser.model.attribute.lido.LidoSortOrder;
import app.java.parser.model.attribute.lido.LidoType;
import app.java.parser.model.element.leaf.resource.ResourceSource;
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
