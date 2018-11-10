package app.java.parser.dao.impl.complex.place;

import app.java.parser.dao.complex.place.PlaceSetComplexTypeDAO;
import app.java.parser.dao.element.leaf.place.DisplayPlaceDAO;
import app.java.parser.dao.element.leaf.place.PlaceDAO;
import app.java.parser.dao.impl.element.leaf.place.DisplayPlaceDAOImpl;
import app.java.parser.dao.impl.element.leaf.place.PlaceDAOImpl;
import app.java.parser.model.complex.place.PlaceSetComplexType;
import app.java.parser.model.element.leaf.place.DisplayPlace;
import app.java.parser.model.element.leaf.place.Place;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.ArrayList;

public class PlaceSetComplexTypeDAOImpl implements PlaceSetComplexTypeDAO {
    private static DisplayPlaceDAO displayPlaceParser = new DisplayPlaceDAOImpl();
    private static PlaceDAO placeParser = new PlaceDAOImpl();

    public PlaceSetComplexType getPlaceSetComplexType(Node node) {
        ArrayList<DisplayPlace> displayPlaceList = new ArrayList<DisplayPlace>();
        Place place = null;

        NodeList childNodeList = node.getChildNodes();
        for (int i = 0; i < childNodeList.getLength(); i++) {
            Node child = childNodeList.item(i);
            String childName = child.getNodeName();

            switch (childName) {
                case "lido:displayPlace":
                    displayPlaceList.add(displayPlaceParser.getDisplayPlace(child));
                    break;
                case "lido:place":
                    place = placeParser.getPlace(child);
                    break;
                default: break;
            }
        }

        return new PlaceSetComplexType(displayPlaceList, place);
    }
}
