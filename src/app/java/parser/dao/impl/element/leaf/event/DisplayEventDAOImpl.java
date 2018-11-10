package app.java.parser.dao.impl.element.leaf.event;

import app.java.parser.dao.complex.TextComplexTypeDAO;
import app.java.parser.dao.element.leaf.event.DisplayEventDAO;
import app.java.parser.dao.impl.complex.TextComplexTypeDAOImpl;
import app.java.parser.model.element.leaf.event.DisplayEvent;
import org.w3c.dom.Node;

public class DisplayEventDAOImpl implements DisplayEventDAO {
    private TextComplexTypeDAO textComplexTypeDAO = new TextComplexTypeDAOImpl();

    public DisplayEvent getDisplayEvent(Node node) {
        return new DisplayEvent(textComplexTypeDAO.getTextComplexType(node));
    }
}
