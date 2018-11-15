package ro.webdata.lido.parser.core.leaf.culture;

import ro.webdata.lido.parser.common.Utils;
import ro.webdata.lido.parser.core.complex.conceptComplexType.ConceptComplexTypeDAO;
import ro.webdata.lido.parser.core.complex.conceptComplexType.ConceptComplexTypeDAOImpl;
import ro.webdata.lido.parser.core.attribute.LidoSortOrder;
import org.w3c.dom.Node;

import java.util.HashMap;

public class CultureDAOImpl implements CultureDAO {
    private ConceptComplexTypeDAO conceptComplexTypeDAO = new ConceptComplexTypeDAOImpl();
    private Utils utils = new Utils();

    public Culture getCulture(Node node) {
        HashMap<String, String> attributes = utils.getAttributes(node);

        return new Culture(
                conceptComplexTypeDAO.getConceptComplexType(node),
                new LidoSortOrder(attributes.get("lido:sortorder"))
        );
    }
}
