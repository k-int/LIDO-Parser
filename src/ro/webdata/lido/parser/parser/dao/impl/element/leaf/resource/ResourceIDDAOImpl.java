package ro.webdata.lido.parser.parser.dao.impl.element.leaf.resource;

import ro.webdata.lido.parser.parser.dao.complex.IdentifierComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.resource.ResourceIDDAO;
import ro.webdata.lido.parser.parser.dao.impl.complex.IdentifierComplexTypeDAOImpl;
import ro.webdata.lido.parser.parser.model.element.leaf.resource.ResourceID;
import org.w3c.dom.Node;

public class ResourceIDDAOImpl implements ResourceIDDAO {
    private static IdentifierComplexTypeDAO identifierComplexTypeDAO = new IdentifierComplexTypeDAOImpl();

    public ResourceID getResourceID(Node node) {
        return new ResourceID(identifierComplexTypeDAO.getIdentifierComplexType(node));
    }
}
