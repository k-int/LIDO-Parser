package ro.webdata.lido.parser.core.leaf.repositoryLocation;

import ro.webdata.lido.parser.core.complex.placeComplexType.PlaceComplexTypeDAO;
import ro.webdata.lido.parser.core.complex.placeComplexType.PlaceComplexTypeDAOImpl;
import org.w3c.dom.Node;

public class RepositoryLocationDAOImpl implements RepositoryLocationDAO {
    private static PlaceComplexTypeDAO placeComplexTypeDAO = new PlaceComplexTypeDAOImpl();

    public RepositoryLocation getRepositoryLocation(Node node) {
        return new RepositoryLocation(placeComplexTypeDAO.getPlaceComplexType(node));
    }
}
