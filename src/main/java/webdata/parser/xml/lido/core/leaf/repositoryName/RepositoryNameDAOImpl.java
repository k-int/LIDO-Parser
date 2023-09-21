package webdata.parser.xml.lido.core.leaf.repositoryName;

import org.w3c.dom.Node;
import ro.webdata.parser.xml.lido.core.complex.legalBodyRefComplexType.LegalBodyRefComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.legalBodyRefComplexType.LegalBodyRefComplexTypeDAOImpl;

public class RepositoryNameDAOImpl implements RepositoryNameDAO {
    private static LegalBodyRefComplexTypeDAO legalBodyRefComplexTypeDAO = new LegalBodyRefComplexTypeDAOImpl();

    public RepositoryName getRepositoryName(Node node) {
        return new RepositoryName(legalBodyRefComplexTypeDAO.getLegalBodyRefComplexType(node));
    }
}
