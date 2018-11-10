package app.java.parser.dao.impl.element.leaf.object;

import app.java.common.Utils;
import app.java.parser.dao.complex.ConceptComplexTypeDAO;
import app.java.parser.dao.element.leaf.object.ObjectWorkTypeDAO;
import app.java.parser.dao.impl.complex.ConceptComplexTypeDAOImpl;
import app.java.parser.model.attribute.lido.LidoSortOrder;
import app.java.parser.model.attribute.lido.LidoType;
import app.java.parser.model.element.leaf.object.ObjectWorkType;
import org.w3c.dom.Node;

import java.util.HashMap;

public class ObjectWorkTypeDAOImpl implements ObjectWorkTypeDAO {
    private static ConceptComplexTypeDAO conceptComplexTypeDAO = new ConceptComplexTypeDAOImpl();
    private static Utils utils = new Utils();

    public ObjectWorkType getObjectWorkType(Node node) {
        HashMap<String, String> attributes = utils.getAttributes(node);

        return new ObjectWorkType(
                conceptComplexTypeDAO.getConceptComplexType(node),
                new LidoType(attributes.get("lido:type")),
                new LidoSortOrder(attributes.get("lido:sortorder"))
        );
    }
}
