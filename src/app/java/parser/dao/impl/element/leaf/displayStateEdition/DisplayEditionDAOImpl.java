package app.java.parser.dao.impl.element.leaf.displayStateEdition;

import app.java.parser.dao.complex.TextComplexTypeDAO;
import app.java.parser.dao.element.leaf.displayStateEdition.DisplayEditionDAO;
import app.java.parser.dao.impl.complex.TextComplexTypeDAOImpl;
import app.java.parser.model.element.leaf.displayStateEdition.DisplayEdition;
import org.w3c.dom.Node;

public class DisplayEditionDAOImpl implements DisplayEditionDAO {
    private TextComplexTypeDAO textComplexTypeDAO = new TextComplexTypeDAOImpl();

    public DisplayEdition getDisplayEdition(Node node) {
        return new DisplayEdition(textComplexTypeDAO.getTextComplexType(node));
    }
}
