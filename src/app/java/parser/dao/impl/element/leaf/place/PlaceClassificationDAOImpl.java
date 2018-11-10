package app.java.parser.dao.impl.element.leaf.place;

import app.java.common.Utils;
import app.java.parser.dao.complex.ConceptComplexTypeDAO;
import app.java.parser.dao.element.leaf.place.PlaceClassificationDAO;
import app.java.parser.dao.impl.complex.ConceptComplexTypeDAOImpl;
import app.java.parser.model.attribute.lido.LidoType;
import app.java.parser.model.element.leaf.place.PlaceClassification;
import org.w3c.dom.Node;

import java.util.HashMap;

public class PlaceClassificationDAOImpl implements PlaceClassificationDAO {
    private static ConceptComplexTypeDAO conceptComplexTypeDAO = new ConceptComplexTypeDAOImpl();
    private static Utils utils = new Utils();

    public PlaceClassification getPlaceClassification(Node node) {
        HashMap<String, String> attributes = utils.getAttributes(node);

        return new PlaceClassification(
                conceptComplexTypeDAO.getConceptComplexType(node),
                new LidoType(attributes.get("lido:type"))
        );
    }
}
