package ro.webdata.lido.parser.core.leaf.recordInfoID;

import ro.webdata.lido.parser.core.complex.identifierComplexType.IdentifierComplexTypeDAO;
import ro.webdata.lido.parser.core.complex.identifierComplexType.IdentifierComplexTypeDAOImpl;
import org.w3c.dom.Node;

public class RecordInfoIDDAOImpl implements RecordInfoIDDAO {
    private static IdentifierComplexTypeDAO identifierComplexTypeDAO = new IdentifierComplexTypeDAOImpl();

    public RecordInfoID getRecordInfoID(Node node) {
        return new RecordInfoID(identifierComplexTypeDAO.getIdentifierComplexType(node));
    }
}
