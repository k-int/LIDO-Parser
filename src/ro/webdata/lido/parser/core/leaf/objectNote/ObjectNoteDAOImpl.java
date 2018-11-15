package ro.webdata.lido.parser.core.leaf.objectNote;

import ro.webdata.lido.parser.common.Utils;
import ro.webdata.lido.parser.core.complex.textComplexType.TextComplexTypeDAO;
import ro.webdata.lido.parser.core.complex.textComplexType.TextComplexTypeDAOImpl;
import ro.webdata.lido.parser.core.attribute.LidoType;
import org.w3c.dom.Node;

import java.util.HashMap;

public class ObjectNoteDAOImpl implements ObjectNoteDAO {
    private static TextComplexTypeDAO textComplexTypeDAO = new TextComplexTypeDAOImpl();
    private static Utils utils = new Utils();

    public ObjectNote getObjectNote(Node node) {
        HashMap<String, String> attributes = utils.getAttributes(node);

        return new ObjectNote(
                textComplexTypeDAO.getTextComplexType(node),
                new LidoType(attributes.get("lido:type"))
        );
    }
}
