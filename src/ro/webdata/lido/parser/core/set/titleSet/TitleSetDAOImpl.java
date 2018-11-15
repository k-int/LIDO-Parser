package ro.webdata.lido.parser.core.set.titleSet;

import ro.webdata.lido.parser.common.Utils;
import ro.webdata.lido.parser.core.complex.appellationComplexType.AppellationComplexTypeDAO;
import ro.webdata.lido.parser.core.complex.appellationComplexType.AppellationComplexTypeDAOImpl;
import ro.webdata.lido.parser.core.attribute.LidoSortOrder;
import ro.webdata.lido.parser.core.attribute.LidoType;
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
