package ro.webdata.parser.xml.lido.core.leaf.eventMaterialsTech;

import ro.webdata.parser.xml.lido.common.Utils;
import ro.webdata.parser.xml.lido.core.complex.materialsTechSetComplexType.MaterialsTechSetComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.materialsTechSetComplexType.MaterialsTechSetComplexTypeDAOImpl;
import ro.webdata.parser.xml.lido.core.attribute.LidoSortOrder;
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
