package app.java.parser.dao.impl.element.leaf.event;

import app.java.common.Utils;
import app.java.parser.dao.complex.ConceptComplexTypeDAO;
import app.java.parser.dao.element.leaf.event.EventMethodDAO;
import app.java.parser.dao.impl.complex.ConceptComplexTypeDAOImpl;
import app.java.parser.model.attribute.lido.LidoSortOrder;
import app.java.parser.model.element.leaf.event.EventMethod;
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
