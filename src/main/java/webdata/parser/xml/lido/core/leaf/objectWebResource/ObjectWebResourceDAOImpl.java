package webdata.parser.xml.lido.core.leaf.objectWebResource;

import org.w3c.dom.Node;
import ro.webdata.parser.xml.lido.core.complex.webResourceComplexType.WebResourceComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.webResourceComplexType.WebResourceComplexTypeDAOImpl;

public class ObjectWebResourceDAOImpl implements ObjectWebResourceDAO {
    private static WebResourceComplexTypeDAO webResourceComplexTypeDAO = new WebResourceComplexTypeDAOImpl();

    public ObjectWebResource getObjectWebResource(Node node) {
        return new ObjectWebResource(webResourceComplexTypeDAO.getWebResourceComplexType(node));
    }
}
