package app.java.parser.dao.impl.element.wrap;

import app.java.parser.dao.element.leaf.ClassificationDAO;
import app.java.parser.dao.element.wrap.ClassificationWrapDAO;
import app.java.parser.dao.impl.element.leaf.ClassificationDAOImpl;
import app.java.parser.model.element.leaf.Classification;
import app.java.parser.model.element.wrap.ClassificationWrap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.ArrayList;

public class ClassificationWrapDAOImpl implements ClassificationWrapDAO {
    private static ClassificationDAO classificationParser = new ClassificationDAOImpl();

    public ClassificationWrap getClassificationWrap(Node node) {
        ArrayList<Classification> classificationList = new ArrayList<Classification>();
        NodeList childNodeList = node.getChildNodes();

        for (int i = 0; i < childNodeList.getLength(); i++) {
            Node child = childNodeList.item(i);
            String childName = child.getNodeName();

            if (childName.equals("lido:classification")) {
                classificationList.add(classificationParser.getClassification(child));
            }
        }

        return new ClassificationWrap(classificationList);
    }
}
