package ro.webdata.lido.parser.parser.dao.impl.element.leaf;

import ro.webdata.lido.parser.common.Utils;
import ro.webdata.lido.parser.parser.dao.complex.GmlComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.GmlDAO;
import ro.webdata.lido.parser.parser.dao.impl.complex.GmlComplexTypeDAOImpl;
import ro.webdata.lido.parser.parser.model.attribute.xml.XmlLang;
import ro.webdata.lido.parser.parser.model.element.leaf.gml.Gml;
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
