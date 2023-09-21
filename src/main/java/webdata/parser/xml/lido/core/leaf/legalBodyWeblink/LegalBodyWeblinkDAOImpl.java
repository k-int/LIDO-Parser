package webdata.parser.xml.lido.core.leaf.legalBodyWeblink;

import org.w3c.dom.Node;
import ro.webdata.parser.xml.lido.core.complex.webResourceComplexType.WebResourceComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.webResourceComplexType.WebResourceComplexTypeDAOImpl;

public class LegalBodyWeblinkDAOImpl implements LegalBodyWeblinkDAO {
    private static WebResourceComplexTypeDAO webResourceComplexTypeDAO = new WebResourceComplexTypeDAOImpl();

    public LegalBodyWeblink getLegalBodyWeblink(Node node) {
        return new LegalBodyWeblink(webResourceComplexTypeDAO.getWebResourceComplexType(node));
    }
}
