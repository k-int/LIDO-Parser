package ro.webdata.lido.parser.parser.dao.impl.element.leaf.event;

import ro.webdata.lido.parser.parser.dao.complex.TextComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.event.DisplayEventDAO;
import ro.webdata.lido.parser.parser.dao.impl.complex.TextComplexTypeDAOImpl;
import ro.webdata.lido.parser.parser.model.element.leaf.event.DisplayEvent;
import org.w3c.dom.Node;

public class DisplayEventDAOImpl implements DisplayEventDAO {
    private TextComplexTypeDAO textComplexTypeDAO = new TextComplexTypeDAOImpl();

    public DisplayEvent getDisplayEvent(Node node) {
        return new DisplayEvent(textComplexTypeDAO.getTextComplexType(node));
    }
}
