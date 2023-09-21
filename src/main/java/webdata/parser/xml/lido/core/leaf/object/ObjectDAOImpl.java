package webdata.parser.xml.lido.core.leaf.object;

import org.w3c.dom.Node;
import ro.webdata.parser.xml.lido.core.complex.objectComplexType.ObjectComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.objectComplexType.ObjectComplexTypeDAOImpl;

public class ObjectDAOImpl implements ObjectDAO {
    private static ObjectComplexTypeDAO objectComplexTypeDAO = new ObjectComplexTypeDAOImpl();

    public Object getObject(Node node) {
        return new Object(objectComplexTypeDAO.getObjectComplexType(node));
    }
}
