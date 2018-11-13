package ro.webdata.lido.parser.parser.dao.impl.element.leaf.place;

import ro.webdata.lido.parser.common.Utils;
import ro.webdata.lido.parser.parser.dao.complex.ConceptComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.place.PlaceClassificationDAO;
import ro.webdata.lido.parser.parser.dao.impl.complex.ConceptComplexTypeDAOImpl;
import ro.webdata.lido.parser.parser.model.attribute.lido.LidoType;
import ro.webdata.lido.parser.parser.model.element.leaf.place.PlaceClassification;
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
