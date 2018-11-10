package app.java.parser.dao.impl.element.leaf.event;

import app.java.common.Utils;
import app.java.parser.dao.complex.ConceptComplexTypeDAO;
import app.java.parser.dao.element.leaf.event.PeriodNameDAO;
import app.java.parser.dao.impl.complex.ConceptComplexTypeDAOImpl;
import app.java.parser.model.attribute.lido.LidoSortOrder;
import app.java.parser.model.attribute.lido.LidoType;
import app.java.parser.model.element.leaf.event.PeriodName;
import org.w3c.dom.Node;

import java.util.HashMap;

public class PeriodNameDAOImpl implements PeriodNameDAO {
    private static ConceptComplexTypeDAO conceptComplexTypeDAO = new ConceptComplexTypeDAOImpl();
    private static Utils utils = new Utils();

    public PeriodName getPeriodName(Node node) {
        HashMap<String, String> attributes = utils.getAttributes(node);

        return new PeriodName(
                conceptComplexTypeDAO.getConceptComplexType(node),
                new LidoType(attributes.get("lido:type")),
                new LidoSortOrder(attributes.get("lido:sortorder"))
        );
    }
}
