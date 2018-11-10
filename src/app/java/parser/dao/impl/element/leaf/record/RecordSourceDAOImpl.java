package app.java.parser.dao.impl.element.leaf.record;

import app.java.common.Utils;
import app.java.parser.dao.complex.LegalBodyRefComplexTypeDAO;
import app.java.parser.dao.element.leaf.record.RecordSourceDAO;
import app.java.parser.dao.impl.complex.LegalBodyRefComplexTypeDAOImpl;
import app.java.parser.model.attribute.lido.LidoSortOrder;
import app.java.parser.model.attribute.lido.LidoType;
import app.java.parser.model.element.leaf.record.RecordSource;
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
