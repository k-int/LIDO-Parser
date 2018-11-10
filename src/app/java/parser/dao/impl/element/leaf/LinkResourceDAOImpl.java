package app.java.parser.dao.impl.element.leaf;

import app.java.common.Utils;
import app.java.parser.dao.complex.WebResourceComplexTypeDAO;
import app.java.parser.dao.element.leaf.LinkResourceDAO;
import app.java.parser.dao.impl.complex.WebResourceComplexTypeDAOImpl;
import app.java.parser.model.attribute.lido.LidoCodecResource;
import app.java.parser.model.element.leaf.LinkResource;
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
