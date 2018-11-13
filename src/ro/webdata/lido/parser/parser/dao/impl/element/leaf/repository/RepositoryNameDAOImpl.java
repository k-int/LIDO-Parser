package ro.webdata.lido.parser.parser.dao.impl.element.leaf.repository;

import ro.webdata.lido.parser.parser.dao.complex.LegalBodyRefComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.repository.RepositoryNameDAO;
import ro.webdata.lido.parser.parser.dao.impl.complex.LegalBodyRefComplexTypeDAOImpl;
import ro.webdata.lido.parser.parser.model.element.leaf.repository.RepositoryName;
import org.w3c.dom.Node;

public class RepositoryNameDAOImpl implements RepositoryNameDAO {
    private static LegalBodyRefComplexTypeDAO legalBodyRefComplexTypeDAO = new LegalBodyRefComplexTypeDAOImpl();

    public RepositoryName getRepositoryName(Node node) {
        return new RepositoryName(legalBodyRefComplexTypeDAO.getLegalBodyRefComplexType(node));
    }
}
