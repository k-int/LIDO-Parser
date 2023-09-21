package webdata.parser.xml.lido.core.leaf.lidoRecID;

import org.w3c.dom.Node;
import ro.webdata.parser.xml.lido.core.complex.identifierComplexType.IdentifierComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.identifierComplexType.IdentifierComplexTypeDAOImpl;

public class LidoRecIDDAOImpl implements LidoRecIDDAO {
    private static IdentifierComplexTypeDAO identifierComplexTypeDAO = new IdentifierComplexTypeDAOImpl();

    public LidoRecID getLidoRecID(Node node) {
        return new LidoRecID(identifierComplexTypeDAO.getIdentifierComplexType(node));
    }
}
