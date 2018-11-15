package ro.webdata.lido.parser.core.leaf.displayPlace;

import ro.webdata.lido.parser.core.complex.textComplexType.TextComplexTypeDAO;
import ro.webdata.lido.parser.core.complex.textComplexType.TextComplexTypeDAOImpl;
import org.w3c.dom.Node;

public class DisplayPlaceDAOImpl implements DisplayPlaceDAO {
    private static TextComplexTypeDAO textComplexTypeDAO = new TextComplexTypeDAOImpl();

    public DisplayPlace getDisplayPlace(Node node) {
        return new DisplayPlace(textComplexTypeDAO.getTextComplexType(node));
    }
}
