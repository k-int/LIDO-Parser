package app.java.parser.dao.impl.element.set;

import app.java.common.Utils;
import app.java.parser.dao.complex.RelatedWorkSetComplexTypeDAO;
import app.java.parser.dao.element.set.RelatedWorkSetDAO;
import app.java.parser.dao.impl.complex.RelatedWorkSetComplexTypeDAOImpl;
import app.java.parser.model.attribute.lido.LidoSortOrder;
import app.java.parser.model.element.set.RelatedWorkSet;
import org.w3c.dom.Node;

import java.util.HashMap;

public class RelatedWorkSetDAOImpl implements RelatedWorkSetDAO {
    private static RelatedWorkSetComplexTypeDAO relatedWorkSetComplexTypeDAO = new RelatedWorkSetComplexTypeDAOImpl();
    private static Utils utils = new Utils();

    public RelatedWorkSet getRelatedWorkSet(Node node) {
        HashMap<String, String> attributes = utils.getAttributes(node);

        return new RelatedWorkSet(
                relatedWorkSetComplexTypeDAO.getRelatedWorkSetComplexType(node),
                new LidoSortOrder(attributes.get("lido:sortorder"))
        );
    }
}
