package ro.webdata.lido.parser.parser.dao.impl.element.leaf.displayStateEdition;

import ro.webdata.lido.parser.parser.dao.complex.TextComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.displayStateEdition.DisplayStateDAO;
import ro.webdata.lido.parser.parser.dao.impl.complex.TextComplexTypeDAOImpl;
import ro.webdata.lido.parser.parser.model.element.leaf.displayStateEdition.DisplayState;
import org.w3c.dom.Node;

public class DisplayStateDAOImpl implements DisplayStateDAO {
    private static TextComplexTypeDAO textComplexTypeDAO = new TextComplexTypeDAOImpl();

    public DisplayState getDisplayState(Node node) {
        return new DisplayState(textComplexTypeDAO.getTextComplexType(node));
    }
}
