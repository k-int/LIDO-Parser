package ro.webdata.lido.parser.core.leaf.objectWebResource;

import ro.webdata.lido.parser.core.complex.webResourceComplexType.WebResourceComplexTypeDAO;
import ro.webdata.lido.parser.core.complex.webResourceComplexType.WebResourceComplexTypeDAOImpl;
import org.w3c.dom.Node;

public class ObjectWebResourceDAOImpl implements ObjectWebResourceDAO {
    private static WebResourceComplexTypeDAO webResourceComplexTypeDAO = new WebResourceComplexTypeDAOImpl();

    public ObjectWebResource getObjectWebResource(Node node) {
        return new ObjectWebResource(webResourceComplexTypeDAO.getWebResourceComplexType(node));
    }
}
