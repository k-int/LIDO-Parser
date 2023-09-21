package webdata.parser.xml.lido.core.leaf.recordType;

import org.w3c.dom.Node;
import ro.webdata.parser.xml.lido.core.complex.conceptComplexType.ConceptComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.conceptComplexType.ConceptComplexTypeDAOImpl;

public class RecordTypeDAOImpl implements RecordTypeDAO {
    private static ConceptComplexTypeDAO conceptComplexTypeDAO = new ConceptComplexTypeDAOImpl();

    public RecordType getRecordType(Node node) {
        return new RecordType(conceptComplexTypeDAO.getConceptComplexType(node));
    }
}
