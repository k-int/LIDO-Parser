package webdata.parser.xml.lido.core.leaf.relatedWorkRelType;

import org.w3c.dom.Node;
import ro.webdata.parser.xml.lido.core.complex.conceptComplexType.ConceptComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.conceptComplexType.ConceptComplexTypeDAOImpl;

public class RelatedWorkRelTypeDAOImpl implements RelatedWorkRelTypeDAO {
    private static ConceptComplexTypeDAO conceptComplexTypeDAO = new ConceptComplexTypeDAOImpl();

    public RelatedWorkRelType getRelatedWorkRelType(Node node) {
        return new RelatedWorkRelType(conceptComplexTypeDAO.getConceptComplexType(node));
    }
}
