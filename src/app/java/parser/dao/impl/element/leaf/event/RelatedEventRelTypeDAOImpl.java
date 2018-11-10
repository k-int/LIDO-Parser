package app.java.parser.dao.impl.element.leaf.event;

import app.java.parser.dao.complex.ConceptComplexTypeDAO;
import app.java.parser.dao.element.leaf.event.RelatedEventRelTypeDAO;
import app.java.parser.dao.impl.complex.ConceptComplexTypeDAOImpl;
import app.java.parser.model.element.leaf.event.RelatedEventRelType;
import org.w3c.dom.Node;

public class RelatedEventRelTypeDAOImpl implements RelatedEventRelTypeDAO {
    private static ConceptComplexTypeDAO conceptComplexTypeDAO = new ConceptComplexTypeDAOImpl();

    public RelatedEventRelType getRelatedEventRelType(Node node) {
        return new RelatedEventRelType(conceptComplexTypeDAO.getConceptComplexType(node));
    }
}
