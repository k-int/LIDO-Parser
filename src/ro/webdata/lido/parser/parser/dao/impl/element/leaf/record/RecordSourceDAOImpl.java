package ro.webdata.lido.parser.parser.dao.impl.element.leaf.record;

import ro.webdata.lido.parser.common.Utils;
import ro.webdata.lido.parser.parser.dao.complex.LegalBodyRefComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.record.RecordSourceDAO;
import ro.webdata.lido.parser.parser.dao.impl.complex.LegalBodyRefComplexTypeDAOImpl;
import ro.webdata.lido.parser.parser.model.attribute.lido.LidoSortOrder;
import ro.webdata.lido.parser.parser.model.attribute.lido.LidoType;
import ro.webdata.lido.parser.parser.model.element.leaf.record.RecordSource;
import org.w3c.dom.Node;

import java.util.HashMap;

public class RecordSourceDAOImpl implements RecordSourceDAO {
    private static LegalBodyRefComplexTypeDAO legalBodyRefComplexTypeDAO = new LegalBodyRefComplexTypeDAOImpl();
    private static Utils utils = new Utils();

    public RecordSource getRecordSourceType(Node node) {
        HashMap<String, String> attributes = utils.getAttributes(node);

        return new RecordSource(
                legalBodyRefComplexTypeDAO.getLegalBodyRefComplexType(node),
                new LidoType(attributes.get("lido:type")),
                new LidoSortOrder(attributes.get("lido:sortorder"))
        );
    }
}
