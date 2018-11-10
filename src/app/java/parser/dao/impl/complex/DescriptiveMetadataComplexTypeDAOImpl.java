package app.java.parser.dao.impl.complex;

import app.java.common.Utils;
import app.java.parser.dao.complex.DescriptiveMetadataComplexTypeDAO;
import app.java.parser.dao.element.wrap.EventWrapDAO;
import app.java.parser.dao.element.wrap.ObjectClassificationWrapDAO;
import app.java.parser.dao.element.wrap.ObjectIdentificationWrapDAO;
import app.java.parser.dao.element.wrap.ObjectRelationWrapDAO;
import app.java.parser.dao.impl.element.wrap.EventWrapDAOImpl;
import app.java.parser.dao.impl.element.wrap.ObjectClassificationWrapDAOImpl;
import app.java.parser.dao.impl.element.wrap.ObjectIdentificationWrapDAOImpl;
import app.java.parser.dao.impl.element.wrap.ObjectRelationWrapDAOImpl;
import app.java.parser.model.attribute.xml.XmlLang;
import app.java.parser.model.complex.DescriptiveMetadataComplexType;
import app.java.parser.model.element.wrap.EventWrap;
import app.java.parser.model.element.wrap.ObjectClassificationWrap;
import app.java.parser.model.element.wrap.ObjectIdentificationWrap;
import app.java.parser.model.element.wrap.ObjectRelationWrap;
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
