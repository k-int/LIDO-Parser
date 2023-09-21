package webdata.parser.xml.lido.core.set.repositorySet;

import org.w3c.dom.Node;
import ro.webdata.parser.xml.lido.core.complex.repositorySetComplexType.RepositorySetComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.repositorySetComplexType.RepositorySetComplexTypeDAOImpl;

public class RepositorySetDAOImpl implements RepositorySetDAO {
    private static RepositorySetComplexTypeDAO repositorySetComplexTypeDAO = new RepositorySetComplexTypeDAOImpl();

    public RepositorySet getRepositorySet(Node node) {
        return new RepositorySet(repositorySetComplexTypeDAO.getRepositorySetComplexType(node));
    }
}
