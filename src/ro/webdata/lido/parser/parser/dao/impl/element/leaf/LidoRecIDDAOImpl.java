package ro.webdata.lido.parser.parser.dao.impl.element.leaf;

import ro.webdata.lido.parser.parser.dao.complex.IdentifierComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.LidoRecIDDAO;
import ro.webdata.lido.parser.parser.dao.impl.complex.IdentifierComplexTypeDAOImpl;
import ro.webdata.lido.parser.parser.model.element.leaf.LidoRecID;
import org.w3c.dom.Node;

public class LidoRecIDDAOImpl implements LidoRecIDDAO {
    private static IdentifierComplexTypeDAO identifierComplexTypeDAO = new IdentifierComplexTypeDAOImpl();

    public LidoRecID getLidoRecID(Node node) {
        return new LidoRecID(identifierComplexTypeDAO.getIdentifierComplexType(node));
    }
}
