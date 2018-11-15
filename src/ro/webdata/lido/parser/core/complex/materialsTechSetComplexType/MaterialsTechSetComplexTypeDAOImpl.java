package ro.webdata.lido.parser.core.complex.materialsTechSetComplexType;

import ro.webdata.lido.parser.core.leaf.displayMaterialsTech.DisplayMaterialsTechDAO;
import ro.webdata.lido.parser.core.leaf.materialsTech.MaterialsTechDAO;
import ro.webdata.lido.parser.core.leaf.displayMaterialsTech.DisplayMaterialsTechDAOImpl;
import ro.webdata.lido.parser.core.leaf.materialsTech.MaterialsTechDAOImpl;
import ro.webdata.lido.parser.core.leaf.displayMaterialsTech.DisplayMaterialsTech;
import ro.webdata.lido.parser.core.leaf.materialsTech.MaterialsTech;
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
