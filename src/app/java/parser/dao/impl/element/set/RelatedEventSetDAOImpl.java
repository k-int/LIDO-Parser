package app.java.parser.dao.impl.element.set;

import app.java.common.Utils;
import app.java.parser.dao.complex.event.RelatedEventSetComplexTypeDAO;
import app.java.parser.dao.element.set.RelatedEventSetDAO;
import app.java.parser.dao.impl.complex.event.RelatedEventSetComplexTypeDAOImpl;
import app.java.parser.model.attribute.lido.LidoSortOrder;
import app.java.parser.model.element.set.RelatedEventSet;
import org.w3c.dom.Node;

import java.util.HashMap;

public class RelatedEventSetDAOImpl implements RelatedEventSetDAO {
    private static RelatedEventSetComplexTypeDAO relatedEventSetComplexTypeDAO = new RelatedEventSetComplexTypeDAOImpl();
    private static Utils utils = new Utils();

    public RelatedEventSet getRelatedEventSet(Node node) {
        HashMap<String, String> attributes = utils.getAttributes(node);

        return new RelatedEventSet(
                relatedEventSetComplexTypeDAO.getRelatedEventSetComplexType(node),
                new LidoSortOrder(attributes.get("lido:sortorder"))
        );
    }
}
