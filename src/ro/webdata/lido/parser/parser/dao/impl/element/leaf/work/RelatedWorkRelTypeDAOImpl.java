package ro.webdata.lido.parser.parser.dao.impl.element.leaf.work;

import ro.webdata.lido.parser.parser.dao.complex.ConceptComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.work.RelatedWorkRelTypeDAO;
import ro.webdata.lido.parser.parser.dao.impl.complex.ConceptComplexTypeDAOImpl;
import ro.webdata.lido.parser.parser.model.element.leaf.work.RelatedWorkRelType;
import org.w3c.dom.Node;

public class RelatedWorkRelTypeDAOImpl implements RelatedWorkRelTypeDAO {
    private static ConceptComplexTypeDAO conceptComplexTypeDAO = new ConceptComplexTypeDAOImpl();

    public RelatedWorkRelType getRelatedWorkRelType(Node node) {
        return new RelatedWorkRelType(conceptComplexTypeDAO.getConceptComplexType(node));
    }
}
