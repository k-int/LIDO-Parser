package ro.webdata.lido.parser.core.complex.descriptiveMetadataComplexType;

import ro.webdata.lido.parser.common.Utils;
import ro.webdata.lido.parser.core.wrap.eventWrap.EventWrapDAO;
import ro.webdata.lido.parser.core.wrap.objectClassificationWrap.ObjectClassificationWrapDAO;
import ro.webdata.lido.parser.core.wrap.objectIdentificationWrap.ObjectIdentificationWrapDAO;
import ro.webdata.lido.parser.core.wrap.objectRelationWrap.ObjectRelationWrapDAO;
import ro.webdata.lido.parser.core.wrap.eventWrap.EventWrapDAOImpl;
import ro.webdata.lido.parser.core.wrap.objectClassificationWrap.ObjectClassificationWrapDAOImpl;
import ro.webdata.lido.parser.core.wrap.objectIdentificationWrap.ObjectIdentificationWrapDAOImpl;
import ro.webdata.lido.parser.core.wrap.objectRelationWrap.ObjectRelationWrapDAOImpl;
import ro.webdata.lido.parser.core.attribute.XmlLang;
import ro.webdata.lido.parser.core.wrap.eventWrap.EventWrap;
import ro.webdata.lido.parser.core.wrap.objectClassificationWrap.ObjectClassificationWrap;
import ro.webdata.lido.parser.core.wrap.objectIdentificationWrap.ObjectIdentificationWrap;
import ro.webdata.lido.parser.core.wrap.objectRelationWrap.ObjectRelationWrap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.HashMap;

public class DescriptiveMetadataComplexTypeDAOImpl implements DescriptiveMetadataComplexTypeDAO {
    private static ObjectClassificationWrapDAO objectClassificationWrapDAO = new ObjectClassificationWrapDAOImpl();
    private static ObjectIdentificationWrapDAO objectIdentificationWrapDAO = new ObjectIdentificationWrapDAOImpl();
    private static EventWrapDAO eventWrapDAO = new EventWrapDAOImpl();
    private static ObjectRelationWrapDAO objectRelationWrapDAO = new ObjectRelationWrapDAOImpl();
    private Utils utils = new Utils();

    public DescriptiveMetadataComplexType getDescriptiveMetadataComplexType(Node node) {
        ObjectClassificationWrap objectClassificationWrap = new ObjectClassificationWrap();
        ObjectIdentificationWrap objectIdentificationWrap = new ObjectIdentificationWrap();
        EventWrap eventWrap = new EventWrap();
        ObjectRelationWrap objectRelationWrap = new ObjectRelationWrap();
        HashMap<String, String> attributes = utils.getAttributes(node);

        NodeList childNodeList = node.getChildNodes();
        for (int i = 0; i < childNodeList.getLength(); i++) {
            Node child = childNodeList.item(i);
            String childName = child.getNodeName();

            switch (childName) {
                case "lido:objectClassificationWrap":
                    objectClassificationWrap = objectClassificationWrapDAO.getObjectClassificationWrap(child);
                    break;
                case "lido:objectIdentificationWrap":
                    objectIdentificationWrap = objectIdentificationWrapDAO.getObjectIdentificationWrap(child);
                    break;
                case "lido:eventWrap":
                    eventWrap = eventWrapDAO.getEventWrap(child);
                    break;
                case "lido:objectRelationWrap":
                    objectRelationWrap = objectRelationWrapDAO.getObjectRelationWrap(child);
                    break;
                default: break;
            }
        }

        return new DescriptiveMetadataComplexType(
                objectClassificationWrap,
                objectIdentificationWrap,
                eventWrap, objectRelationWrap,
                new XmlLang(attributes.get("xml:lang"))
        );
    }
}
