package ro.webdata.lido.parser.core.leaf.recordSource;

import ro.webdata.lido.parser.common.Utils;
import ro.webdata.lido.parser.core.complex.legalBodyRefComplexType.LegalBodyRefComplexTypeDAO;
import ro.webdata.lido.parser.core.complex.legalBodyRefComplexType.LegalBodyRefComplexTypeDAOImpl;
import ro.webdata.lido.parser.core.attribute.LidoSortOrder;
import ro.webdata.lido.parser.core.attribute.LidoType;
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
