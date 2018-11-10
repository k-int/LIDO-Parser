package app.java.parser.dao.impl.element.leaf.legalBody;

import app.java.parser.dao.complex.IdentifierComplexTypeDAO;
import app.java.parser.dao.element.leaf.legalBody.LegalBodyIDDAO;
import app.java.parser.dao.impl.complex.IdentifierComplexTypeDAOImpl;
import app.java.parser.model.element.leaf.legalBody.LegalBodyID;
import org.w3c.dom.Node;

public class LegalBodyIDDAOImpl implements LegalBodyIDDAO {
    private static IdentifierComplexTypeDAO identifierComplexTypeDAO = new IdentifierComplexTypeDAOImpl();

    public LegalBodyID getLegalBodyID(Node node) {
        return new LegalBodyID(identifierComplexTypeDAO.getIdentifierComplexType(node));
    }
}
