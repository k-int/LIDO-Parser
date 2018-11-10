package app.java.parser.dao.impl.element.leaf.repository;

import app.java.parser.dao.complex.place.PlaceComplexTypeDAO;
import app.java.parser.dao.element.leaf.repository.RepositoryLocationDAO;
import app.java.parser.dao.impl.complex.place.PlaceComplexTypeDAOImpl;
import app.java.parser.model.element.leaf.repository.RepositoryLocation;
import org.w3c.dom.Node;

public class RepositoryLocationDAOImpl implements RepositoryLocationDAO {
    private static PlaceComplexTypeDAO placeComplexTypeDAO = new PlaceComplexTypeDAOImpl();

    public RepositoryLocation getRepositoryLocation(Node node) {
        return new RepositoryLocation(placeComplexTypeDAO.getPlaceComplexType(node));
    }
}
