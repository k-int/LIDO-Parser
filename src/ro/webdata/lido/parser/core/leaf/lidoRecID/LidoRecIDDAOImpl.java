package ro.webdata.lido.parser.core.leaf.lidoRecID;

import ro.webdata.lido.parser.core.complex.identifierComplexType.IdentifierComplexTypeDAO;
import ro.webdata.lido.parser.core.complex.identifierComplexType.IdentifierComplexTypeDAOImpl;
import org.w3c.dom.Node;

public class LidoRecIDDAOImpl implements LidoRecIDDAO {
    private static IdentifierComplexTypeDAO identifierComplexTypeDAO = new IdentifierComplexTypeDAOImpl();

    public LidoRecID getLidoRecID(Node node) {
        return new LidoRecID(identifierComplexTypeDAO.getIdentifierComplexType(node));
    }
}
