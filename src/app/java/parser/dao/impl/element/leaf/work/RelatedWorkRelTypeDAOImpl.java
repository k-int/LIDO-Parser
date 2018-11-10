package app.java.parser.dao.impl.element.leaf.work;

import app.java.parser.dao.complex.ConceptComplexTypeDAO;
import app.java.parser.dao.element.leaf.work.RelatedWorkRelTypeDAO;
import app.java.parser.dao.impl.complex.ConceptComplexTypeDAOImpl;
import app.java.parser.model.element.leaf.work.RelatedWorkRelType;
import org.w3c.dom.Node;

public class RelatedWorkRelTypeDAOImpl implements RelatedWorkRelTypeDAO {
    private static ConceptComplexTypeDAO conceptComplexTypeDAO = new ConceptComplexTypeDAOImpl();

    public RelatedWorkRelType getRelatedWorkRelType(Node node) {
        return new RelatedWorkRelType(conceptComplexTypeDAO.getConceptComplexType(node));
    }
}
