package ro.webdata.lido.parser.parser.dao.impl.element.leaf.materials;

import ro.webdata.lido.parser.parser.dao.complex.TextComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.materials.ExtentMaterialsTechDAO;
import ro.webdata.lido.parser.parser.dao.impl.complex.TextComplexTypeDAOImpl;
import ro.webdata.lido.parser.parser.model.element.leaf.materials.ExtentMaterialsTech;
import org.w3c.dom.Node;

public class ExtentMaterialsTechDAOImpl implements ExtentMaterialsTechDAO {
    private static TextComplexTypeDAO textComplexTypeDAO = new TextComplexTypeDAOImpl();

    public ExtentMaterialsTech getExtentMaterialsTech(Node node) {
        return new ExtentMaterialsTech(textComplexTypeDAO.getTextComplexType(node));
    }
}
