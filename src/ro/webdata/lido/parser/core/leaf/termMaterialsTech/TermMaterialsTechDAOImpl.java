package ro.webdata.lido.parser.core.leaf.termMaterialsTech;

import ro.webdata.lido.parser.common.Utils;
import ro.webdata.lido.parser.core.complex.conceptComplexType.ConceptComplexTypeDAO;
import ro.webdata.lido.parser.core.complex.conceptComplexType.ConceptComplexTypeDAOImpl;
import ro.webdata.lido.parser.core.attribute.LidoSortOrder;
import ro.webdata.lido.parser.core.attribute.LidoType;
import org.w3c.dom.Node;

import java.util.HashMap;

public class TermMaterialsTechDAOImpl implements TermMaterialsTechDAO {
    private static ConceptComplexTypeDAO conceptComplexTypeDAO = new ConceptComplexTypeDAOImpl();
    private static Utils utils = new Utils();

    public TermMaterialsTech getTermMaterialsTech(Node node) {
        HashMap<String, String> attributes = utils.getAttributes(node);

        return new TermMaterialsTech(
                conceptComplexTypeDAO.getConceptComplexType(node),
                new LidoType(attributes.get("lido:type")),
                new LidoSortOrder(attributes.get("lido:sortorder"))
        );
    }
}
