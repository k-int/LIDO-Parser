package ro.webdata.lido.parser.parser.dao.impl.element.leaf.legalBody;

import ro.webdata.lido.parser.parser.dao.complex.IdentifierComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.legalBody.LegalBodyIDDAO;
import ro.webdata.lido.parser.parser.dao.impl.complex.IdentifierComplexTypeDAOImpl;
import ro.webdata.lido.parser.parser.model.element.leaf.legalBody.LegalBodyID;
import org.w3c.dom.Node;

public class LegalBodyIDDAOImpl implements LegalBodyIDDAO {
    private static IdentifierComplexTypeDAO identifierComplexTypeDAO = new IdentifierComplexTypeDAOImpl();

    public LegalBodyID getLegalBodyID(Node node) {
        return new LegalBodyID(identifierComplexTypeDAO.getIdentifierComplexType(node));
    }
}
