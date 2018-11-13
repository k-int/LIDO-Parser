package ro.webdata.lido.parser.parser.dao.impl.element.set;

import ro.webdata.lido.parser.parser.dao.complex.RecordInfoSetComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.set.RecordInfoSetDAO;
import ro.webdata.lido.parser.parser.dao.impl.complex.RecordInfoSetComplexTypeDAOImpl;
import ro.webdata.lido.parser.parser.model.element.set.RecordInfoSet;
import org.w3c.dom.Node;

public class RecordInfoSetDAOImpl implements RecordInfoSetDAO {
    private static RecordInfoSetComplexTypeDAO recordInfoSetComplexTypeDAO = new RecordInfoSetComplexTypeDAOImpl();

    public RecordInfoSet getRecordInfoSet(Node node) {
        return new RecordInfoSet(recordInfoSetComplexTypeDAO.getRecordInfoSetComplexType(node));
    }
}
