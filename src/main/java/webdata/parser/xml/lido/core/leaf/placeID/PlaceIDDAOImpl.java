package webdata.parser.xml.lido.core.leaf.placeID;

import org.w3c.dom.Node;
import ro.webdata.parser.xml.lido.core.complex.identifierComplexType.IdentifierComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.identifierComplexType.IdentifierComplexTypeDAOImpl;

public class PlaceIDDAOImpl implements PlaceIDDAO {
    private static IdentifierComplexTypeDAO identifierComplexTypeDAO = new IdentifierComplexTypeDAOImpl();

    public PlaceID getPlaceID(Node node) {
        return new PlaceID(identifierComplexTypeDAO.getIdentifierComplexType(node));
    }
}
