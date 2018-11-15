package ro.webdata.lido.parser.core.leaf.conceptID;

import ro.webdata.lido.parser.core.complex.identifierComplexType.IdentifierComplexTypeDAO;
import ro.webdata.lido.parser.core.complex.identifierComplexType.IdentifierComplexTypeDAOImpl;
import org.w3c.dom.Node;

public class ConceptIDDAOImpl implements ConceptIDDAO {
    private static IdentifierComplexTypeDAO identifierComplexTypeDAO = new IdentifierComplexTypeDAOImpl();

    public ConceptID getConceptID(Node node) {
        return new ConceptID(identifierComplexTypeDAO.getIdentifierComplexType(node));
    }
}
