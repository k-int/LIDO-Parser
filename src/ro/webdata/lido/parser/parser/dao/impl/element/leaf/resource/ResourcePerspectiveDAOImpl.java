package ro.webdata.lido.parser.parser.dao.impl.element.leaf.resource;

import ro.webdata.lido.parser.parser.dao.complex.ConceptComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.resource.ResourcePerspectiveDAO;
import ro.webdata.lido.parser.parser.dao.impl.complex.ConceptComplexTypeDAOImpl;
import ro.webdata.lido.parser.parser.model.element.leaf.resource.ResourcePerspective;
import org.w3c.dom.Node;

public class ResourcePerspectiveDAOImpl implements ResourcePerspectiveDAO {
    private static ConceptComplexTypeDAO conceptComplexTypeDAO = new ConceptComplexTypeDAOImpl();

    public ResourcePerspective getResourcePerspective(Node node) {
        return new ResourcePerspective(conceptComplexTypeDAO.getConceptComplexType(node));
    }
}
