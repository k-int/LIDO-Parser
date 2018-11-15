package ro.webdata.lido.parser.core.set.relatedEventSet;

import ro.webdata.lido.parser.common.Utils;
import ro.webdata.lido.parser.core.complex.relatedEventSetComplexType.RelatedEventSetComplexTypeDAO;
import ro.webdata.lido.parser.core.complex.relatedEventSetComplexType.RelatedEventSetComplexTypeDAOImpl;
import ro.webdata.lido.parser.core.attribute.LidoSortOrder;
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
