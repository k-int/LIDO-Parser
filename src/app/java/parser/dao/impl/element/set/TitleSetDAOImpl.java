package app.java.parser.dao.impl.element.set;

import app.java.common.Utils;
import app.java.parser.dao.complex.AppellationComplexTypeDAO;
import app.java.parser.dao.element.set.TitleSetDAO;
import app.java.parser.dao.impl.complex.AppellationComplexTypeDAOImpl;
import app.java.parser.model.attribute.lido.LidoSortOrder;
import app.java.parser.model.attribute.lido.LidoType;
import app.java.parser.model.element.set.TitleSet;
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
