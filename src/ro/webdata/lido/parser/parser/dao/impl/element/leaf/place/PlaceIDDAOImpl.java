package ro.webdata.lido.parser.parser.dao.impl.element.leaf.place;

import ro.webdata.lido.parser.parser.dao.complex.IdentifierComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.place.PlaceIDDAO;
import ro.webdata.lido.parser.parser.dao.impl.complex.IdentifierComplexTypeDAOImpl;
import ro.webdata.lido.parser.parser.model.element.leaf.place.PlaceID;
import org.w3c.dom.Node;

public class PlaceIDDAOImpl implements PlaceIDDAO {
    private static IdentifierComplexTypeDAO identifierComplexTypeDAO = new IdentifierComplexTypeDAOImpl();

    public PlaceID getPlaceID(Node node) {
        return new PlaceID(identifierComplexTypeDAO.getIdentifierComplexType(node));
    }
}
