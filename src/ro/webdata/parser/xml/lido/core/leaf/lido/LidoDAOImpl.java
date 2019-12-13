package ro.webdata.parser.xml.lido.core.leaf.lido;

import ro.webdata.parser.xml.lido.common.Utils;
import ro.webdata.parser.xml.lido.core.complex.lidoComplexType.LidoComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.lidoComplexType.LidoComplexTypeDAOImpl;
import ro.webdata.parser.xml.lido.core.attribute.LidoSortOrder;
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
