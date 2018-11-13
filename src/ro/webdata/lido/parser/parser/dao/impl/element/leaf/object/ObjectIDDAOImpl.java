package ro.webdata.lido.parser.parser.dao.impl.element.leaf.object;

import ro.webdata.lido.parser.parser.dao.complex.IdentifierComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.object.ObjectIDDAO;
import ro.webdata.lido.parser.parser.dao.impl.complex.IdentifierComplexTypeDAOImpl;
import ro.webdata.lido.parser.parser.model.element.leaf.object.ObjectID;
import org.w3c.dom.Node;

public class ObjectIDDAOImpl implements ObjectIDDAO {
    private static IdentifierComplexTypeDAO identifierComplexTypeDAO = new IdentifierComplexTypeDAOImpl();

    public ObjectID getObjectID(Node node) {
        return new ObjectID(identifierComplexTypeDAO.getIdentifierComplexType(node));
    }
}
