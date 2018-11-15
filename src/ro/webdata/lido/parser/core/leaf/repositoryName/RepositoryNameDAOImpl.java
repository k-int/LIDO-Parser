package ro.webdata.lido.parser.core.leaf.repositoryName;

import ro.webdata.lido.parser.core.complex.legalBodyRefComplexType.LegalBodyRefComplexTypeDAO;
import ro.webdata.lido.parser.core.complex.legalBodyRefComplexType.LegalBodyRefComplexTypeDAOImpl;
import org.w3c.dom.Node;

public class RepositoryNameDAOImpl implements RepositoryNameDAO {
    private static LegalBodyRefComplexTypeDAO legalBodyRefComplexTypeDAO = new LegalBodyRefComplexTypeDAOImpl();

    public RepositoryName getRepositoryName(Node node) {
        return new RepositoryName(legalBodyRefComplexTypeDAO.getLegalBodyRefComplexType(node));
    }
}
