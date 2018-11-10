package app.java.parser.dao.impl.complex;

import app.java.common.Utils;
import app.java.parser.dao.complex.RecordInfoSetComplexTypeDAO;
import app.java.parser.dao.element.leaf.record.RecordInfoIDDAO;
import app.java.parser.dao.element.leaf.record.RecordInfoLinkDAO;
import app.java.parser.dao.element.leaf.record.RecordMetadataDateDAO;
import app.java.parser.dao.impl.element.leaf.record.RecordInfoIDDAOImpl;
import app.java.parser.dao.impl.element.leaf.record.RecordInfoLinkDAOImpl;
import app.java.parser.dao.impl.element.leaf.record.RecordMetadataDateDAOImpl;
import app.java.parser.model.attribute.lido.LidoType;
import app.java.parser.model.complex.RecordInfoSetComplexType;
import app.java.parser.model.element.leaf.record.RecordInfoID;
import app.java.parser.model.element.leaf.record.RecordInfoLink;
import app.java.parser.model.element.leaf.record.RecordMetadataDate;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.ArrayList;
import java.util.HashMap;

public class RecordInfoSetComplexTypeDAOImpl implements RecordInfoSetComplexTypeDAO {
    private static RecordInfoIDDAO recordInfoIDParser = new RecordInfoIDDAOImpl();
    private static RecordInfoLinkDAO recordInfoLinkParser = new RecordInfoLinkDAOImpl();
    private static RecordMetadataDateDAO metadataParser = new RecordMetadataDateDAOImpl();
    private static Utils utils = new Utils();

    public RecordInfoSetComplexType getRecordInfoSetComplexType(Node node) {
        ArrayList<RecordInfoID> recordInfoIDList = new ArrayList<RecordInfoID>();
        ArrayList<RecordInfoLink> recordInfoLinkList = new ArrayList<RecordInfoLink>();
        ArrayList<RecordMetadataDate> recordMetadataDateList = new ArrayList<RecordMetadataDate>();
        HashMap<String, String> attributes = utils.getAttributes(node);

        NodeList childNodeList = node.getChildNodes();
        for (int i = 0; i < childNodeList.getLength(); i++) {
            Node child = childNodeList.item(i);
            String childName = child.getNodeName();

            switch (childName) {
                case "lido:recordInfoID":
                    recordInfoIDList.add(recordInfoIDParser.getRecordInfoID(child));
                    break;
                case "lido:recordInfoLink":
                    recordInfoLinkList.add(recordInfoLinkParser.getRecordInfoLink(child));
                    break;
                case "lido:recordMetadataDate":
                    recordMetadataDateList.add(metadataParser.getRecordMetadataDate(child));
                    break;
                default: break;
            }
        }

        return new RecordInfoSetComplexType(
                recordInfoIDList,
                recordInfoLinkList,
                recordMetadataDateList,
                new LidoType(attributes.get("lido:type"))
        );
    }
}
