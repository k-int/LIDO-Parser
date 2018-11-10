package app.java.parser.dao.impl.element.leaf.object;

import app.java.parser.dao.complex.object.ObjectComplexTypeDAO;
import app.java.parser.dao.element.leaf.object.ObjectDAO;
import app.java.parser.dao.impl.complex.object.ObjectComplexTypeDAOImpl;
import app.java.parser.model.element.leaf.object.Object;
import org.w3c.dom.Node;

public class ObjectDAOImpl implements ObjectDAO {
    private static ObjectComplexTypeDAO objectComplexTypeDAO = new ObjectComplexTypeDAOImpl();

    public Object getObject(Node node) {
        return new Object(objectComplexTypeDAO.getObjectComplexType(node));
    }
}
