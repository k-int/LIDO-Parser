package ro.webdata.lido.parser.core.leaf.materialsTech;

import ro.webdata.lido.parser.core.complex.materialsTechComplexType.MaterialsTechComplexTypeDAO;
import ro.webdata.lido.parser.core.complex.materialsTechComplexType.MaterialsTechComplexTypeDAOImpl;
import org.w3c.dom.Node;

public class MaterialsTechDAOImpl implements MaterialsTechDAO {
    private static MaterialsTechComplexTypeDAO materialsTechComplexTypeDAO = new MaterialsTechComplexTypeDAOImpl();

    public MaterialsTech getMaterialsTech(Node node) {
        return new MaterialsTech(materialsTechComplexTypeDAO.getMaterialsTechComplexType(node));
    }
}
