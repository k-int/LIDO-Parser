package ro.webdata.lido.parser.parser.dao.impl.element.leaf.subject;

import ro.webdata.lido.parser.common.Utils;
import ro.webdata.lido.parser.parser.dao.complex.event.EventSetComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.subject.SubjectEventDAO;
import ro.webdata.lido.parser.parser.dao.impl.complex.event.EventSetComplexTypeDAOImpl;
import ro.webdata.lido.parser.parser.model.attribute.lido.LidoSortOrder;
import ro.webdata.lido.parser.parser.model.element.leaf.subject.SubjectEvent;
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
