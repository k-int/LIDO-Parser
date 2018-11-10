package app.java.parser.dao.impl.element.wrap;

import app.java.parser.dao.element.wrap.ClassificationWrapDAO;
import app.java.parser.dao.element.wrap.ObjectClassificationWrapDAO;
import app.java.parser.dao.element.wrap.ObjectWorkTypeWrapDAO;
import app.java.parser.model.element.wrap.ClassificationWrap;
import app.java.parser.model.element.wrap.ObjectClassificationWrap;
import app.java.parser.model.element.wrap.ObjectWorkTypeWrap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class ObjectClassificationWrapDAOImpl implements ObjectClassificationWrapDAO {
    private static ObjectWorkTypeWrapDAO objectWorkTypeWrapDAO = new ObjectWorkTypeWrapDAOImpl();
    private static ClassificationWrapDAO classificationWrapDAO = new ClassificationWrapDAOImpl();

    public ObjectClassificationWrap getObjectClassificationWrap(Node node) {
        ObjectWorkTypeWrap objectWorkTypeWrap = null;
        ClassificationWrap classificationWrap = null;
        NodeList childNodeList = node.getChildNodes();

        for (int i = 0; i < childNodeList.getLength(); i++) {
            Node child = childNodeList.item(i);
            String childName = child.getNodeName();

            switch (childName) {
                case "lido:objectWorkTypeWrap":
                    objectWorkTypeWrap = objectWorkTypeWrapDAO.getObjectWorkTypeWrap(child);
                    break;
                case "lido:classificationWrap":
                    classificationWrap = classificationWrapDAO.getClassificationWrap(child);
                    break;
                default: break;
            }
        }

        return new ObjectClassificationWrap(
                objectWorkTypeWrap,
                classificationWrap
        );
    }
}
