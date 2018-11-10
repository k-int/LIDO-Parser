package app.java.parser.dao.impl;

import app.java.common.Utils;
import app.java.parser.dao.LidoDAO;
import app.java.parser.dao.complex.LidoComplexTypeDAO;
import app.java.parser.dao.impl.complex.LidoComplexTypeDAOImpl;
import app.java.parser.model.attribute.lido.LidoSortOrder;
import app.java.parser.model.element.Lido;
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
