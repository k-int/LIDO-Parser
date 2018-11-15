package ro.webdata.lido.parser.core.set.recordInfoSet;

import ro.webdata.lido.parser.core.complex.recordInfoSetComplexType.RecordInfoSetComplexTypeDAO;
import ro.webdata.lido.parser.core.complex.recordInfoSetComplexType.RecordInfoSetComplexTypeDAOImpl;
import org.w3c.dom.Node;

public class RecordInfoSetDAOImpl implements RecordInfoSetDAO {
    private static RecordInfoSetComplexTypeDAO recordInfoSetComplexTypeDAO = new RecordInfoSetComplexTypeDAOImpl();

    public RecordInfoSet getRecordInfoSet(Node node) {
        return new RecordInfoSet(recordInfoSetComplexTypeDAO.getRecordInfoSetComplexType(node));
    }
}
