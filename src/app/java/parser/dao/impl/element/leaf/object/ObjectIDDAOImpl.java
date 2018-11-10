package app.java.parser.dao.impl.element.leaf.object;

import app.java.parser.dao.complex.IdentifierComplexTypeDAO;
import app.java.parser.dao.element.leaf.object.ObjectIDDAO;
import app.java.parser.dao.impl.complex.IdentifierComplexTypeDAOImpl;
import app.java.parser.model.element.leaf.object.ObjectID;
import org.w3c.dom.Node;

public class ObjectIDDAOImpl implements ObjectIDDAO {
    private static IdentifierComplexTypeDAO identifierComplexTypeDAO = new IdentifierComplexTypeDAOImpl();

    public ObjectID getObjectID(Node node) {
        return new ObjectID(identifierComplexTypeDAO.getIdentifierComplexType(node));
    }
}
