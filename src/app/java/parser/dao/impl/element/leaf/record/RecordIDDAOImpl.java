package app.java.parser.dao.impl.element.leaf.record;

import app.java.parser.dao.complex.IdentifierComplexTypeDAO;
import app.java.parser.dao.element.leaf.record.RecordIDDAO;
import app.java.parser.dao.impl.complex.IdentifierComplexTypeDAOImpl;
import app.java.parser.model.element.leaf.record.RecordID;
import org.w3c.dom.Node;

public class RecordIDDAOImpl implements RecordIDDAO {
    private static IdentifierComplexTypeDAO identifierComplexTypeDAO = new IdentifierComplexTypeDAOImpl();

    public RecordID getRecordID(Node node) {
        return new RecordID(identifierComplexTypeDAO.getIdentifierComplexType(node));
    }
}
