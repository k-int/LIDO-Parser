package app.java.parser.dao.impl.element.leaf.event;

import app.java.common.Utils;
import app.java.parser.dao.complex.place.PlaceSetComplexTypeDAO;
import app.java.parser.dao.element.leaf.event.EventPlaceDAO;
import app.java.parser.dao.impl.complex.place.PlaceSetComplexTypeDAOImpl;
import app.java.parser.model.attribute.lido.LidoSortOrder;
import app.java.parser.model.attribute.lido.LidoType;
import app.java.parser.model.element.leaf.event.EventPlace;
import org.w3c.dom.Node;

import java.util.HashMap;

public class EventPlaceDAOImpl implements EventPlaceDAO {
    private static PlaceSetComplexTypeDAO placeSetComplexTypeDAO = new PlaceSetComplexTypeDAOImpl();
    private static Utils utils = new Utils();

    public EventPlace getEventPlace(Node node) {
        HashMap<String, String> attributes = utils.getAttributes(node);

        return new EventPlace(
                placeSetComplexTypeDAO.getPlaceSetComplexType(node),
                new LidoType(attributes.get("lido:type")),
                new LidoSortOrder(attributes.get("lido:sortorder"))
        );
    }
}
