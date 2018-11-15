package ro.webdata.lido.parser.core.leaf.resourceType;

import ro.webdata.lido.parser.core.complex.conceptComplexType.ConceptComplexTypeDAO;
import ro.webdata.lido.parser.core.complex.conceptComplexType.ConceptComplexTypeDAOImpl;
import org.w3c.dom.Node;

public class ResourceTypeDAOImpl implements ResourceTypeDAO {
    private static ConceptComplexTypeDAO conceptComplexTypeDAO = new ConceptComplexTypeDAOImpl();

    public ResourceType getResourceType(Node node) {
        return new ResourceType(conceptComplexTypeDAO.getConceptComplexType(node));
    }
}
