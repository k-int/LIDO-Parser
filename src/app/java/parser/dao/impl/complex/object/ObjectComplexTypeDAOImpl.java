package app.java.parser.dao.impl.complex.object;

import app.java.parser.dao.complex.object.ObjectComplexTypeDAO;
import app.java.parser.dao.element.leaf.object.ObjectIDDAO;
import app.java.parser.dao.element.leaf.object.ObjectNoteDAO;
import app.java.parser.dao.element.leaf.object.ObjectWebResourceDAO;
import app.java.parser.dao.impl.element.leaf.object.ObjectIDDAOImpl;
import app.java.parser.dao.impl.element.leaf.object.ObjectNoteDAOImpl;
import app.java.parser.dao.impl.element.leaf.object.ObjectWebResourceDAOImpl;
import app.java.parser.model.complex.object.ObjectComplexType;
import app.java.parser.model.element.leaf.object.ObjectID;
import app.java.parser.model.element.leaf.object.ObjectNote;
import app.java.parser.model.element.leaf.object.ObjectWebResource;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.ArrayList;

public class ObjectComplexTypeDAOImpl implements ObjectComplexTypeDAO {
    private static ObjectWebResourceDAO objectWebResourceParser = new ObjectWebResourceDAOImpl();
    private static ObjectIDDAO objectIDParser = new ObjectIDDAOImpl();
    private static ObjectNoteDAO objectNoteParser = new ObjectNoteDAOImpl();

    public ObjectComplexType getObjectComplexType(Node node) {
        ArrayList<ObjectWebResource> objectWebResourceList = new ArrayList<ObjectWebResource>();
        ArrayList<ObjectID> objectIDList = new ArrayList<ObjectID>();
        ArrayList<ObjectNote> objectNoteList = new ArrayList<ObjectNote>();

        NodeList childNodeList = node.getChildNodes();
        for (int i = 0; i < childNodeList.getLength(); i++) {
            Node child = childNodeList.item(i);
            String childName = child.getNodeName();

            switch (childName) {
                case "lido:objectWebResource":
                    objectWebResourceList.add(objectWebResourceParser.getObjectWebResource(child));
                    break;
                case "lido:objectID":
                    objectIDList.add(objectIDParser.getObjectID(child));
                    break;
                case "lido:objectNote":
                    objectNoteList.add(objectNoteParser.getObjectNote(child));
                    break;
                default: break;
            }
        }

        return new ObjectComplexType(
                objectWebResourceList,
                objectIDList,
                objectNoteList
        );
    }
}
