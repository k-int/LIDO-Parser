package ro.webdata.lido.parser.core.leaf.partOfPlace;

import ro.webdata.lido.parser.core.complex.placeComplexType.PlaceComplexTypeDAO;
import ro.webdata.lido.parser.core.complex.placeComplexType.PlaceComplexTypeDAOImpl;
import org.w3c.dom.Node;

public class PartOfPlaceDAOImpl implements PartOfPlaceDAO {
    private static PlaceComplexTypeDAO placeComplexTypeDAO = new PlaceComplexTypeDAOImpl();

    public PartOfPlace getPartOfPlace(Node node) {
        return new PartOfPlace(placeComplexTypeDAO.getPlaceComplexType(node));
    }
}
