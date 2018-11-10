package app.java.parser.dao.impl.complex;

import app.java.common.Utils;
import app.java.parser.dao.complex.AdministrativeMetadataComplexTypeDAO;
import app.java.parser.dao.element.wrap.RecordWrapDAO;
import app.java.parser.dao.element.wrap.ResourceWrapDAO;
import app.java.parser.dao.element.wrap.RightsWorkWrapDAO;
import app.java.parser.dao.impl.element.wrap.RecordWrapDAOImpl;
import app.java.parser.dao.impl.element.wrap.ResourceWrapDAOImpl;
import app.java.parser.dao.impl.element.wrap.RightsWorkWrapDAOImpl;
import app.java.parser.model.attribute.xml.XmlLang;
import app.java.parser.model.complex.AdministrativeMetadataComplexType;
import app.java.parser.model.element.wrap.RecordWrap;
import app.java.parser.model.element.wrap.ResourceWrap;
import app.java.parser.model.element.wrap.RightsWorkWrap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.HashMap;

public class AdministrativeMetadataComplexTypeDAOImpl implements AdministrativeMetadataComplexTypeDAO {
    private static RecordWrapDAO recordWrapDAO = new RecordWrapDAOImpl();
    private static ResourceWrapDAO resourceWrapDAO = new ResourceWrapDAOImpl();
    private static RightsWorkWrapDAO rightsWorkWrapDAO = new RightsWorkWrapDAOImpl();
    private Utils utils = new Utils();

    public AdministrativeMetadataComplexType getAdministrativeMetadataComplexType(Node node) {
        RightsWorkWrap rightsWorkWrap = null;
        RecordWrap recordWrap = null;
        ResourceWrap resourceWrap = null;
        HashMap<String, String> attributes = utils.getAttributes(node);

        NodeList childNodeList = node.getChildNodes();
        for (int i = 0; i < childNodeList.getLength(); i++) {
            Node child = childNodeList.item(i);
            String childName = child.getNodeName();

            switch (childName) {
                case "lido:rightsWorkWrap":
                    rightsWorkWrap = rightsWorkWrapDAO.getRightsWorkWrapParser(child);
                    break;
                case "lido:recordWrap":
                    recordWrap = recordWrapDAO.getRecordWrap(child);
                    break;
                case "lido:resourceWrap":
                    resourceWrap = resourceWrapDAO.getResourceWrap(child);
                    break;
                default: break;
            }
        }

        return new AdministrativeMetadataComplexType(
                rightsWorkWrap,
                recordWrap,
                resourceWrap,
                new XmlLang(attributes.get("xml:lang"))
        );
    }
}
