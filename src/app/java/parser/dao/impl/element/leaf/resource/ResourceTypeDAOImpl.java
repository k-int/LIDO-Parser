package app.java.parser.dao.impl.element.leaf.resource;

import app.java.parser.dao.complex.ConceptComplexTypeDAO;
import app.java.parser.dao.element.leaf.resource.ResourceTypeDAO;
import app.java.parser.dao.impl.complex.ConceptComplexTypeDAOImpl;
import app.java.parser.model.element.leaf.resource.ResourceType;
import org.w3c.dom.Node;

public class ResourceTypeDAOImpl implements ResourceTypeDAO {
    private static ConceptComplexTypeDAO conceptComplexTypeDAO = new ConceptComplexTypeDAOImpl();

    public ResourceType getResourceType(Node node) {
        return new ResourceType(conceptComplexTypeDAO.getConceptComplexType(node));
    }
}
