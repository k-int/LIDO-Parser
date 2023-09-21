package webdata.parser.xml.lido.core.leaf.conceptID;

import org.w3c.dom.Node;
import ro.webdata.parser.xml.lido.core.complex.identifierComplexType.IdentifierComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.identifierComplexType.IdentifierComplexTypeDAOImpl;

public class ConceptIDDAOImpl implements ConceptIDDAO {
    private static IdentifierComplexTypeDAO identifierComplexTypeDAO = new IdentifierComplexTypeDAOImpl();

    public ConceptID getConceptID(Node node) {
        return new ConceptID(identifierComplexTypeDAO.getIdentifierComplexType(node));
    }
}
