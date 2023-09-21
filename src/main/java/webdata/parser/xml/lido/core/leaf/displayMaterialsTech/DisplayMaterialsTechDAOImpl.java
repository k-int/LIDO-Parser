package webdata.parser.xml.lido.core.leaf.displayMaterialsTech;

import org.w3c.dom.Node;
import ro.webdata.parser.xml.lido.core.complex.textComplexType.TextComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.textComplexType.TextComplexTypeDAOImpl;

public class DisplayMaterialsTechDAOImpl implements DisplayMaterialsTechDAO {
    private static TextComplexTypeDAO textComplexTypeDAO = new TextComplexTypeDAOImpl();

    public DisplayMaterialsTech getDisplayMaterialsTech(Node node) {
        return new DisplayMaterialsTech(textComplexTypeDAO.getTextComplexType(node));
    }
}
