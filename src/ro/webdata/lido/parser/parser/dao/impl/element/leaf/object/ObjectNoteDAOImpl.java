package ro.webdata.lido.parser.parser.dao.impl.element.leaf.object;

import ro.webdata.lido.parser.common.Utils;
import ro.webdata.lido.parser.parser.dao.complex.TextComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.object.ObjectNoteDAO;
import ro.webdata.lido.parser.parser.dao.impl.complex.TextComplexTypeDAOImpl;
import ro.webdata.lido.parser.parser.model.attribute.lido.LidoType;
import ro.webdata.lido.parser.parser.model.element.leaf.object.ObjectNote;
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
