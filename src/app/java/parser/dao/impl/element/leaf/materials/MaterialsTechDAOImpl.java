package app.java.parser.dao.impl.element.leaf.materials;

import app.java.parser.dao.complex.materials.MaterialsTechComplexTypeDAO;
import app.java.parser.dao.element.leaf.materials.MaterialsTechDAO;
import app.java.parser.dao.impl.complex.materials.MaterialsTechComplexTypeDAOImpl;
import app.java.parser.model.element.leaf.materials.MaterialsTech;
import org.w3c.dom.Node;

public class MaterialsTechDAOImpl implements MaterialsTechDAO {
    private static MaterialsTechComplexTypeDAO materialsTechComplexTypeDAO = new MaterialsTechComplexTypeDAOImpl();

    public MaterialsTech getMaterialsTech(Node node) {
        return new MaterialsTech(materialsTechComplexTypeDAO.getMaterialsTechComplexType(node));
    }
}
