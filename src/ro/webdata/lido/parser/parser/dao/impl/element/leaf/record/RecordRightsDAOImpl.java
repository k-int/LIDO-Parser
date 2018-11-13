package ro.webdata.lido.parser.parser.dao.impl.element.leaf.record;

import ro.webdata.lido.parser.common.Utils;
import ro.webdata.lido.parser.parser.dao.complex.RightsComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.record.RecordRightsDAO;
import ro.webdata.lido.parser.parser.dao.impl.complex.RightsComplexTypeDAOImpl;
import ro.webdata.lido.parser.parser.model.attribute.lido.LidoSortOrder;
import ro.webdata.lido.parser.parser.model.element.leaf.record.RecordRights;
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
