package ro.webdata.lido.parser.parser.dao.impl.element.wrap;

import ro.webdata.lido.parser.parser.dao.element.leaf.ClassificationDAO;
import ro.webdata.lido.parser.parser.dao.element.wrap.ClassificationWrapDAO;
import ro.webdata.lido.parser.parser.dao.impl.element.leaf.ClassificationDAOImpl;
import ro.webdata.lido.parser.parser.model.element.leaf.Classification;
import ro.webdata.lido.parser.parser.model.element.wrap.ClassificationWrap;
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
