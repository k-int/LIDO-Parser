package ro.webdata.lido.parser.core.leaf.recordInfoLink;

import ro.webdata.lido.parser.core.complex.webResourceComplexType.WebResourceComplexTypeDAO;
import ro.webdata.lido.parser.core.complex.webResourceComplexType.WebResourceComplexTypeDAOImpl;
import org.w3c.dom.Node;

public class RecordInfoLinkDAOImpl implements RecordInfoLinkDAO {
    private static WebResourceComplexTypeDAO webResourceComplexTypeDAO = new WebResourceComplexTypeDAOImpl();

    public RecordInfoLink getRecordInfoLink(Node node) {
        return new RecordInfoLink(webResourceComplexTypeDAO.getWebResourceComplexType(node));
    }
}
