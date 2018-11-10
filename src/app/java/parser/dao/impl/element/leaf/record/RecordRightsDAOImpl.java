package app.java.parser.dao.impl.element.leaf.record;

import app.java.common.Utils;
import app.java.parser.dao.complex.RightsComplexTypeDAO;
import app.java.parser.dao.element.leaf.record.RecordRightsDAO;
import app.java.parser.dao.impl.complex.RightsComplexTypeDAOImpl;
import app.java.parser.model.attribute.lido.LidoSortOrder;
import app.java.parser.model.element.leaf.record.RecordRights;
import org.w3c.dom.Node;

import java.util.HashMap;

public class RecordRightsDAOImpl implements RecordRightsDAO {
    private static RightsComplexTypeDAO rightsComplexTypeDAO = new RightsComplexTypeDAOImpl();
    private static Utils utils = new Utils();

    public RecordRights getRecordRights(Node node) {
        HashMap<String, String> attributes = utils.getAttributes(node);

        return new RecordRights(
                rightsComplexTypeDAO.getRightsComplexType(node),
                new LidoSortOrder(attributes.get("lido:sortorder"))
        );
    }
}
