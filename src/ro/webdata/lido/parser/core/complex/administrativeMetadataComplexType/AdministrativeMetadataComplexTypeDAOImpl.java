package ro.webdata.lido.parser.core.complex.administrativeMetadataComplexType;

import ro.webdata.lido.parser.common.Utils;
import ro.webdata.lido.parser.core.wrap.recordWrap.RecordWrapDAO;
import ro.webdata.lido.parser.core.wrap.resourceWrap.ResourceWrapDAO;
import ro.webdata.lido.parser.core.wrap.rightsWorkWrap.RightsWorkWrapDAO;
import ro.webdata.lido.parser.core.wrap.recordWrap.RecordWrapDAOImpl;
import ro.webdata.lido.parser.core.wrap.resourceWrap.ResourceWrapDAOImpl;
import ro.webdata.lido.parser.core.wrap.rightsWorkWrap.RightsWorkWrapDAOImpl;
import ro.webdata.lido.parser.core.attribute.XmlLang;
import ro.webdata.lido.parser.core.wrap.recordWrap.RecordWrap;
import ro.webdata.lido.parser.core.wrap.resourceWrap.ResourceWrap;
import ro.webdata.lido.parser.core.wrap.rightsWorkWrap.RightsWorkWrap;
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
