package ro.webdata.lido.parser.parser.dao.impl.element.leaf.event;

import ro.webdata.lido.parser.common.Utils;
import ro.webdata.lido.parser.parser.dao.complex.ConceptComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.event.EventMethodDAO;
import ro.webdata.lido.parser.parser.dao.impl.complex.ConceptComplexTypeDAOImpl;
import ro.webdata.lido.parser.parser.model.attribute.lido.LidoSortOrder;
import ro.webdata.lido.parser.parser.model.element.leaf.event.EventMethod;
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
