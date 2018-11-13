package ro.webdata.lido.parser.parser.dao.impl.complex.place;

import ro.webdata.lido.parser.common.Utils;
import ro.webdata.lido.parser.parser.dao.complex.place.PlaceComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.GmlDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.place.PartOfPlaceDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.place.PlaceClassificationDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.place.PlaceIDDAO;
import ro.webdata.lido.parser.parser.dao.element.set.NamePlaceSetDAO;
import ro.webdata.lido.parser.parser.dao.impl.element.leaf.GmlDAOImpl;
import ro.webdata.lido.parser.parser.dao.impl.element.leaf.place.PartOfPlaceDAOImpl;
import ro.webdata.lido.parser.parser.dao.impl.element.leaf.place.PlaceClassificationDAOImpl;
import ro.webdata.lido.parser.parser.dao.impl.element.leaf.place.PlaceIDDAOImpl;
import ro.webdata.lido.parser.parser.dao.impl.element.set.NamePlaceSetDAOImpl;
import ro.webdata.lido.parser.parser.model.attribute.lido.LidoGeographicalEntity;
import ro.webdata.lido.parser.parser.model.attribute.lido.LidoPoliticalEntity;
import ro.webdata.lido.parser.parser.model.complex.place.PlaceComplexType;
import ro.webdata.lido.parser.parser.model.element.leaf.gml.Gml;
import ro.webdata.lido.parser.parser.model.element.leaf.place.PartOfPlace;
import ro.webdata.lido.parser.parser.model.element.leaf.place.PlaceClassification;
import ro.webdata.lido.parser.parser.model.element.leaf.place.PlaceID;
import ro.webdata.lido.parser.parser.model.element.set.NamePlaceSet;
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
