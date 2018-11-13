package ro.webdata.lido.parser.parser.dao.impl.element.set;

import ro.webdata.lido.parser.common.Utils;
import ro.webdata.lido.parser.parser.dao.complex.RelatedWorkSetComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.set.RelatedWorkSetDAO;
import ro.webdata.lido.parser.parser.dao.impl.complex.RelatedWorkSetComplexTypeDAOImpl;
import ro.webdata.lido.parser.parser.model.attribute.lido.LidoSortOrder;
import ro.webdata.lido.parser.parser.model.element.set.RelatedWorkSet;
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
