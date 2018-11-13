package ro.webdata.lido.parser.parser.dao.impl.element.leaf.record;

import ro.webdata.lido.parser.parser.dao.complex.WebResourceComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.record.RecordInfoLinkDAO;
import ro.webdata.lido.parser.parser.dao.impl.complex.WebResourceComplexTypeDAOImpl;
import ro.webdata.lido.parser.parser.model.element.leaf.record.RecordInfoLink;
import org.w3c.dom.Node;

public class RecordInfoLinkDAOImpl implements RecordInfoLinkDAO {
    private static WebResourceComplexTypeDAO webResourceComplexTypeDAO = new WebResourceComplexTypeDAOImpl();

    public RecordInfoLink getRecordInfoLink(Node node) {
        return new RecordInfoLink(webResourceComplexTypeDAO.getWebResourceComplexType(node));
    }
}
