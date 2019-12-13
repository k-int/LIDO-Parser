package ro.webdata.parser.xml.lido.core.leaf.subjectPlace;

import ro.webdata.parser.xml.lido.common.Utils;
import ro.webdata.parser.xml.lido.core.complex.placeSetComplexType.PlaceSetComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.placeSetComplexType.PlaceSetComplexTypeDAOImpl;
import ro.webdata.parser.xml.lido.core.attribute.LidoSortOrder;
import org.w3c.dom.Node;

import java.util.HashMap;

public class SubjectPlaceDAOImpl implements SubjectPlaceDAO {
    private static PlaceSetComplexTypeDAO placeSetComplexTypeDAO = new PlaceSetComplexTypeDAOImpl();
    private static Utils utils = new Utils();

    public SubjectPlace getSubjectPlace(Node node) {
        HashMap<String, String> attributes = utils.getAttributes(node);

        return new SubjectPlace(
                placeSetComplexTypeDAO.getPlaceSetComplexType(node),
                new LidoSortOrder(attributes.get("lido:sortorder"))
        );
    }
}
