package ro.webdata.lido.parser.core.leaf.eventMaterialsTech;

import ro.webdata.lido.parser.common.Utils;
import ro.webdata.lido.parser.core.complex.materialsTechSetComplexType.MaterialsTechSetComplexTypeDAO;
import ro.webdata.lido.parser.core.complex.materialsTechSetComplexType.MaterialsTechSetComplexTypeDAOImpl;
import ro.webdata.lido.parser.core.attribute.LidoSortOrder;
import org.w3c.dom.Node;

import java.util.HashMap;

public class EventMaterialsTechDAOImpl implements EventMaterialsTechDAO {
    private static MaterialsTechSetComplexTypeDAO materialsTechSetComplexTypeDAO = new MaterialsTechSetComplexTypeDAOImpl();
    private static Utils utils = new Utils();

    public EventMaterialsTech getEventMaterialsTech(Node node) {
        HashMap<String, String> attributes = utils.getAttributes(node);

        return new EventMaterialsTech(
                materialsTechSetComplexTypeDAO.getMaterialsTechSetComplexType(node),
                new LidoSortOrder(attributes.get("lido:sortorder"))
        );
    }
}
