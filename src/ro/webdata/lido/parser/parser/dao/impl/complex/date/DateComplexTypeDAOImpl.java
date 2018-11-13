package ro.webdata.lido.parser.parser.dao.impl.complex.date;

import ro.webdata.lido.parser.parser.dao.complex.date.DateComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.date.EarliestDateDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.date.LatestDateDAO;
import ro.webdata.lido.parser.parser.dao.impl.element.leaf.date.EarliestDateDAOImpl;
import ro.webdata.lido.parser.parser.dao.impl.element.leaf.date.LatestDateDAOImpl;
import ro.webdata.lido.parser.parser.model.complex.date.DateComplexType;
import ro.webdata.lido.parser.parser.model.element.leaf.date.EarliestDate;
import ro.webdata.lido.parser.parser.model.element.leaf.date.LatestDate;
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
