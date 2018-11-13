package ro.webdata.lido.parser.parser.dao.impl.complex.materials;

import ro.webdata.lido.parser.parser.dao.complex.materials.MaterialsTechComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.materials.ExtentMaterialsTechDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.materials.SourceMaterialsTechDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.materials.TermMaterialsTechDAO;
import ro.webdata.lido.parser.parser.dao.impl.element.leaf.materials.ExtentMaterialsTechDAOImpl;
import ro.webdata.lido.parser.parser.dao.impl.element.leaf.materials.SourceMaterialsTechDAOImpl;
import ro.webdata.lido.parser.parser.dao.impl.element.leaf.materials.TermMaterialsTechDAOImpl;
import ro.webdata.lido.parser.parser.model.complex.materials.MaterialsTechComplexType;
import ro.webdata.lido.parser.parser.model.element.leaf.materials.ExtentMaterialsTech;
import ro.webdata.lido.parser.parser.model.element.leaf.materials.SourceMaterialsTech;
import ro.webdata.lido.parser.parser.model.element.leaf.materials.TermMaterialsTech;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.ArrayList;

public class MaterialsTechComplexTypeDAOImpl implements MaterialsTechComplexTypeDAO {
    private static TermMaterialsTechDAO termMaterialsTechParser = new TermMaterialsTechDAOImpl();
    private static ExtentMaterialsTechDAO extentMaterialsTechParser = new ExtentMaterialsTechDAOImpl();
    private static SourceMaterialsTechDAO sourceMaterialsTechParser = new SourceMaterialsTechDAOImpl();

    public MaterialsTechComplexType getMaterialsTechComplexType(Node node) {
        ArrayList<TermMaterialsTech> termMaterialsTechList = new ArrayList<TermMaterialsTech>();
        ArrayList<ExtentMaterialsTech> extentMaterialsTechList = new ArrayList<ExtentMaterialsTech>();
        ArrayList<SourceMaterialsTech> sourceMaterialsTechList = new ArrayList<SourceMaterialsTech>();

        NodeList childNodeList = node.getChildNodes();
        for (int i = 0; i < childNodeList.getLength(); i++) {
            Node child = childNodeList.item(i);
            String childName = child.getNodeName();

            switch (childName) {
                case "lido:termMaterialsTech":
                    termMaterialsTechList.add(termMaterialsTechParser.getTermMaterialsTech(child));
                    break;
                case "lido:extentMaterialsTech":
                    extentMaterialsTechList.add(extentMaterialsTechParser.getExtentMaterialsTech(child));
                    break;
                case "lido:sourceMaterialsTech":
                    sourceMaterialsTechList.add(sourceMaterialsTechParser.getSourceMaterialsTech(child));
                    break;
                default: break;
            }
        }

        return new MaterialsTechComplexType(
                termMaterialsTechList,
                extentMaterialsTechList,
                sourceMaterialsTechList
        );
    }
}
