package app.java.parser.dao.impl.complex.date;

import app.java.parser.dao.complex.date.DateComplexTypeDAO;
import app.java.parser.dao.element.leaf.date.EarliestDateDAO;
import app.java.parser.dao.element.leaf.date.LatestDateDAO;
import app.java.parser.dao.impl.element.leaf.date.EarliestDateDAOImpl;
import app.java.parser.dao.impl.element.leaf.date.LatestDateDAOImpl;
import app.java.parser.model.complex.date.DateComplexType;
import app.java.parser.model.element.leaf.date.EarliestDate;
import app.java.parser.model.element.leaf.date.LatestDate;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class DateComplexTypeDAOImpl implements DateComplexTypeDAO {
    private static EarliestDateDAO earliestDateParser = new EarliestDateDAOImpl();
    private static LatestDateDAO latestDateDAO = new LatestDateDAOImpl();

    public DateComplexType getDateComplexType(Node node) {
        EarliestDate earliestDate = null;
        LatestDate latestDate = null;

        NodeList childNodeList = node.getChildNodes();
        for (int i = 0; i < childNodeList.getLength(); i++) {
            Node child = childNodeList.item(i);
            String childName = child.getNodeName();

            switch (childName) {
                case "lido:earliestDate":
                    earliestDate = earliestDateParser.getEarliestDate(child);
                    break;
                case "lido:latestDate":
                    latestDate = latestDateDAO.getLatestDate(child);
                    break;
                default: break;
            }
        }

        return new DateComplexType(earliestDate, latestDate);
    }
}
