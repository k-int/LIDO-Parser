package webdata.parser.xml.lido.core.leaf.extentMaterialsTech;

import org.w3c.dom.Node;
import ro.webdata.parser.xml.lido.core.complex.textComplexType.TextComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.textComplexType.TextComplexTypeDAOImpl;

public class ExtentMaterialsTechDAOImpl implements ExtentMaterialsTechDAO {
    private static TextComplexTypeDAO textComplexTypeDAO = new TextComplexTypeDAOImpl();

    public ExtentMaterialsTech getExtentMaterialsTech(Node node) {
        return new ExtentMaterialsTech(textComplexTypeDAO.getTextComplexType(node));
    }
}
