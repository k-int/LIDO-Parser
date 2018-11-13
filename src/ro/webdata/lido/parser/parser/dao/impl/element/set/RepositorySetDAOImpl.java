package ro.webdata.lido.parser.parser.dao.impl.element.set;

import ro.webdata.lido.parser.parser.dao.complex.RepositorySetComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.set.RepositorySetDAO;
import ro.webdata.lido.parser.parser.dao.impl.complex.RepositorySetComplexTypeDAOImpl;
import ro.webdata.lido.parser.parser.model.element.set.RepositorySet;
import org.w3c.dom.Node;

public class RepositorySetDAOImpl implements RepositorySetDAO {
    private static RepositorySetComplexTypeDAO repositorySetComplexTypeDAO = new RepositorySetComplexTypeDAOImpl();

    public RepositorySet getRepositorySet(Node node) {
        return new RepositorySet(repositorySetComplexTypeDAO.getRepositorySetComplexType(node));
    }
}
