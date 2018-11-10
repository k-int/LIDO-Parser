package app.java.parser.dao.impl.element.leaf.place;

import app.java.parser.dao.complex.place.PlaceComplexTypeDAO;
import app.java.parser.dao.element.leaf.place.PlaceDAO;
import app.java.parser.dao.impl.complex.place.PlaceComplexTypeDAOImpl;
import app.java.parser.model.element.leaf.place.Place;
import org.w3c.dom.Node;

public class PlaceDAOImpl implements PlaceDAO {
    private static PlaceComplexTypeDAO placeComplexTypeDAO = new PlaceComplexTypeDAOImpl();

    public Place getPlace(Node node) {
        return new Place(placeComplexTypeDAO.getPlaceComplexType(node));
    }
}
