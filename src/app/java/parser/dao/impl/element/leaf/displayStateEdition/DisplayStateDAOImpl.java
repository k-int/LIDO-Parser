package app.java.parser.dao.impl.element.leaf.displayStateEdition;

import app.java.parser.dao.complex.TextComplexTypeDAO;
import app.java.parser.dao.element.leaf.displayStateEdition.DisplayStateDAO;
import app.java.parser.dao.impl.complex.TextComplexTypeDAOImpl;
import app.java.parser.model.element.leaf.displayStateEdition.DisplayState;
import org.w3c.dom.Node;

public class DisplayStateDAOImpl implements DisplayStateDAO {
    private static TextComplexTypeDAO textComplexTypeDAO = new TextComplexTypeDAOImpl();

    public DisplayState getDisplayState(Node node) {
        return new DisplayState(textComplexTypeDAO.getTextComplexType(node));
    }
}
