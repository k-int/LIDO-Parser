package app.java.parser.dao.impl.element.set;

import app.java.parser.dao.complex.RecordInfoSetComplexTypeDAO;
import app.java.parser.dao.element.set.RecordInfoSetDAO;
import app.java.parser.dao.impl.complex.RecordInfoSetComplexTypeDAOImpl;
import app.java.parser.model.element.set.RecordInfoSet;
import org.w3c.dom.Node;

public class RecordInfoSetDAOImpl implements RecordInfoSetDAO {
    private static RecordInfoSetComplexTypeDAO recordInfoSetComplexTypeDAO = new RecordInfoSetComplexTypeDAOImpl();

    public RecordInfoSet getRecordInfoSet(Node node) {
        return new RecordInfoSet(recordInfoSetComplexTypeDAO.getRecordInfoSetComplexType(node));
    }
}
