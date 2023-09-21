package webdata.parser.xml.lido.core.leaf.objectWorkType;

import org.w3c.dom.Node;
import ro.webdata.echo.commons.graph.Graph;
import ro.webdata.parser.xml.lido.core.attribute.LidoSortOrder;
import ro.webdata.parser.xml.lido.core.attribute.LidoType;
import ro.webdata.parser.xml.lido.core.complex.conceptComplexType.ConceptComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.conceptComplexType.ConceptComplexTypeDAOImpl;

import java.util.HashMap;

public class ObjectWorkTypeDAOImpl implements ObjectWorkTypeDAO {
    private static ConceptComplexTypeDAO conceptComplexTypeDAO = new ConceptComplexTypeDAOImpl();

    public ObjectWorkType getObjectWorkType(Node node) {
        HashMap<String, String> attributes = Graph.getAttributes(node);

        return new ObjectWorkType(
                conceptComplexTypeDAO.getConceptComplexType(node),
                new LidoType(attributes.get("lido:type")),
                new LidoSortOrder(attributes.get("lido:sortorder"))
        );
    }
}
