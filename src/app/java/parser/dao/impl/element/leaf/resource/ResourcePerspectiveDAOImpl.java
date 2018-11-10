package app.java.parser.dao.impl.element.leaf.resource;

import app.java.parser.dao.complex.ConceptComplexTypeDAO;
import app.java.parser.dao.element.leaf.resource.ResourcePerspectiveDAO;
import app.java.parser.dao.impl.complex.ConceptComplexTypeDAOImpl;
import app.java.parser.model.element.leaf.resource.ResourcePerspective;
import org.w3c.dom.Node;

public class ResourcePerspectiveDAOImpl implements ResourcePerspectiveDAO {
    private static ConceptComplexTypeDAO conceptComplexTypeDAO = new ConceptComplexTypeDAOImpl();

    public ResourcePerspective getResourcePerspective(Node node) {
        return new ResourcePerspective(conceptComplexTypeDAO.getConceptComplexType(node));
    }
}
