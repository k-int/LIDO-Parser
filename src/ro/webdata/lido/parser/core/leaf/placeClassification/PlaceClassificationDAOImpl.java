package ro.webdata.lido.parser.core.leaf.placeClassification;

import ro.webdata.lido.parser.common.Utils;
import ro.webdata.lido.parser.core.complex.conceptComplexType.ConceptComplexTypeDAO;
import ro.webdata.lido.parser.core.complex.conceptComplexType.ConceptComplexTypeDAOImpl;
import ro.webdata.lido.parser.core.attribute.LidoType;
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
