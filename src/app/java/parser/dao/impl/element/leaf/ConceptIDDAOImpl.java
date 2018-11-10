package app.java.parser.dao.impl.element.leaf;

import app.java.parser.dao.complex.IdentifierComplexTypeDAO;
import app.java.parser.dao.element.leaf.ConceptIDDAO;
import app.java.parser.dao.impl.complex.IdentifierComplexTypeDAOImpl;
import app.java.parser.model.element.leaf.ConceptID;
import org.w3c.dom.Node;

public class ConceptIDDAOImpl implements ConceptIDDAO {
    private static IdentifierComplexTypeDAO identifierComplexTypeDAO = new IdentifierComplexTypeDAOImpl();

    public ConceptID getConceptID(Node node) {
        return new ConceptID(identifierComplexTypeDAO.getIdentifierComplexType(node));
    }
}
