package ro.webdata.lido.parser.parser.dao.impl.element.leaf.resource;

import ro.webdata.lido.parser.parser.dao.complex.ConceptComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.resource.ResourceTypeDAO;
import ro.webdata.lido.parser.parser.dao.impl.complex.ConceptComplexTypeDAOImpl;
import ro.webdata.lido.parser.parser.model.element.leaf.resource.ResourceType;
import org.w3c.dom.Node;

public class ResourceTypeDAOImpl implements ResourceTypeDAO {
    private static ConceptComplexTypeDAO conceptComplexTypeDAO = new ConceptComplexTypeDAOImpl();

    public ResourceType getResourceType(Node node) {
        return new ResourceType(conceptComplexTypeDAO.getConceptComplexType(node));
    }
}
