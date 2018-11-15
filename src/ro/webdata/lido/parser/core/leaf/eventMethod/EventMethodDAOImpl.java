package ro.webdata.lido.parser.core.leaf.eventMethod;

import ro.webdata.lido.parser.common.Utils;
import ro.webdata.lido.parser.core.complex.conceptComplexType.ConceptComplexTypeDAO;
import ro.webdata.lido.parser.core.complex.conceptComplexType.ConceptComplexTypeDAOImpl;
import ro.webdata.lido.parser.core.attribute.LidoSortOrder;
import org.w3c.dom.Node;

import java.util.HashMap;

public class EventMethodDAOImpl implements EventMethodDAO {
    private static ConceptComplexTypeDAO conceptComplexTypeDAO = new ConceptComplexTypeDAOImpl();
    private static Utils utils = new Utils();

    public EventMethod getEventMethod(Node node) {
        HashMap<String, String> attributes = utils.getAttributes(node);

        return new EventMethod(
                conceptComplexTypeDAO.getConceptComplexType(node),
                new LidoSortOrder(attributes.get("lido:sortorder"))
        );
    }
}
