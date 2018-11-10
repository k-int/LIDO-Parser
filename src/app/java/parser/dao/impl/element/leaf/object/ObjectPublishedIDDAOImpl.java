package app.java.parser.dao.impl.element.leaf.object;

import app.java.parser.dao.complex.IdentifierComplexTypeDAO;
import app.java.parser.dao.element.leaf.object.ObjectPublishedIDDAO;
import app.java.parser.dao.impl.complex.IdentifierComplexTypeDAOImpl;
import app.java.parser.model.element.leaf.object.ObjectPublishedID;
import org.w3c.dom.Node;

public class ObjectPublishedIDDAOImpl implements ObjectPublishedIDDAO {
    private static IdentifierComplexTypeDAO identifierComplexTypeDAO = new IdentifierComplexTypeDAOImpl();

    public ObjectPublishedID getObjectPublishedID(Node node) {
        return new ObjectPublishedID(identifierComplexTypeDAO.getIdentifierComplexType(node));
    }
}
