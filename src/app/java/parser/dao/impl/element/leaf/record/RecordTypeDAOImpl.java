package app.java.parser.dao.impl.element.leaf.record;

import app.java.parser.dao.complex.ConceptComplexTypeDAO;
import app.java.parser.dao.element.leaf.record.RecordTypeDAO;
import app.java.parser.dao.impl.complex.ConceptComplexTypeDAOImpl;
import app.java.parser.model.element.leaf.record.RecordType;
import org.w3c.dom.Node;

public class RecordTypeDAOImpl implements RecordTypeDAO {
    private static ConceptComplexTypeDAO conceptComplexTypeDAO = new ConceptComplexTypeDAOImpl();

    public RecordType getRecordType(Node node) {
        return new RecordType(conceptComplexTypeDAO.getConceptComplexType(node));
    }
}
