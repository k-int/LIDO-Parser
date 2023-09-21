package webdata.parser.xml.lido.core.leaf.sourceMaterialsTech;

import org.w3c.dom.Node;
import ro.webdata.parser.xml.lido.core.complex.textComplexType.TextComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.textComplexType.TextComplexTypeDAOImpl;

public class SourceMaterialsTechDAOImpl implements SourceMaterialsTechDAO {
    private static TextComplexTypeDAO textComplexTypeDAO = new TextComplexTypeDAOImpl();

    public SourceMaterialsTech getSourceMaterialsTech(Node node) {
        return new SourceMaterialsTech(textComplexTypeDAO.getTextComplexType(node));
    }
}
