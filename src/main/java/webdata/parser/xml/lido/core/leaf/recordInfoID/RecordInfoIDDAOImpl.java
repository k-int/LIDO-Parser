package webdata.parser.xml.lido.core.leaf.recordInfoID;

import org.w3c.dom.Node;
import ro.webdata.parser.xml.lido.core.complex.identifierComplexType.IdentifierComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.identifierComplexType.IdentifierComplexTypeDAOImpl;

public class RecordInfoIDDAOImpl implements RecordInfoIDDAO {
    private static IdentifierComplexTypeDAO identifierComplexTypeDAO = new IdentifierComplexTypeDAOImpl();

    public RecordInfoID getRecordInfoID(Node node) {
        return new RecordInfoID(identifierComplexTypeDAO.getIdentifierComplexType(node));
    }
}
