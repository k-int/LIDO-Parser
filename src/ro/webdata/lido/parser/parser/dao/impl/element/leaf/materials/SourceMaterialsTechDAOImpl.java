package ro.webdata.lido.parser.parser.dao.impl.element.leaf.materials;

import ro.webdata.lido.parser.parser.dao.complex.TextComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.materials.SourceMaterialsTechDAO;
import ro.webdata.lido.parser.parser.dao.impl.complex.TextComplexTypeDAOImpl;
import ro.webdata.lido.parser.parser.model.element.leaf.materials.SourceMaterialsTech;
import org.w3c.dom.Node;

public class SourceMaterialsTechDAOImpl implements SourceMaterialsTechDAO {
    private static TextComplexTypeDAO textComplexTypeDAO = new TextComplexTypeDAOImpl();

    public SourceMaterialsTech getSourceMaterialsTech(Node node) {
        return new SourceMaterialsTech(textComplexTypeDAO.getTextComplexType(node));
    }
}
