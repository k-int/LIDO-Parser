package ro.webdata.lido.parser.parser.dao.impl.element.leaf.record;

import ro.webdata.lido.parser.parser.dao.complex.IdentifierComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.record.RecordInfoIDDAO;
import ro.webdata.lido.parser.parser.dao.impl.complex.IdentifierComplexTypeDAOImpl;
import ro.webdata.lido.parser.parser.model.element.leaf.record.RecordInfoID;
import org.w3c.dom.Node;

public class RecordInfoIDDAOImpl implements RecordInfoIDDAO {
    private static IdentifierComplexTypeDAO identifierComplexTypeDAO = new IdentifierComplexTypeDAOImpl();

    public RecordInfoID getRecordInfoID(Node node) {
        return new RecordInfoID(identifierComplexTypeDAO.getIdentifierComplexType(node));
    }
}
