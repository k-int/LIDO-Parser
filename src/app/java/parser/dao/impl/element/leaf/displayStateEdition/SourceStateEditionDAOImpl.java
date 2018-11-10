package app.java.parser.dao.impl.element.leaf.displayStateEdition;

import app.java.parser.dao.complex.TextComplexTypeDAO;
import app.java.parser.dao.element.leaf.displayStateEdition.SourceStateEditionDAO;
import app.java.parser.dao.impl.complex.TextComplexTypeDAOImpl;
import app.java.parser.model.element.leaf.displayStateEdition.SourceStateEdition;
import org.w3c.dom.Node;

public class SourceStateEditionDAOImpl implements SourceStateEditionDAO {
    private static TextComplexTypeDAO textComplexTypeDAO = new TextComplexTypeDAOImpl();

    public SourceStateEdition getSourceStateEdition(Node node) {
        return new SourceStateEdition(textComplexTypeDAO.getTextComplexType(node));
    }
}
