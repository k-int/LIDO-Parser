package ro.webdata.lido.parser.parser.dao.impl.element.leaf.object;

import ro.webdata.lido.parser.parser.dao.complex.WebResourceComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.object.ObjectWebResourceDAO;
import ro.webdata.lido.parser.parser.dao.impl.complex.WebResourceComplexTypeDAOImpl;
import ro.webdata.lido.parser.parser.model.element.leaf.object.ObjectWebResource;
import org.w3c.dom.Node;

public class ObjectWebResourceDAOImpl implements ObjectWebResourceDAO {
    private static WebResourceComplexTypeDAO webResourceComplexTypeDAO = new WebResourceComplexTypeDAOImpl();

    public ObjectWebResource getObjectWebResource(Node node) {
        return new ObjectWebResource(webResourceComplexTypeDAO.getWebResourceComplexType(node));
    }
}
