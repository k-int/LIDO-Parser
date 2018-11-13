package ro.webdata.lido.parser.parser.dao.impl.element.leaf.materials;

import ro.webdata.lido.parser.common.Utils;
import ro.webdata.lido.parser.parser.dao.complex.ConceptComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.materials.TermMaterialsTechDAO;
import ro.webdata.lido.parser.parser.dao.impl.complex.ConceptComplexTypeDAOImpl;
import ro.webdata.lido.parser.parser.model.attribute.lido.LidoSortOrder;
import ro.webdata.lido.parser.parser.model.attribute.lido.LidoType;
import ro.webdata.lido.parser.parser.model.element.leaf.materials.TermMaterialsTech;
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
