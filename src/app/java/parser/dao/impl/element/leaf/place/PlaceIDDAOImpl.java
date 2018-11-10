package app.java.parser.dao.impl.element.leaf.place;

import app.java.parser.dao.complex.IdentifierComplexTypeDAO;
import app.java.parser.dao.element.leaf.place.PlaceIDDAO;
import app.java.parser.dao.impl.complex.IdentifierComplexTypeDAOImpl;
import app.java.parser.model.element.leaf.place.PlaceID;
import org.w3c.dom.Node;

public class PlaceIDDAOImpl implements PlaceIDDAO {
    private static IdentifierComplexTypeDAO identifierComplexTypeDAO = new IdentifierComplexTypeDAOImpl();

    public PlaceID getPlaceID(Node node) {
        return new PlaceID(identifierComplexTypeDAO.getIdentifierComplexType(node));
    }
}
