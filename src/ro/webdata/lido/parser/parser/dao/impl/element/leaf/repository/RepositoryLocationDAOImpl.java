package ro.webdata.lido.parser.parser.dao.impl.element.leaf.repository;

import ro.webdata.lido.parser.parser.dao.complex.place.PlaceComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.repository.RepositoryLocationDAO;
import ro.webdata.lido.parser.parser.dao.impl.complex.place.PlaceComplexTypeDAOImpl;
import ro.webdata.lido.parser.parser.model.element.leaf.repository.RepositoryLocation;
import org.w3c.dom.Node;

public class RepositoryLocationDAOImpl implements RepositoryLocationDAO {
    private static PlaceComplexTypeDAO placeComplexTypeDAO = new PlaceComplexTypeDAOImpl();

    public RepositoryLocation getRepositoryLocation(Node node) {
        return new RepositoryLocation(placeComplexTypeDAO.getPlaceComplexType(node));
    }
}
