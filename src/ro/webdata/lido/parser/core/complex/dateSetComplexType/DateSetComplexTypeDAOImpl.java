package ro.webdata.lido.parser.core.complex.dateSetComplexType;

import ro.webdata.lido.parser.core.leaf.date.DateDAO;
import ro.webdata.lido.parser.core.leaf.displayDate.DisplayDateDAO;
import ro.webdata.lido.parser.core.leaf.date.DateDAOImpl;
import ro.webdata.lido.parser.core.leaf.displayDate.DisplayDateDAOImpl;
import ro.webdata.lido.parser.core.leaf.date.Date;
import ro.webdata.lido.parser.core.leaf.displayDate.DisplayDate;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.ArrayList;

public class DateSetComplexTypeDAOImpl implements DateSetComplexTypeDAO {
    private static DisplayDateDAO displayDateParser = new DisplayDateDAOImpl();
    private static DateDAO dateParser = new DateDAOImpl();

    public DateSetComplexType getDateSetComplexTypeParser(Node node) {
        ArrayList<DisplayDate> displayDateList = new ArrayList<DisplayDate>();
        Date date = null;

        NodeList childNodeList = node.getChildNodes();
        for (int i = 0; i < childNodeList.getLength(); i++) {
            Node child = childNodeList.item(i);
            String childName = child.getNodeName();

            switch (childName) {
                case "lido:displayDate":
                    displayDateList.add(displayDateParser.getDisplayDate(child));
                    break;
                case "lido:date":
                    date = dateParser.getDate(child);
                    break;
                default: break;
            }
        }

        return new DateSetComplexType(displayDateList, date);
    }
}
