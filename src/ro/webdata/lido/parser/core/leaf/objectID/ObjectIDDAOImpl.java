package ro.webdata.lido.parser.core.leaf.objectID;

import ro.webdata.lido.parser.core.complex.identifierComplexType.IdentifierComplexTypeDAO;
import ro.webdata.lido.parser.core.complex.identifierComplexType.IdentifierComplexTypeDAOImpl;
import org.w3c.dom.Node;

public class ObjectIDDAOImpl implements ObjectIDDAO {
    private static IdentifierComplexTypeDAO identifierComplexTypeDAO = new IdentifierComplexTypeDAOImpl();

    public ObjectID getObjectID(Node node) {
        return new ObjectID(identifierComplexTypeDAO.getIdentifierComplexType(node));
    }
}
