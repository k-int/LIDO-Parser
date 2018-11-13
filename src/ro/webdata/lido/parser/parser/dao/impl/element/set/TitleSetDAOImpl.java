package ro.webdata.lido.parser.parser.dao.impl.element.set;

import ro.webdata.lido.parser.common.Utils;
import ro.webdata.lido.parser.parser.dao.complex.AppellationComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.set.TitleSetDAO;
import ro.webdata.lido.parser.parser.dao.impl.complex.AppellationComplexTypeDAOImpl;
import ro.webdata.lido.parser.parser.model.attribute.lido.LidoSortOrder;
import ro.webdata.lido.parser.parser.model.attribute.lido.LidoType;
import ro.webdata.lido.parser.parser.model.element.set.TitleSet;
import org.w3c.dom.Node;

import java.util.HashMap;

public class TitleSetDAOImpl implements TitleSetDAO {
    private static AppellationComplexTypeDAO appellationComplexTypeDAO = new AppellationComplexTypeDAOImpl();
    private static Utils utils = new Utils();

    public TitleSet getTitleSet(Node node) {
        HashMap<String, String> attributes = utils.getAttributes(node);

        return new TitleSet(
                appellationComplexTypeDAO.getAppellationComplexType(node),
                new LidoType(attributes.get("lido:type")),
                new LidoSortOrder(attributes.get("lido:sortorder"))
        );
    }
}
