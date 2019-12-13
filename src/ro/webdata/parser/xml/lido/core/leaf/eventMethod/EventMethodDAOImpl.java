package ro.webdata.parser.xml.lido.core.leaf.eventMethod;

import ro.webdata.parser.xml.lido.common.Utils;
import ro.webdata.parser.xml.lido.core.complex.conceptComplexType.ConceptComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.conceptComplexType.ConceptComplexTypeDAOImpl;
import ro.webdata.parser.xml.lido.core.attribute.LidoSortOrder;
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