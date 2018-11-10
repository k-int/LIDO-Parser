package app.java.parser.dao.impl.element.leaf.record;

import app.java.parser.dao.complex.IdentifierComplexTypeDAO;
import app.java.parser.dao.element.leaf.record.RecordInfoIDDAO;
import app.java.parser.dao.impl.complex.IdentifierComplexTypeDAOImpl;
import app.java.parser.model.element.leaf.record.RecordInfoID;
import org.w3c.dom.Node;

public class RecordInfoIDDAOImpl implements RecordInfoIDDAO {
    private static IdentifierComplexTypeDAO identifierComplexTypeDAO = new IdentifierComplexTypeDAOImpl();

    public RecordInfoID getRecordInfoID(Node node) {
        return new RecordInfoID(identifierComplexTypeDAO.getIdentifierComplexType(node));
    }
}
