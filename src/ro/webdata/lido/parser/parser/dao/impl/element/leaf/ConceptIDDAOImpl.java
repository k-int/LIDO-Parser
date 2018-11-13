package ro.webdata.lido.parser.parser.dao.impl.element.leaf;

import ro.webdata.lido.parser.parser.dao.complex.IdentifierComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.ConceptIDDAO;
import ro.webdata.lido.parser.parser.dao.impl.complex.IdentifierComplexTypeDAOImpl;
import ro.webdata.lido.parser.parser.model.element.leaf.ConceptID;
import org.w3c.dom.Node;

public class ConceptIDDAOImpl implements ConceptIDDAO {
    private static IdentifierComplexTypeDAO identifierComplexTypeDAO = new IdentifierComplexTypeDAOImpl();

    public ConceptID getConceptID(Node node) {
        return new ConceptID(identifierComplexTypeDAO.getIdentifierComplexType(node));
    }
}
