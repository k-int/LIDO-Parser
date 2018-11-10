package app.java.parser.dao.impl.element.leaf;

import app.java.parser.dao.complex.ConceptComplexTypeDAO;
import app.java.parser.dao.element.leaf.CategoryDAO;
import app.java.parser.dao.impl.complex.ConceptComplexTypeDAOImpl;
import app.java.parser.model.element.leaf.Category;
import org.w3c.dom.Node;

public class CategoryDAOImpl implements CategoryDAO {
    private static ConceptComplexTypeDAO conceptComplexTypeDAO = new ConceptComplexTypeDAOImpl();

    public Category getCategory(Node node) {
        return new Category(conceptComplexTypeDAO.getConceptComplexType(node));
    }
}
