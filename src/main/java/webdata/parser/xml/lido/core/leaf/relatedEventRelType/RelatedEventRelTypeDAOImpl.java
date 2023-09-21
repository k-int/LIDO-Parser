package webdata.parser.xml.lido.core.leaf.relatedEventRelType;

import org.w3c.dom.Node;
import ro.webdata.parser.xml.lido.core.complex.conceptComplexType.ConceptComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.conceptComplexType.ConceptComplexTypeDAOImpl;

public class RelatedEventRelTypeDAOImpl implements RelatedEventRelTypeDAO {
    private static ConceptComplexTypeDAO conceptComplexTypeDAO = new ConceptComplexTypeDAOImpl();

    public RelatedEventRelType getRelatedEventRelType(Node node) {
        return new RelatedEventRelType(conceptComplexTypeDAO.getConceptComplexType(node));
    }
}
