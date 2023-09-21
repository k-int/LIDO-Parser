package webdata.parser.xml.lido.core.leaf.category;

import org.w3c.dom.Node;
import ro.webdata.parser.xml.lido.core.complex.conceptComplexType.ConceptComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.conceptComplexType.ConceptComplexTypeDAOImpl;

public class CategoryDAOImpl implements CategoryDAO {
    private static ConceptComplexTypeDAO conceptComplexTypeDAO = new ConceptComplexTypeDAOImpl();

    public Category getCategory(Node node) {
        return new Category(conceptComplexTypeDAO.getConceptComplexType(node));
    }
}
