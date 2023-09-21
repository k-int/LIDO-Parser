package webdata.parser.xml.lido.core.leaf.repositoryLocation;

import org.w3c.dom.Node;
import ro.webdata.parser.xml.lido.core.complex.placeComplexType.PlaceComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.placeComplexType.PlaceComplexTypeDAOImpl;

public class RepositoryLocationDAOImpl implements RepositoryLocationDAO {
    private static PlaceComplexTypeDAO placeComplexTypeDAO = new PlaceComplexTypeDAOImpl();

    public RepositoryLocation getRepositoryLocation(Node node) {
        return new RepositoryLocation(placeComplexTypeDAO.getPlaceComplexType(node));
    }
}
