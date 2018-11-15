package ro.webdata.lido.parser.core.leaf.relatedWorkRelType;

import ro.webdata.lido.parser.core.complex.conceptComplexType.ConceptComplexTypeDAO;
import ro.webdata.lido.parser.core.complex.conceptComplexType.ConceptComplexTypeDAOImpl;
import org.w3c.dom.Node;

public class RelatedWorkRelTypeDAOImpl implements RelatedWorkRelTypeDAO {
    private static ConceptComplexTypeDAO conceptComplexTypeDAO = new ConceptComplexTypeDAOImpl();

    public RelatedWorkRelType getRelatedWorkRelType(Node node) {
        return new RelatedWorkRelType(conceptComplexTypeDAO.getConceptComplexType(node));
    }
}
