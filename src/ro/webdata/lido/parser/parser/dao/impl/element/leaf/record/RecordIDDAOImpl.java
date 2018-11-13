package ro.webdata.lido.parser.parser.dao.impl.element.leaf.record;

import ro.webdata.lido.parser.parser.dao.complex.IdentifierComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.record.RecordIDDAO;
import ro.webdata.lido.parser.parser.dao.impl.complex.IdentifierComplexTypeDAOImpl;
import ro.webdata.lido.parser.parser.model.element.leaf.record.RecordID;
import org.w3c.dom.Node;

public class RecordIDDAOImpl implements RecordIDDAO {
    private static IdentifierComplexTypeDAO identifierComplexTypeDAO = new IdentifierComplexTypeDAOImpl();

    public RecordID getRecordID(Node node) {
        return new RecordID(identifierComplexTypeDAO.getIdentifierComplexType(node));
    }
}
