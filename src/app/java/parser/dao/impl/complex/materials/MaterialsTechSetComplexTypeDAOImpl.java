package app.java.parser.dao.impl.complex.materials;

import app.java.parser.dao.complex.materials.MaterialsTechSetComplexTypeDAO;
import app.java.parser.dao.element.leaf.materials.DisplayMaterialsTechDAO;
import app.java.parser.dao.element.leaf.materials.MaterialsTechDAO;
import app.java.parser.dao.impl.element.leaf.materials.DisplayMaterialsTechDAOImpl;
import app.java.parser.dao.impl.element.leaf.materials.MaterialsTechDAOImpl;
import app.java.parser.model.complex.materials.MaterialsTechSetComplexType;
import app.java.parser.model.element.leaf.materials.DisplayMaterialsTech;
import app.java.parser.model.element.leaf.materials.MaterialsTech;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.ArrayList;

public class MaterialsTechSetComplexTypeDAOImpl implements MaterialsTechSetComplexTypeDAO {
    private static DisplayMaterialsTechDAO displayMaterialsTechParser = new DisplayMaterialsTechDAOImpl();
    private static MaterialsTechDAO materialsTechParser = new MaterialsTechDAOImpl();

    public MaterialsTechSetComplexType getMaterialsTechSetComplexType(Node node) {
        ArrayList<DisplayMaterialsTech> displayMaterialsTechList = new ArrayList<DisplayMaterialsTech>();
        MaterialsTech materialsTechList = new MaterialsTech();

        NodeList childNodeList = node.getChildNodes();
        for (int i = 0; i < childNodeList.getLength(); i++) {
            Node child = childNodeList.item(i);
            String childName = child.getNodeName();

            switch (childName) {
                case "lido:displayMaterialsTech":
                    displayMaterialsTechList.add(displayMaterialsTechParser.getDisplayMaterialsTech(child));
                    break;
                case "lido:materialsTech":
                    materialsTechList = materialsTechParser.getMaterialsTech(child);
                    break;
                default: break;
            }
        }

        return new MaterialsTechSetComplexType(
                displayMaterialsTechList,
                materialsTechList
        );
    }
}
