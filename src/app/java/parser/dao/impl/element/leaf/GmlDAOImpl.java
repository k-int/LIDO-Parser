package app.java.parser.dao.impl.element.leaf;

import app.java.common.Utils;
import app.java.parser.dao.complex.GmlComplexTypeDAO;
import app.java.parser.dao.element.leaf.GmlDAO;
import app.java.parser.dao.impl.complex.GmlComplexTypeDAOImpl;
import app.java.parser.model.attribute.xml.XmlLang;
import app.java.parser.model.element.leaf.gml.Gml;
import org.w3c.dom.Node;

import java.util.HashMap;

public class GmlDAOImpl implements GmlDAO {
    private static GmlComplexTypeDAO gmlComplexTypeDAO = new GmlComplexTypeDAOImpl();
    private static Utils utils = new Utils();

    public Gml getGml(Node node) {
        HashMap<String, String> attributes = utils.getAttributes(node);

        return new Gml(
                gmlComplexTypeDAO.getGmlComplexType(node),
                new XmlLang(attributes.get("xml:lang"))
        );
    }
}
