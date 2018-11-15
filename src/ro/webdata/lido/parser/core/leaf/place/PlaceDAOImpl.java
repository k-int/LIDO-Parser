package ro.webdata.lido.parser.core.leaf.place;

import ro.webdata.lido.parser.core.complex.placeComplexType.PlaceComplexTypeDAO;
import ro.webdata.lido.parser.core.complex.placeComplexType.PlaceComplexTypeDAOImpl;
import org.w3c.dom.Node;

public class PlaceDAOImpl implements PlaceDAO {
    private static PlaceComplexTypeDAO placeComplexTypeDAO = new PlaceComplexTypeDAOImpl();

    public Place getPlace(Node node) {
        return new Place(placeComplexTypeDAO.getPlaceComplexType(node));
    }
}
