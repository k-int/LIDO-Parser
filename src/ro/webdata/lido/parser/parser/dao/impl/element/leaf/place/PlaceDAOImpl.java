package ro.webdata.lido.parser.parser.dao.impl.element.leaf.place;

import ro.webdata.lido.parser.parser.dao.complex.place.PlaceComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.place.PlaceDAO;
import ro.webdata.lido.parser.parser.dao.impl.complex.place.PlaceComplexTypeDAOImpl;
import ro.webdata.lido.parser.parser.model.element.leaf.place.Place;
import org.w3c.dom.Node;

public class PlaceDAOImpl implements PlaceDAO {
    private static PlaceComplexTypeDAO placeComplexTypeDAO = new PlaceComplexTypeDAOImpl();

    public Place getPlace(Node node) {
        return new Place(placeComplexTypeDAO.getPlaceComplexType(node));
    }
}
