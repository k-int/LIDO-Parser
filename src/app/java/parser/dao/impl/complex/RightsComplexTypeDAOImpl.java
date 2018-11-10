package app.java.parser.dao.impl.complex;

import app.java.parser.dao.complex.RightsComplexTypeDAO;
import app.java.parser.dao.element.leaf.CreditLineDAO;
import app.java.parser.dao.element.leaf.rights.RightsDateDAO;
import app.java.parser.dao.element.leaf.rights.RightsHolderDAO;
import app.java.parser.dao.element.leaf.rights.RightsTypeDAO;
import app.java.parser.dao.impl.element.leaf.CreditLineDAOImpl;
import app.java.parser.dao.impl.element.leaf.rights.RightsDateDAOImpl;
import app.java.parser.dao.impl.element.leaf.rights.RightsHolderDAOImpl;
import app.java.parser.dao.impl.element.leaf.rights.RightsTypeDAOImpl;
import app.java.parser.model.complex.RightsComplexType;
import app.java.parser.model.element.leaf.CreditLine;
import app.java.parser.model.element.leaf.rights.RightsDate;
import app.java.parser.model.element.leaf.rights.RightsHolder;
import app.java.parser.model.element.leaf.rights.RightsType;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.ArrayList;

public class RightsComplexTypeDAOImpl implements RightsComplexTypeDAO {
    private static RightsTypeDAO rightsTypeDAO = new RightsTypeDAOImpl();
    private static RightsDateDAO rightsDateParser = new RightsDateDAOImpl();
    private static RightsHolderDAO holderParser = new RightsHolderDAOImpl();
    private static CreditLineDAO creditLineParser = new CreditLineDAOImpl();

    public RightsComplexType getRightsComplexType(Node node) {
        ArrayList<RightsType> rightsTypeList = new ArrayList<RightsType>();
        RightsDate rightsDate = null;
        ArrayList<RightsHolder> rightsHolder = new ArrayList<RightsHolder>();
        ArrayList<CreditLine> creditLine = new ArrayList<CreditLine>();
        NodeList childNodeList = node.getChildNodes();

        for (int i = 0; i < childNodeList.getLength(); i++) {
            Node child = childNodeList.item(i);
            String childName = child.getNodeName();

            switch (childName) {
                case "lido:rightsType":
                    rightsTypeList.add(rightsTypeDAO.getRightsType(child));
                    break;
                case "lido:rightsDate":
                    rightsDate = rightsDateParser.getRightsDate(child);
                    break;
                case "lido:rightsHolder":
                    rightsHolder.add(holderParser.getRightsHolder(child));
                    break;
                case "lido:creditLine":
                    creditLine.add(creditLineParser.getCreditLine(child));
                    break;
                default: break;
            }
        }

        return new RightsComplexType(
                rightsTypeList,
                rightsDate,
                rightsHolder,
                creditLine
        );
    }
}
