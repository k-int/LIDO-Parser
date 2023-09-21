package webdata.parser.xml.lido.core.leaf.recordInfoLink;

import org.w3c.dom.Node;
import ro.webdata.parser.xml.lido.core.complex.webResourceComplexType.WebResourceComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.webResourceComplexType.WebResourceComplexTypeDAOImpl;

public class RecordInfoLinkDAOImpl implements RecordInfoLinkDAO {
    private static WebResourceComplexTypeDAO webResourceComplexTypeDAO = new WebResourceComplexTypeDAOImpl();

    public RecordInfoLink getRecordInfoLink(Node node) {
        return new RecordInfoLink(webResourceComplexTypeDAO.getWebResourceComplexType(node));
    }
}
