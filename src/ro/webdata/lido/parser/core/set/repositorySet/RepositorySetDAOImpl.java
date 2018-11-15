package ro.webdata.lido.parser.core.set.repositorySet;

import ro.webdata.lido.parser.core.complex.repositorySetComplexType.RepositorySetComplexTypeDAO;
import ro.webdata.lido.parser.core.complex.repositorySetComplexType.RepositorySetComplexTypeDAOImpl;
import org.w3c.dom.Node;

public class RepositorySetDAOImpl implements RepositorySetDAO {
    private static RepositorySetComplexTypeDAO repositorySetComplexTypeDAO = new RepositorySetComplexTypeDAOImpl();

    public RepositorySet getRepositorySet(Node node) {
        return new RepositorySet(repositorySetComplexTypeDAO.getRepositorySetComplexType(node));
    }
}
