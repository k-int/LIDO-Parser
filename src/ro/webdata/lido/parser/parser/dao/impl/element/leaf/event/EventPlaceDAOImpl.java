package ro.webdata.lido.parser.parser.dao.impl.element.leaf.event;

import ro.webdata.lido.parser.common.Utils;
import ro.webdata.lido.parser.parser.dao.complex.place.PlaceSetComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.event.EventPlaceDAO;
import ro.webdata.lido.parser.parser.dao.impl.complex.place.PlaceSetComplexTypeDAOImpl;
import ro.webdata.lido.parser.parser.model.attribute.lido.LidoSortOrder;
import ro.webdata.lido.parser.parser.model.attribute.lido.LidoType;
import ro.webdata.lido.parser.parser.model.element.leaf.event.EventPlace;
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
