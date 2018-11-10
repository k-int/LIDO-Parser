package app.java.parser.dao.impl.element.leaf.record;

import app.java.common.Utils;
import app.java.parser.dao.complex.TextComplexTypeDAO;
import app.java.parser.dao.element.leaf.record.RecordMetadataDateDAO;
import app.java.parser.dao.impl.complex.TextComplexTypeDAOImpl;
import app.java.parser.model.attribute.lido.LidoSource;
import app.java.parser.model.attribute.lido.LidoType;
import app.java.parser.model.element.leaf.record.RecordMetadataDate;
import org.w3c.dom.Node;

import java.util.HashMap;

public class RecordMetadataDateDAOImpl implements RecordMetadataDateDAO {
    private static TextComplexTypeDAO textComplexTypeDAO = new TextComplexTypeDAOImpl();
    private static Utils utils = new Utils();

    public RecordMetadataDate getRecordMetadataDate(Node node) {
        HashMap<String, String> attributes = utils.getAttributes(node);

        return new RecordMetadataDate(
                textComplexTypeDAO.getTextComplexType(node),
                new LidoType(attributes.get("lido:type")),
                new LidoSource(attributes.get("lido:source"))
        );
    }
}
