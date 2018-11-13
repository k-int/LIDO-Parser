package ro.webdata.lido.parser.parser.dao.impl.element.leaf;

import ro.webdata.lido.parser.common.Utils;
import ro.webdata.lido.parser.parser.dao.complex.WebResourceComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.LinkResourceDAO;
import ro.webdata.lido.parser.parser.dao.impl.complex.WebResourceComplexTypeDAOImpl;
import ro.webdata.lido.parser.parser.model.attribute.lido.LidoCodecResource;
import ro.webdata.lido.parser.parser.model.element.leaf.LinkResource;
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
