package ro.webdata.lido.parser.core.leaf.category;

import ro.webdata.lido.parser.core.complex.conceptComplexType.ConceptComplexTypeDAO;
import ro.webdata.lido.parser.core.complex.conceptComplexType.ConceptComplexTypeDAOImpl;
import org.w3c.dom.Node;

public class CategoryDAOImpl implements CategoryDAO {
    private static ConceptComplexTypeDAO conceptComplexTypeDAO = new ConceptComplexTypeDAOImpl();

    public Category getCategory(Node node) {
        return new Category(conceptComplexTypeDAO.getConceptComplexType(node));
    }
}
