package ro.webdata.lido.parser.parser.dao.impl.complex;

import ro.webdata.lido.parser.common.Utils;
import ro.webdata.lido.parser.parser.dao.complex.AdministrativeMetadataComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.wrap.RecordWrapDAO;
import ro.webdata.lido.parser.parser.dao.element.wrap.ResourceWrapDAO;
import ro.webdata.lido.parser.parser.dao.element.wrap.RightsWorkWrapDAO;
import ro.webdata.lido.parser.parser.dao.impl.element.wrap.RecordWrapDAOImpl;
import ro.webdata.lido.parser.parser.dao.impl.element.wrap.ResourceWrapDAOImpl;
import ro.webdata.lido.parser.parser.dao.impl.element.wrap.RightsWorkWrapDAOImpl;
import ro.webdata.lido.parser.parser.model.attribute.xml.XmlLang;
import ro.webdata.lido.parser.parser.model.complex.AdministrativeMetadataComplexType;
import ro.webdata.lido.parser.parser.model.element.wrap.RecordWrap;
import ro.webdata.lido.parser.parser.model.element.wrap.ResourceWrap;
import ro.webdata.lido.parser.parser.model.element.wrap.RightsWorkWrap;
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
