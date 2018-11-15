package ro.webdata.lido.parser.core.set.relatedWorkSet;

import ro.webdata.lido.parser.common.Utils;
import ro.webdata.lido.parser.core.complex.relatedWorkSetComplexType.RelatedWorkSetComplexTypeDAO;
import ro.webdata.lido.parser.core.complex.relatedWorkSetComplexType.RelatedWorkSetComplexTypeDAOImpl;
import ro.webdata.lido.parser.core.attribute.LidoSortOrder;
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
