package ro.webdata.lido.parser.parser.dao.impl.element.leaf.subject;

import ro.webdata.lido.parser.common.Utils;
import ro.webdata.lido.parser.parser.dao.complex.place.PlaceSetComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.subject.SubjectPlaceDAO;
import ro.webdata.lido.parser.parser.dao.impl.complex.place.PlaceSetComplexTypeDAOImpl;
import ro.webdata.lido.parser.parser.model.attribute.lido.LidoSortOrder;
import ro.webdata.lido.parser.parser.model.element.leaf.subject.SubjectPlace;
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
