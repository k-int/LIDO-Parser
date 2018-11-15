package ro.webdata.lido.parser.core.leaf.linkResource;

import ro.webdata.lido.parser.common.Utils;
import ro.webdata.lido.parser.core.complex.webResourceComplexType.WebResourceComplexTypeDAO;
import ro.webdata.lido.parser.core.complex.webResourceComplexType.WebResourceComplexTypeDAOImpl;
import ro.webdata.lido.parser.core.attribute.LidoCodecResource;
import org.w3c.dom.Node;

import java.util.HashMap;

public class LinkResourceDAOImpl implements LinkResourceDAO {
    private static WebResourceComplexTypeDAO webResourceComplexTypeDAO = new WebResourceComplexTypeDAOImpl();
    private static Utils utils = new Utils();

    public LinkResource getLinkResource(Node node) {
        HashMap<String, String> attributes = utils.getAttributes(node);

        return new LinkResource(
                webResourceComplexTypeDAO.getWebResourceComplexType(node),
                new LidoCodecResource(attributes.get("lido:codecResource"))
        );
    }
}
