package app.java.parser.dao.impl.element.leaf.resource;

import app.java.parser.dao.complex.IdentifierComplexTypeDAO;
import app.java.parser.dao.element.leaf.resource.ResourceIDDAO;
import app.java.parser.dao.impl.complex.IdentifierComplexTypeDAOImpl;
import app.java.parser.model.element.leaf.resource.ResourceID;
import org.w3c.dom.Node;

public class ResourceIDDAOImpl implements ResourceIDDAO {
    private static IdentifierComplexTypeDAO identifierComplexTypeDAO = new IdentifierComplexTypeDAOImpl();

    public ResourceID getResourceID(Node node) {
        return new ResourceID(identifierComplexTypeDAO.getIdentifierComplexType(node));
    }
}
