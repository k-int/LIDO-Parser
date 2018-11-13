package ro.webdata.lido.parser.parser.dao.impl.element.leaf.legalBody;

import ro.webdata.lido.parser.parser.dao.complex.WebResourceComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.legalBody.LegalBodyWeblinkDAO;
import ro.webdata.lido.parser.parser.dao.impl.complex.WebResourceComplexTypeDAOImpl;
import ro.webdata.lido.parser.parser.model.element.leaf.legalBody.LegalBodyWeblink;
import org.w3c.dom.Node;

public class LegalBodyWeblinkDAOImpl implements LegalBodyWeblinkDAO {
    private static WebResourceComplexTypeDAO webResourceComplexTypeDAO = new WebResourceComplexTypeDAOImpl();

    public LegalBodyWeblink getLegalBodyWeblink(Node node) {
        return new LegalBodyWeblink(webResourceComplexTypeDAO.getWebResourceComplexType(node));
    }
}
