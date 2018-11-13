package ro.webdata.lido.parser.parser.dao.impl.element.leaf.resource;

import ro.webdata.lido.parser.parser.dao.complex.ConceptComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.resource.ResourceRelTypeDAO;
import ro.webdata.lido.parser.parser.dao.impl.complex.ConceptComplexTypeDAOImpl;
import ro.webdata.lido.parser.parser.model.element.leaf.resource.ResourceRelType;
import org.w3c.dom.Node;

public class ResourceRelTypeDAOImpl implements ResourceRelTypeDAO {
    private static ConceptComplexTypeDAO conceptComplexTypeDAO = new ConceptComplexTypeDAOImpl();

    public ResourceRelType getResourceRelType(Node node) {
        return new ResourceRelType(conceptComplexTypeDAO.getConceptComplexType(node));
    }
}
