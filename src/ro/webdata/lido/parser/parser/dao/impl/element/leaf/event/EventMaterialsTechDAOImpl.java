package ro.webdata.lido.parser.parser.dao.impl.element.leaf.event;

import ro.webdata.lido.parser.common.Utils;
import ro.webdata.lido.parser.parser.dao.complex.materials.MaterialsTechSetComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.event.EventMaterialsTechDAO;
import ro.webdata.lido.parser.parser.dao.impl.complex.materials.MaterialsTechSetComplexTypeDAOImpl;
import ro.webdata.lido.parser.parser.model.attribute.lido.LidoSortOrder;
import ro.webdata.lido.parser.parser.model.element.leaf.event.EventMaterialsTech;
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
