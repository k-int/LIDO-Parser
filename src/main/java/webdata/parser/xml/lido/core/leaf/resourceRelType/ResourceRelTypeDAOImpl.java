package webdata.parser.xml.lido.core.leaf.resourceRelType;

import org.w3c.dom.Node;
import ro.webdata.parser.xml.lido.core.complex.conceptComplexType.ConceptComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.conceptComplexType.ConceptComplexTypeDAOImpl;

public class ResourceRelTypeDAOImpl implements ResourceRelTypeDAO {
    private static ConceptComplexTypeDAO conceptComplexTypeDAO = new ConceptComplexTypeDAOImpl();

    public ResourceRelType getResourceRelType(Node node) {
        return new ResourceRelType(conceptComplexTypeDAO.getConceptComplexType(node));
    }
}
