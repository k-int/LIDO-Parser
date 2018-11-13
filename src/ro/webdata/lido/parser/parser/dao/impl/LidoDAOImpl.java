package ro.webdata.lido.parser.parser.dao.impl;

import ro.webdata.lido.parser.common.Utils;
import ro.webdata.lido.parser.parser.dao.LidoDAO;
import ro.webdata.lido.parser.parser.dao.complex.LidoComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.impl.complex.LidoComplexTypeDAOImpl;
import ro.webdata.lido.parser.parser.model.attribute.lido.LidoSortOrder;
import ro.webdata.lido.parser.parser.model.element.Lido;
import org.w3c.dom.Node;

import java.util.HashMap;

public class LidoDAOImpl implements LidoDAO {
    private static LidoComplexTypeDAO lidoComplexTypeDAO = new LidoComplexTypeDAOImpl();
    private static Utils utils = new Utils();

    public Lido getLido(Node node) {
        HashMap<String, String> attributes = utils.getAttributes(node);

        return new Lido(
                lidoComplexTypeDAO.getLidoComplexType(node),
                new LidoSortOrder(attributes.get("lido:sortorder"))
        );
    }
}
