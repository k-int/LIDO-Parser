package ro.webdata.lido.parser.core.leaf.subjectEvent;

import ro.webdata.lido.parser.common.Utils;
import ro.webdata.lido.parser.core.complex.eventSetComplexType.EventSetComplexTypeDAO;
import ro.webdata.lido.parser.core.complex.eventSetComplexType.EventSetComplexTypeDAOImpl;
import ro.webdata.lido.parser.core.attribute.LidoSortOrder;
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
