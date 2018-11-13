package ro.webdata.lido.parser.parser.dao.impl.element.leaf.place;

import ro.webdata.lido.parser.parser.dao.complex.TextComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.place.DisplayPlaceDAO;
import ro.webdata.lido.parser.parser.dao.impl.complex.TextComplexTypeDAOImpl;
import ro.webdata.lido.parser.parser.model.element.leaf.place.DisplayPlace;
import org.w3c.dom.Node;

public class DisplayPlaceDAOImpl implements DisplayPlaceDAO {
    private static TextComplexTypeDAO textComplexTypeDAO = new TextComplexTypeDAOImpl();

    public DisplayPlace getDisplayPlace(Node node) {
        return new DisplayPlace(textComplexTypeDAO.getTextComplexType(node));
    }
}
