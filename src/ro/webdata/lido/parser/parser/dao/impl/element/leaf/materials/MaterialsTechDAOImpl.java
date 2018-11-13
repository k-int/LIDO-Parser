package ro.webdata.lido.parser.parser.dao.impl.element.leaf.materials;

import ro.webdata.lido.parser.parser.dao.complex.materials.MaterialsTechComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.materials.MaterialsTechDAO;
import ro.webdata.lido.parser.parser.dao.impl.complex.materials.MaterialsTechComplexTypeDAOImpl;
import ro.webdata.lido.parser.parser.model.element.leaf.materials.MaterialsTech;
import org.w3c.dom.Node;

public class MaterialsTechDAOImpl implements MaterialsTechDAO {
    private static MaterialsTechComplexTypeDAO materialsTechComplexTypeDAO = new MaterialsTechComplexTypeDAOImpl();

    public MaterialsTech getMaterialsTech(Node node) {
        return new MaterialsTech(materialsTechComplexTypeDAO.getMaterialsTechComplexType(node));
    }
}
