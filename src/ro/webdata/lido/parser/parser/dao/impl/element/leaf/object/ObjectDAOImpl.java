package ro.webdata.lido.parser.parser.dao.impl.element.leaf.object;

import ro.webdata.lido.parser.parser.dao.complex.object.ObjectComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.object.ObjectDAO;
import ro.webdata.lido.parser.parser.dao.impl.complex.object.ObjectComplexTypeDAOImpl;
import ro.webdata.lido.parser.parser.model.element.leaf.object.Object;
import org.w3c.dom.Node;

public class ObjectDAOImpl implements ObjectDAO {
    private static ObjectComplexTypeDAO objectComplexTypeDAO = new ObjectComplexTypeDAOImpl();

    public Object getObject(Node node) {
        return new Object(objectComplexTypeDAO.getObjectComplexType(node));
    }
}
