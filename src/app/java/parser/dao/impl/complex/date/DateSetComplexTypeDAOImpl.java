package app.java.parser.dao.impl.complex.date;

import app.java.parser.dao.complex.date.DateSetComplexTypeDAO;
import app.java.parser.dao.element.leaf.date.DateDAO;
import app.java.parser.dao.element.leaf.date.DisplayDateDAO;
import app.java.parser.dao.impl.element.leaf.date.DateDAOImpl;
import app.java.parser.dao.impl.element.leaf.date.DisplayDateDAOImpl;
import app.java.parser.model.complex.date.DateSetComplexType;
import app.java.parser.model.element.leaf.date.Date;
import app.java.parser.model.element.leaf.date.DisplayDate;
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
