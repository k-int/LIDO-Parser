package webdata.parser.xml.lido.core.leaf.legalBodyID;

import org.w3c.dom.Node;
import ro.webdata.parser.xml.lido.core.complex.identifierComplexType.IdentifierComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.identifierComplexType.IdentifierComplexTypeDAOImpl;

public class LegalBodyIDDAOImpl implements LegalBodyIDDAO {
    private static IdentifierComplexTypeDAO identifierComplexTypeDAO = new IdentifierComplexTypeDAOImpl();

    public LegalBodyID getLegalBodyID(Node node) {
        return new LegalBodyID(identifierComplexTypeDAO.getIdentifierComplexType(node));
    }
}
