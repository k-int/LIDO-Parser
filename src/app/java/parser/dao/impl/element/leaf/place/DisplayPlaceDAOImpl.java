package app.java.parser.dao.impl.element.leaf.place;

import app.java.parser.dao.complex.TextComplexTypeDAO;
import app.java.parser.dao.element.leaf.place.DisplayPlaceDAO;
import app.java.parser.dao.impl.complex.TextComplexTypeDAOImpl;
import app.java.parser.model.element.leaf.place.DisplayPlace;
import org.w3c.dom.Node;

public class DisplayPlaceDAOImpl implements DisplayPlaceDAO {
    private static TextComplexTypeDAO textComplexTypeDAO = new TextComplexTypeDAOImpl();

    public DisplayPlace getDisplayPlace(Node node) {
        return new DisplayPlace(textComplexTypeDAO.getTextComplexType(node));
    }
}
