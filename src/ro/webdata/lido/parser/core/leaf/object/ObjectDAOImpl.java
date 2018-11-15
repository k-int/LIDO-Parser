package ro.webdata.lido.parser.core.leaf.object;

import ro.webdata.lido.parser.core.complex.objectComplexType.ObjectComplexTypeDAO;
import ro.webdata.lido.parser.core.complex.objectComplexType.ObjectComplexTypeDAOImpl;
import org.w3c.dom.Node;

public class ObjectDAOImpl implements ObjectDAO {
    private static ObjectComplexTypeDAO objectComplexTypeDAO = new ObjectComplexTypeDAOImpl();

    public Object getObject(Node node) {
        return new Object(objectComplexTypeDAO.getObjectComplexType(node));
    }
}
