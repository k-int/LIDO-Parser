package ro.webdata.lido.parser.core.leaf.objectPublishedID;

import ro.webdata.lido.parser.core.complex.identifierComplexType.IdentifierComplexTypeDAO;
import ro.webdata.lido.parser.core.complex.identifierComplexType.IdentifierComplexTypeDAOImpl;
import org.w3c.dom.Node;

public class ObjectPublishedIDDAOImpl implements ObjectPublishedIDDAO {
    private static IdentifierComplexTypeDAO identifierComplexTypeDAO = new IdentifierComplexTypeDAOImpl();

    public ObjectPublishedID getObjectPublishedID(Node node) {
        return new ObjectPublishedID(identifierComplexTypeDAO.getIdentifierComplexType(node));
    }
}
