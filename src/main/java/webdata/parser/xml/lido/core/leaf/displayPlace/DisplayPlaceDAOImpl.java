package webdata.parser.xml.lido.core.leaf.displayPlace;

import org.w3c.dom.Node;
import ro.webdata.parser.xml.lido.core.complex.textComplexType.TextComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.textComplexType.TextComplexTypeDAOImpl;

public class DisplayPlaceDAOImpl implements DisplayPlaceDAO {
    private static TextComplexTypeDAO textComplexTypeDAO = new TextComplexTypeDAOImpl();

    public DisplayPlace getDisplayPlace(Node node) {
        return new DisplayPlace(textComplexTypeDAO.getTextComplexType(node));
    }
}
