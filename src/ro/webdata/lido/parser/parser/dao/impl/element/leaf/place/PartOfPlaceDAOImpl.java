package ro.webdata.lido.parser.parser.dao.impl.element.leaf.place;

import ro.webdata.lido.parser.parser.dao.complex.place.PlaceComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.place.PartOfPlaceDAO;
import ro.webdata.lido.parser.parser.dao.impl.complex.place.PlaceComplexTypeDAOImpl;
import ro.webdata.lido.parser.parser.model.element.leaf.place.PartOfPlace;
import org.w3c.dom.Node;

public class PartOfPlaceDAOImpl implements PartOfPlaceDAO {
    private static PlaceComplexTypeDAO placeComplexTypeDAO = new PlaceComplexTypeDAOImpl();

    public PartOfPlace getPartOfPlace(Node node) {
        return new PartOfPlace(placeComplexTypeDAO.getPlaceComplexType(node));
    }
}
