package app.java.parser.dao.impl.element.leaf.legalBody;

import app.java.parser.dao.complex.WebResourceComplexTypeDAO;
import app.java.parser.dao.element.leaf.legalBody.LegalBodyWeblinkDAO;
import app.java.parser.dao.impl.complex.WebResourceComplexTypeDAOImpl;
import app.java.parser.model.element.leaf.legalBody.LegalBodyWeblink;
import org.w3c.dom.Node;

public class LegalBodyWeblinkDAOImpl implements LegalBodyWeblinkDAO {
    private static WebResourceComplexTypeDAO webResourceComplexTypeDAO = new WebResourceComplexTypeDAOImpl();

    public LegalBodyWeblink getLegalBodyWeblink(Node node) {
        return new LegalBodyWeblink(webResourceComplexTypeDAO.getWebResourceComplexType(node));
    }
}
