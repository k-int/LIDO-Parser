package app.java.parser.dao.impl.element.leaf.subject;

import app.java.common.Utils;
import app.java.parser.dao.complex.event.EventSetComplexTypeDAO;
import app.java.parser.dao.element.leaf.subject.SubjectEventDAO;
import app.java.parser.dao.impl.complex.event.EventSetComplexTypeDAOImpl;
import app.java.parser.model.attribute.lido.LidoSortOrder;
import app.java.parser.model.element.leaf.subject.SubjectEvent;
import org.w3c.dom.Node;

import java.util.HashMap;

public class SubjectEventDAOImpl implements SubjectEventDAO {
    private static EventSetComplexTypeDAO eventSetComplexTypeDAO = new EventSetComplexTypeDAOImpl();
    private static Utils utils = new Utils();

    public SubjectEvent getSubjectEvent(Node node) {
        HashMap<String, String> attributes = utils.getAttributes(node);

        return new SubjectEvent(
                eventSetComplexTypeDAO.getEventSetComplexType(node),
                new LidoSortOrder(attributes.get("lido:sortorder"))
        );
    }
}
