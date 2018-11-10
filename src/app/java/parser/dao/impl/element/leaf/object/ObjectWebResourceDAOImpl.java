package app.java.parser.dao.impl.element.leaf.object;

import app.java.parser.dao.complex.WebResourceComplexTypeDAO;
import app.java.parser.dao.element.leaf.object.ObjectWebResourceDAO;
import app.java.parser.dao.impl.complex.WebResourceComplexTypeDAOImpl;
import app.java.parser.model.element.leaf.object.ObjectWebResource;
import org.w3c.dom.Node;

public class ObjectWebResourceDAOImpl implements ObjectWebResourceDAO {
    private static WebResourceComplexTypeDAO webResourceComplexTypeDAO = new WebResourceComplexTypeDAOImpl();

    public ObjectWebResource getObjectWebResource(Node node) {
        return new ObjectWebResource(webResourceComplexTypeDAO.getWebResourceComplexType(node));
    }
}
