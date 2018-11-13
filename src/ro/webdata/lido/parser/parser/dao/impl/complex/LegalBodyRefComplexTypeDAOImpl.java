package ro.webdata.lido.parser.parser.dao.impl.complex;

import ro.webdata.lido.parser.parser.dao.complex.LegalBodyRefComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.legalBody.LegalBodyIDDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.legalBody.LegalBodyNameDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.legalBody.LegalBodyWeblinkDAO;
import ro.webdata.lido.parser.parser.dao.impl.element.leaf.legalBody.LegalBodyIDDAOImpl;
import ro.webdata.lido.parser.parser.dao.impl.element.leaf.legalBody.LegalBodyNameDAOImpl;
import ro.webdata.lido.parser.parser.dao.impl.element.leaf.legalBody.LegalBodyWeblinkDAOImpl;
import ro.webdata.lido.parser.parser.model.complex.LegalBodyRefComplexType;
import ro.webdata.lido.parser.parser.model.element.leaf.legalBody.LegalBodyID;
import ro.webdata.lido.parser.parser.model.element.leaf.legalBody.LegalBodyName;
import ro.webdata.lido.parser.parser.model.element.leaf.legalBody.LegalBodyWeblink;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.ArrayList;

public class LegalBodyRefComplexTypeDAOImpl implements LegalBodyRefComplexTypeDAO {
    private static LegalBodyIDDAO legalBodyIDParser = new LegalBodyIDDAOImpl();
    private static LegalBodyNameDAO legalBodyNameParser = new LegalBodyNameDAOImpl();
    private static LegalBodyWeblinkDAO legalBodyWeblinkParser = new LegalBodyWeblinkDAOImpl();

    public LegalBodyRefComplexType getLegalBodyRefComplexType(Node node) {
        ArrayList<LegalBodyID> legalBodyIDList = new ArrayList<LegalBodyID>();
        ArrayList<LegalBodyName> legalBodyNameList = new ArrayList<LegalBodyName>();
        ArrayList<LegalBodyWeblink> legalBodyWeblinkList = new ArrayList<LegalBodyWeblink>();

        NodeList childNodeList = node.getChildNodes();
        for (int i = 0; i < childNodeList.getLength(); i++) {
            Node child = childNodeList.item(i);
            String childName = child.getNodeName();

            switch (childName) {
                case "lido:legalBodyID":
                    legalBodyIDList.add(legalBodyIDParser.getLegalBodyID(child));
                    break;
                case "lido:legalBodyName":
                    legalBodyNameList.add(legalBodyNameParser.getLegalBodyName(child));
                    break;
                case "lido:legalBodyWeblink":
                    legalBodyWeblinkList.add(legalBodyWeblinkParser.getLegalBodyWeblink(child));
                    break;
                default: break;
            }
        }

        return new LegalBodyRefComplexType(
                legalBodyIDList, legalBodyNameList, legalBodyWeblinkList
        );
    }
}
