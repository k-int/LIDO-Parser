package webdata.parser.xml.lido.core.leaf.objectNote;

import org.w3c.dom.Node;
import ro.webdata.echo.commons.graph.Graph;
import ro.webdata.parser.xml.lido.core.attribute.LidoType;
import ro.webdata.parser.xml.lido.core.complex.textComplexType.TextComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.textComplexType.TextComplexTypeDAOImpl;

import java.util.HashMap;

public class ObjectNoteDAOImpl implements ObjectNoteDAO {
    private static TextComplexTypeDAO textComplexTypeDAO = new TextComplexTypeDAOImpl();

    public ObjectNote getObjectNote(Node node) {
        HashMap<String, String> attributes = Graph.getAttributes(node);

        return new ObjectNote(
                textComplexTypeDAO.getTextComplexType(node),
                new LidoType(attributes.get("lido:type"))
        );
    }
}
