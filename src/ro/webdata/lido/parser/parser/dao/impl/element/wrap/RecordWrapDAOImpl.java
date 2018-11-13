package ro.webdata.lido.parser.parser.dao.impl.element.wrap;

import ro.webdata.lido.parser.parser.dao.element.leaf.record.RecordIDDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.record.RecordRightsDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.record.RecordSourceDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.record.RecordTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.set.RecordInfoSetDAO;
import ro.webdata.lido.parser.parser.dao.element.wrap.RecordWrapDAO;
import ro.webdata.lido.parser.parser.dao.impl.element.leaf.record.RecordIDDAOImpl;
import ro.webdata.lido.parser.parser.dao.impl.element.leaf.record.RecordRightsDAOImpl;
import ro.webdata.lido.parser.parser.dao.impl.element.leaf.record.RecordSourceDAOImpl;
import ro.webdata.lido.parser.parser.dao.impl.element.leaf.record.RecordTypeDAOImpl;
import ro.webdata.lido.parser.parser.dao.impl.element.set.RecordInfoSetDAOImpl;
import ro.webdata.lido.parser.parser.model.element.leaf.record.RecordID;
import ro.webdata.lido.parser.parser.model.element.leaf.record.RecordRights;
import ro.webdata.lido.parser.parser.model.element.leaf.record.RecordSource;
import ro.webdata.lido.parser.parser.model.element.leaf.record.RecordType;
import ro.webdata.lido.parser.parser.model.element.set.RecordInfoSet;
import ro.webdata.lido.parser.parser.model.element.wrap.RecordWrap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.ArrayList;

public class RecordWrapDAOImpl implements RecordWrapDAO {
    private static RecordIDDAO recordIDParser = new RecordIDDAOImpl();
    private static RecordTypeDAO recordTypeParser = new RecordTypeDAOImpl();
    private static RecordSourceDAO recordSourceParser = new RecordSourceDAOImpl();
    private static RecordRightsDAO recordRightsParser = new RecordRightsDAOImpl();
    private static RecordInfoSetDAO recordInfoSetParser = new RecordInfoSetDAOImpl();

    public RecordWrap getRecordWrap(Node node) {
        ArrayList<RecordID> recordIDList = new ArrayList<RecordID>();
        RecordType recordType = null;
        ArrayList<RecordSource> recordSourceList = new ArrayList<RecordSource>();
        ArrayList<RecordRights> recordRightsList = new ArrayList<RecordRights>();
        ArrayList<RecordInfoSet> recordInfoSetList = new ArrayList<RecordInfoSet>();

        NodeList childNodeList = node.getChildNodes();
        for (int i = 0; i < childNodeList.getLength(); i++) {
            Node child = childNodeList.item(i);
            String childName = child.getNodeName();

            switch (childName) {
                case "lido:recordID":
                    recordIDList.add(recordIDParser.getRecordID(child));
                    break;
                case "lido:recordType":
                    recordType = recordTypeParser.getRecordType(child);
                    break;
                case "lido:recordSource":
                    recordSourceList.add(recordSourceParser.getRecordSourceType(child));
                    break;
                case "lido:recordRights":
                    recordRightsList.add(recordRightsParser.getRecordRights(child));
                    break;
                case "lido:recordInfoSet":
                    recordInfoSetList.add(recordInfoSetParser.getRecordInfoSet(child));
                    break;
                default: break;
            }
        }

        return new RecordWrap(
                recordIDList, recordType, recordSourceList,
                recordRightsList, recordInfoSetList
        );
    }
}