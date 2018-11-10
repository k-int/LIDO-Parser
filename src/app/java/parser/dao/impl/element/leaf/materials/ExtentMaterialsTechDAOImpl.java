package app.java.parser.dao.impl.element.leaf.materials;

import app.java.parser.dao.complex.TextComplexTypeDAO;
import app.java.parser.dao.element.leaf.materials.ExtentMaterialsTechDAO;
import app.java.parser.dao.impl.complex.TextComplexTypeDAOImpl;
import app.java.parser.model.element.leaf.materials.ExtentMaterialsTech;
import org.w3c.dom.Node;

public class ExtentMaterialsTechDAOImpl implements ExtentMaterialsTechDAO {
    private static TextComplexTypeDAO textComplexTypeDAO = new TextComplexTypeDAOImpl();

    public ExtentMaterialsTech getExtentMaterialsTech(Node node) {
        return new ExtentMaterialsTech(textComplexTypeDAO.getTextComplexType(node));
    }
}
