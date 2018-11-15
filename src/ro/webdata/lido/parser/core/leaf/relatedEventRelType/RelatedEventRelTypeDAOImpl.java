package ro.webdata.lido.parser.core.leaf.relatedEventRelType;

import ro.webdata.lido.parser.core.complex.conceptComplexType.ConceptComplexTypeDAO;
import ro.webdata.lido.parser.core.complex.conceptComplexType.ConceptComplexTypeDAOImpl;
import org.w3c.dom.Node;

public class RelatedEventRelTypeDAOImpl implements RelatedEventRelTypeDAO {
    private static ConceptComplexTypeDAO conceptComplexTypeDAO = new ConceptComplexTypeDAOImpl();

    public RelatedEventRelType getRelatedEventRelType(Node node) {
        return new RelatedEventRelType(conceptComplexTypeDAO.getConceptComplexType(node));
    }
}
