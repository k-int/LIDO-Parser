package app.java.parser.dao.impl.element.leaf.event;

import app.java.common.Utils;
import app.java.parser.dao.complex.materials.MaterialsTechSetComplexTypeDAO;
import app.java.parser.dao.element.leaf.event.EventMaterialsTechDAO;
import app.java.parser.dao.impl.complex.materials.MaterialsTechSetComplexTypeDAOImpl;
import app.java.parser.model.attribute.lido.LidoSortOrder;
import app.java.parser.model.element.leaf.event.EventMaterialsTech;
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
