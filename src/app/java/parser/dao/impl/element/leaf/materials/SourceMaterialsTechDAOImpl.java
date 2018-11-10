package app.java.parser.dao.impl.element.leaf.materials;

import app.java.parser.dao.complex.TextComplexTypeDAO;
import app.java.parser.dao.element.leaf.materials.SourceMaterialsTechDAO;
import app.java.parser.dao.impl.complex.TextComplexTypeDAOImpl;
import app.java.parser.model.element.leaf.materials.SourceMaterialsTech;
import org.w3c.dom.Node;

public class SourceMaterialsTechDAOImpl implements SourceMaterialsTechDAO {
    private static TextComplexTypeDAO textComplexTypeDAO = new TextComplexTypeDAOImpl();

    public SourceMaterialsTech getSourceMaterialsTech(Node node) {
        return new SourceMaterialsTech(textComplexTypeDAO.getTextComplexType(node));
    }
}
