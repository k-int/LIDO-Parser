package webdata.parser.xml.lido.core.leaf.subjectEvent;

import org.w3c.dom.Node;
import ro.webdata.echo.commons.graph.Graph;
import ro.webdata.parser.xml.lido.core.attribute.LidoSortOrder;
import ro.webdata.parser.xml.lido.core.complex.eventSetComplexType.EventSetComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.eventSetComplexType.EventSetComplexTypeDAOImpl;

import java.util.HashMap;

public class SubjectEventDAOImpl implements SubjectEventDAO {
    private static EventSetComplexTypeDAO eventSetComplexTypeDAO = new EventSetComplexTypeDAOImpl();

    public SubjectEvent getSubjectEvent(Node node) {
        HashMap<String, String> attributes = Graph.getAttributes(node);

        return new SubjectEvent(
                eventSetComplexTypeDAO.getEventSetComplexType(node),
                new LidoSortOrder(attributes.get("lido:sortorder"))
        );
    }
}
