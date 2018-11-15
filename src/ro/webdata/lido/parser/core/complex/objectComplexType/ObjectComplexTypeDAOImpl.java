package ro.webdata.lido.parser.core.complex.objectComplexType;

import ro.webdata.lido.parser.core.leaf.objectID.ObjectIDDAO;
import ro.webdata.lido.parser.core.leaf.objectNote.ObjectNoteDAO;
import ro.webdata.lido.parser.core.leaf.objectWebResource.ObjectWebResourceDAO;
import ro.webdata.lido.parser.core.leaf.objectID.ObjectIDDAOImpl;
import ro.webdata.lido.parser.core.leaf.objectNote.ObjectNoteDAOImpl;
import ro.webdata.lido.parser.core.leaf.objectWebResource.ObjectWebResourceDAOImpl;
import ro.webdata.lido.parser.core.leaf.objectID.ObjectID;
import ro.webdata.lido.parser.core.leaf.objectNote.ObjectNote;
import ro.webdata.lido.parser.core.leaf.objectWebResource.ObjectWebResource;
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
