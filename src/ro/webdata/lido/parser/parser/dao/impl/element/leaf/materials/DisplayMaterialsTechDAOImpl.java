package ro.webdata.lido.parser.parser.dao.impl.element.leaf.materials;

import ro.webdata.lido.parser.parser.dao.complex.TextComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.materials.DisplayMaterialsTechDAO;
import ro.webdata.lido.parser.parser.dao.impl.complex.TextComplexTypeDAOImpl;
import ro.webdata.lido.parser.parser.model.element.leaf.materials.DisplayMaterialsTech;
import org.w3c.dom.Node;

public class DisplayMaterialsTechDAOImpl implements DisplayMaterialsTechDAO {
    private static TextComplexTypeDAO textComplexTypeDAO = new TextComplexTypeDAOImpl();

    public DisplayMaterialsTech getDisplayMaterialsTech(Node node) {
        return new DisplayMaterialsTech(textComplexTypeDAO.getTextComplexType(node));
    }
}
