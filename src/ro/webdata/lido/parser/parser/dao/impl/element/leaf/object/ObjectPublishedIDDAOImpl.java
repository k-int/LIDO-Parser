package ro.webdata.lido.parser.parser.dao.impl.element.leaf.object;

import ro.webdata.lido.parser.parser.dao.complex.IdentifierComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.object.ObjectPublishedIDDAO;
import ro.webdata.lido.parser.parser.dao.impl.complex.IdentifierComplexTypeDAOImpl;
import ro.webdata.lido.parser.parser.model.element.leaf.object.ObjectPublishedID;
import org.w3c.dom.Node;

public class ObjectPublishedIDDAOImpl implements ObjectPublishedIDDAO {
    private static IdentifierComplexTypeDAO identifierComplexTypeDAO = new IdentifierComplexTypeDAOImpl();

    public ObjectPublishedID getObjectPublishedID(Node node) {
        return new ObjectPublishedID(identifierComplexTypeDAO.getIdentifierComplexType(node));
    }
}
