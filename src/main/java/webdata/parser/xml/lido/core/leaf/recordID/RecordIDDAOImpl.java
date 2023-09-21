package webdata.parser.xml.lido.core.leaf.recordID;

import org.w3c.dom.Node;
import ro.webdata.parser.xml.lido.core.complex.identifierComplexType.IdentifierComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.identifierComplexType.IdentifierComplexTypeDAOImpl;

public class RecordIDDAOImpl implements RecordIDDAO {
    private static IdentifierComplexTypeDAO identifierComplexTypeDAO = new IdentifierComplexTypeDAOImpl();

    public RecordID getRecordID(Node node) {
        return new RecordID(identifierComplexTypeDAO.getIdentifierComplexType(node));
    }
}
