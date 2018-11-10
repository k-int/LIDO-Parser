package app.java.parser.dao.impl.element.leaf.place;

import app.java.parser.dao.complex.place.PlaceComplexTypeDAO;
import app.java.parser.dao.element.leaf.place.PartOfPlaceDAO;
import app.java.parser.dao.impl.complex.place.PlaceComplexTypeDAOImpl;
import app.java.parser.model.element.leaf.place.PartOfPlace;
import org.w3c.dom.Node;

public class PartOfPlaceDAOImpl implements PartOfPlaceDAO {
    private static PlaceComplexTypeDAO placeComplexTypeDAO = new PlaceComplexTypeDAOImpl();

    public PartOfPlace getPartOfPlace(Node node) {
        return new PartOfPlace(placeComplexTypeDAO.getPlaceComplexType(node));
    }
}
