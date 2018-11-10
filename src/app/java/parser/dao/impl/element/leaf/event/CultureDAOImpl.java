package app.java.parser.dao.impl.element.leaf.event;

import app.java.common.Utils;
import app.java.parser.dao.complex.ConceptComplexTypeDAO;
import app.java.parser.dao.element.leaf.event.CultureDAO;
import app.java.parser.dao.impl.complex.ConceptComplexTypeDAOImpl;
import app.java.parser.model.attribute.lido.LidoSortOrder;
import app.java.parser.model.element.leaf.event.Culture;
import org.w3c.dom.Node;

import java.util.HashMap;

public class CultureDAOImpl implements CultureDAO {
    private ConceptComplexTypeDAO conceptComplexTypeDAO = new ConceptComplexTypeDAOImpl();
    private Utils utils = new Utils();

    public Culture getCulture(Node node) {
        HashMap<String, String> attributes = utils.getAttributes(node);

        return new Culture(
                conceptComplexTypeDAO.getConceptComplexType(node),
                new LidoSortOrder(attributes.get("lido:sortorder"))
        );
    }
}
