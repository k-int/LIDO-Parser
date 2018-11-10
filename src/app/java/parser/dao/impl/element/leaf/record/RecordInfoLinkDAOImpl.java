package app.java.parser.dao.impl.element.leaf.record;

import app.java.parser.dao.complex.WebResourceComplexTypeDAO;
import app.java.parser.dao.element.leaf.record.RecordInfoLinkDAO;
import app.java.parser.dao.impl.complex.WebResourceComplexTypeDAOImpl;
import app.java.parser.model.element.leaf.record.RecordInfoLink;
import org.w3c.dom.Node;

public class RecordInfoLinkDAOImpl implements RecordInfoLinkDAO {
    private static WebResourceComplexTypeDAO webResourceComplexTypeDAO = new WebResourceComplexTypeDAOImpl();

    public RecordInfoLink getRecordInfoLink(Node node) {
        return new RecordInfoLink(webResourceComplexTypeDAO.getWebResourceComplexType(node));
    }
}
