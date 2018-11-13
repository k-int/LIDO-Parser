package ro.webdata.lido.parser.parser.dao.impl.element.set;

import ro.webdata.lido.parser.common.Utils;
import ro.webdata.lido.parser.parser.dao.complex.event.RelatedEventSetComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.set.RelatedEventSetDAO;
import ro.webdata.lido.parser.parser.dao.impl.complex.event.RelatedEventSetComplexTypeDAOImpl;
import ro.webdata.lido.parser.parser.model.attribute.lido.LidoSortOrder;
import ro.webdata.lido.parser.parser.model.element.set.RelatedEventSet;
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
