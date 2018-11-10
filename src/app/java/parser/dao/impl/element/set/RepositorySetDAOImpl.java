package app.java.parser.dao.impl.element.set;

import app.java.parser.dao.complex.RepositorySetComplexTypeDAO;
import app.java.parser.dao.element.set.RepositorySetDAO;
import app.java.parser.dao.impl.complex.RepositorySetComplexTypeDAOImpl;
import app.java.parser.model.element.set.RepositorySet;
import org.w3c.dom.Node;

public class RepositorySetDAOImpl implements RepositorySetDAO {
    private static RepositorySetComplexTypeDAO repositorySetComplexTypeDAO = new RepositorySetComplexTypeDAOImpl();

    public RepositorySet getRepositorySet(Node node) {
        return new RepositorySet(repositorySetComplexTypeDAO.getRepositorySetComplexType(node));
    }
}
