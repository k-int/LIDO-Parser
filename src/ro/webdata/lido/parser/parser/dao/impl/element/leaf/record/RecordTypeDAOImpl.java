package ro.webdata.lido.parser.parser.dao.impl.element.leaf.record;

import ro.webdata.lido.parser.parser.dao.complex.ConceptComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.record.RecordTypeDAO;
import ro.webdata.lido.parser.parser.dao.impl.complex.ConceptComplexTypeDAOImpl;
import ro.webdata.lido.parser.parser.model.element.leaf.record.RecordType;
import org.w3c.dom.Node;

public class RecordTypeDAOImpl implements RecordTypeDAO {
    private static ConceptComplexTypeDAO conceptComplexTypeDAO = new ConceptComplexTypeDAOImpl();

    public RecordType getRecordType(Node node) {
        return new RecordType(conceptComplexTypeDAO.getConceptComplexType(node));
    }
}
