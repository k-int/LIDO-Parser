package webdata.parser.xml.lido.core.leaf.place;

import org.w3c.dom.Node;
import ro.webdata.parser.xml.lido.core.complex.placeComplexType.PlaceComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.placeComplexType.PlaceComplexTypeDAOImpl;

public class PlaceDAOImpl implements PlaceDAO {
    private static PlaceComplexTypeDAO placeComplexTypeDAO = new PlaceComplexTypeDAOImpl();

    public Place getPlace(Node node) {
        return new Place(placeComplexTypeDAO.getPlaceComplexType(node));
    }
}
