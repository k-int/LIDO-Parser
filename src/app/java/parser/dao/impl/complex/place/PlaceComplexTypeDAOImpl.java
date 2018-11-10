package app.java.parser.dao.impl.complex.place;

import app.java.common.Utils;
import app.java.parser.dao.complex.place.PlaceComplexTypeDAO;
import app.java.parser.dao.element.leaf.GmlDAO;
import app.java.parser.dao.element.leaf.place.PartOfPlaceDAO;
import app.java.parser.dao.element.leaf.place.PlaceClassificationDAO;
import app.java.parser.dao.element.leaf.place.PlaceIDDAO;
import app.java.parser.dao.element.set.NamePlaceSetDAO;
import app.java.parser.dao.impl.element.leaf.GmlDAOImpl;
import app.java.parser.dao.impl.element.leaf.place.PartOfPlaceDAOImpl;
import app.java.parser.dao.impl.element.leaf.place.PlaceClassificationDAOImpl;
import app.java.parser.dao.impl.element.leaf.place.PlaceIDDAOImpl;
import app.java.parser.dao.impl.element.set.NamePlaceSetDAOImpl;
import app.java.parser.model.attribute.lido.LidoGeographicalEntity;
import app.java.parser.model.attribute.lido.LidoPoliticalEntity;
import app.java.parser.model.complex.place.PlaceComplexType;
import app.java.parser.model.element.leaf.gml.Gml;
import app.java.parser.model.element.leaf.place.PartOfPlace;
import app.java.parser.model.element.leaf.place.PlaceClassification;
import app.java.parser.model.element.leaf.place.PlaceID;
import app.java.parser.model.element.set.NamePlaceSet;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.ArrayList;
import java.util.HashMap;

public class PlaceComplexTypeDAOImpl implements PlaceComplexTypeDAO {
    private static PlaceIDDAO placeIDParser = new PlaceIDDAOImpl();
    private static NamePlaceSetDAO namePlaceSetParser = new NamePlaceSetDAOImpl();
    private static GmlDAO gmlParser = new GmlDAOImpl();
    private static PartOfPlaceDAO partOfPlaceParser = new PartOfPlaceDAOImpl();
    private static PlaceClassificationDAO placeClassificationParser = new PlaceClassificationDAOImpl();
    private static Utils utils = new Utils();

    public PlaceComplexType getPlaceComplexType(Node node) {
        ArrayList<PlaceID> placeIDList = new ArrayList<PlaceID>();
        ArrayList<NamePlaceSet> namePlaceSetList = new ArrayList<NamePlaceSet>();
        ArrayList<Gml> gmlList = new ArrayList<Gml>();
        ArrayList<PartOfPlace> partOfPlaceList = new ArrayList<PartOfPlace>();
        ArrayList<PlaceClassification> placeClassificationList = new ArrayList<PlaceClassification>();
        HashMap<String, String> attributes = utils.getAttributes(node);

        NodeList childNodeList = node.getChildNodes();
        for (int i = 0; i < childNodeList.getLength(); i++) {
            Node child = childNodeList.item(i);
            String childName = child.getNodeName();

            switch (childName) {
                case "lido:placeID":
                    placeIDList.add(placeIDParser.getPlaceID(child));
                    break;
                case "lido:namePlaceSet":
                    namePlaceSetList.add(namePlaceSetParser.getNamePlaceSet(child));
                    break;
                case "lido:gml":
                    gmlList.add(gmlParser.getGml(child));
                    break;
                case "lido:partOfPlace":
                    partOfPlaceList.add(partOfPlaceParser.getPartOfPlace(child));
                    break;
                case "lido:placeClassification":
                    placeClassificationList.add(placeClassificationParser.getPlaceClassification(child));
                    break;
                default: break;
            }
        }

        return new PlaceComplexType(
                placeIDList, namePlaceSetList, gmlList,
                partOfPlaceList, placeClassificationList,
                new LidoPoliticalEntity(attributes.get("lido:politicalEntity")),
                new LidoGeographicalEntity(attributes.get("lido:geographicalEntity"))
        );
    }
}
