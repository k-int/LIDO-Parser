package webdata.parser.xml.lido.core.leaf.materialsTech;

import org.w3c.dom.Node;
import ro.webdata.parser.xml.lido.core.complex.materialsTechComplexType.MaterialsTechComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.materialsTechComplexType.MaterialsTechComplexTypeDAOImpl;

public class MaterialsTechDAOImpl implements MaterialsTechDAO {
    private static MaterialsTechComplexTypeDAO materialsTechComplexTypeDAO = new MaterialsTechComplexTypeDAOImpl();

    public MaterialsTech getMaterialsTech(Node node) {
        return new MaterialsTech(materialsTechComplexTypeDAO.getMaterialsTechComplexType(node));
    }
}
