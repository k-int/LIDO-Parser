package ro.webdata.lido.parser.core.wrap.lidoWrap;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import ro.webdata.lido.parser.common.Utils;
import ro.webdata.lido.parser.core.leaf.lido.LidoDAO;
import ro.webdata.lido.parser.core.leaf.lido.LidoDAOImpl;
import ro.webdata.lido.parser.core.attribute.LidoRelatedEncoding;
import ro.webdata.lido.parser.core.leaf.lido.Lido;

import java.util.ArrayList;
import java.util.HashMap;

public class LidoWrapDAOImpl implements LidoWrapDAO {
    private static LidoDAO lidoParserDAOImpl = new LidoDAOImpl();
    private static Utils utils = new Utils();

    public LidoWrap getLidoWrap(Node node) {
        ArrayList<Lido> lidoList = new ArrayList<Lido>();
        HashMap<String, String> attributes = utils.getAttributes(node);

        NodeList childNodeList = node.getChildNodes();
        for (int i = 0; i < childNodeList.getLength(); i++) {
            Node child = childNodeList.item(i);
            String childName = child.getNodeName();

            if (childName.equals("lido:lido")) {
                lidoList.add(lidoParserDAOImpl.getLido(child));
            }
        }

        return new LidoWrap(
                lidoList,
                new LidoRelatedEncoding(attributes.get("lido:relatedencoding"))
        );
    }
}
