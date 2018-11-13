package ro.webdata.lido.parser.parser.dao.impl.element.leaf.record;

import ro.webdata.lido.parser.common.Utils;
import ro.webdata.lido.parser.parser.dao.complex.TextComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.record.RecordMetadataDateDAO;
import ro.webdata.lido.parser.parser.dao.impl.complex.TextComplexTypeDAOImpl;
import ro.webdata.lido.parser.parser.model.attribute.lido.LidoSource;
import ro.webdata.lido.parser.parser.model.attribute.lido.LidoType;
import ro.webdata.lido.parser.parser.model.element.leaf.record.RecordMetadataDate;
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
