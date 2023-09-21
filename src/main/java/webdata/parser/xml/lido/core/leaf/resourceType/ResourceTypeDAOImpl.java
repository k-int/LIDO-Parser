package webdata.parser.xml.lido.core.leaf.resourceType;

import org.w3c.dom.Node;
import ro.webdata.parser.xml.lido.core.complex.conceptComplexType.ConceptComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.conceptComplexType.ConceptComplexTypeDAOImpl;

public class ResourceTypeDAOImpl implements ResourceTypeDAO {
    private static ConceptComplexTypeDAO conceptComplexTypeDAO = new ConceptComplexTypeDAOImpl();

    public ResourceType getResourceType(Node node) {
        return new ResourceType(conceptComplexTypeDAO.getConceptComplexType(node));
    }
}
