package ro.webdata.lido.parser.core.leaf.displayMaterialsTech;

import ro.webdata.lido.parser.core.complex.textComplexType.TextComplexTypeDAO;
import ro.webdata.lido.parser.core.complex.textComplexType.TextComplexTypeDAOImpl;
import org.w3c.dom.Node;

public class DisplayMaterialsTechDAOImpl implements DisplayMaterialsTechDAO {
    private static TextComplexTypeDAO textComplexTypeDAO = new TextComplexTypeDAOImpl();

    public DisplayMaterialsTech getDisplayMaterialsTech(Node node) {
        return new DisplayMaterialsTech(textComplexTypeDAO.getTextComplexType(node));
    }
}
