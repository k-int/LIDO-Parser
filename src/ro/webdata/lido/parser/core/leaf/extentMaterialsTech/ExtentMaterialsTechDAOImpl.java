package ro.webdata.lido.parser.core.leaf.extentMaterialsTech;

import ro.webdata.lido.parser.core.complex.textComplexType.TextComplexTypeDAO;
import ro.webdata.lido.parser.core.complex.textComplexType.TextComplexTypeDAOImpl;
import org.w3c.dom.Node;

public class ExtentMaterialsTechDAOImpl implements ExtentMaterialsTechDAO {
    private static TextComplexTypeDAO textComplexTypeDAO = new TextComplexTypeDAOImpl();

    public ExtentMaterialsTech getExtentMaterialsTech(Node node) {
        return new ExtentMaterialsTech(textComplexTypeDAO.getTextComplexType(node));
    }
}
