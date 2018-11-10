package app.java.parser.dao.impl.element.leaf.object;

import app.java.common.Utils;
import app.java.parser.dao.complex.TextComplexTypeDAO;
import app.java.parser.dao.element.leaf.object.ObjectNoteDAO;
import app.java.parser.dao.impl.complex.TextComplexTypeDAOImpl;
import app.java.parser.model.attribute.lido.LidoType;
import app.java.parser.model.element.leaf.object.ObjectNote;
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
