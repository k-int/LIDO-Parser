package app.java.parser.dao.impl.element.leaf;

import app.java.parser.dao.complex.IdentifierComplexTypeDAO;
import app.java.parser.dao.element.leaf.LidoRecIDDAO;
import app.java.parser.dao.impl.complex.IdentifierComplexTypeDAOImpl;
import app.java.parser.model.element.leaf.LidoRecID;
import org.w3c.dom.Node;

public class LidoRecIDDAOImpl implements LidoRecIDDAO {
    private static IdentifierComplexTypeDAO identifierComplexTypeDAO = new IdentifierComplexTypeDAOImpl();

    public LidoRecID getLidoRecID(Node node) {
        return new LidoRecID(identifierComplexTypeDAO.getIdentifierComplexType(node));
    }
}
