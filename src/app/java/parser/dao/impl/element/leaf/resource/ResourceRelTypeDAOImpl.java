package app.java.parser.dao.impl.element.leaf.resource;

import app.java.parser.dao.complex.ConceptComplexTypeDAO;
import app.java.parser.dao.element.leaf.resource.ResourceRelTypeDAO;
import app.java.parser.dao.impl.complex.ConceptComplexTypeDAOImpl;
import app.java.parser.model.element.leaf.resource.ResourceRelType;
import org.w3c.dom.Node;

public class ResourceRelTypeDAOImpl implements ResourceRelTypeDAO {
    private static ConceptComplexTypeDAO conceptComplexTypeDAO = new ConceptComplexTypeDAOImpl();

    public ResourceRelType getResourceRelType(Node node) {
        return new ResourceRelType(conceptComplexTypeDAO.getConceptComplexType(node));
    }
}
