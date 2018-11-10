package app.java.parser.dao.impl.element.leaf.materials;

import app.java.parser.dao.complex.TextComplexTypeDAO;
import app.java.parser.dao.element.leaf.materials.DisplayMaterialsTechDAO;
import app.java.parser.dao.impl.complex.TextComplexTypeDAOImpl;
import app.java.parser.model.element.leaf.materials.DisplayMaterialsTech;
import org.w3c.dom.Node;

public class DisplayMaterialsTechDAOImpl implements DisplayMaterialsTechDAO {
    private static TextComplexTypeDAO textComplexTypeDAO = new TextComplexTypeDAOImpl();

    public DisplayMaterialsTech getDisplayMaterialsTech(Node node) {
        return new DisplayMaterialsTech(textComplexTypeDAO.getTextComplexType(node));
    }
}
