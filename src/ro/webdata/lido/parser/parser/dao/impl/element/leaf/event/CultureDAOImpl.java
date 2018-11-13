package ro.webdata.lido.parser.parser.dao.impl.element.leaf.event;

import ro.webdata.lido.parser.common.Utils;
import ro.webdata.lido.parser.parser.dao.complex.ConceptComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.event.CultureDAO;
import ro.webdata.lido.parser.parser.dao.impl.complex.ConceptComplexTypeDAOImpl;
import ro.webdata.lido.parser.parser.model.attribute.lido.LidoSortOrder;
import ro.webdata.lido.parser.parser.model.element.leaf.event.Culture;
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
