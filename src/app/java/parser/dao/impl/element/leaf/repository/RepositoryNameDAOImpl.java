package app.java.parser.dao.impl.element.leaf.repository;

import app.java.parser.dao.complex.LegalBodyRefComplexTypeDAO;
import app.java.parser.dao.element.leaf.repository.RepositoryNameDAO;
import app.java.parser.dao.impl.complex.LegalBodyRefComplexTypeDAOImpl;
import app.java.parser.model.element.leaf.repository.RepositoryName;
import org.w3c.dom.Node;

public class RepositoryNameDAOImpl implements RepositoryNameDAO {
    private static LegalBodyRefComplexTypeDAO legalBodyRefComplexTypeDAO = new LegalBodyRefComplexTypeDAOImpl();

    public RepositoryName getRepositoryName(Node node) {
        return new RepositoryName(legalBodyRefComplexTypeDAO.getLegalBodyRefComplexType(node));
    }
}
