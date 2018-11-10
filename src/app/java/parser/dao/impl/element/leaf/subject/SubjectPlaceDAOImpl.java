package app.java.parser.dao.impl.element.leaf.subject;

import app.java.common.Utils;
import app.java.parser.dao.complex.place.PlaceSetComplexTypeDAO;
import app.java.parser.dao.element.leaf.subject.SubjectPlaceDAO;
import app.java.parser.dao.impl.complex.place.PlaceSetComplexTypeDAOImpl;
import app.java.parser.model.attribute.lido.LidoSortOrder;
import app.java.parser.model.element.leaf.subject.SubjectPlace;
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
