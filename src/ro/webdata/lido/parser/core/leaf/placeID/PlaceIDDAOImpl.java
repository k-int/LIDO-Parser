package ro.webdata.lido.parser.core.leaf.placeID;

import ro.webdata.lido.parser.core.complex.identifierComplexType.IdentifierComplexTypeDAO;
import ro.webdata.lido.parser.core.complex.identifierComplexType.IdentifierComplexTypeDAOImpl;
import org.w3c.dom.Node;

public class PlaceIDDAOImpl implements PlaceIDDAO {
    private static IdentifierComplexTypeDAO identifierComplexTypeDAO = new IdentifierComplexTypeDAOImpl();

    public PlaceID getPlaceID(Node node) {
        return new PlaceID(identifierComplexTypeDAO.getIdentifierComplexType(node));
    }
}
