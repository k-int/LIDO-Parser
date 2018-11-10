package app.java.parser.dao.impl.complex;

import app.java.parser.dao.complex.AppellationComplexTypeDAO;
import app.java.parser.dao.element.leaf.AppellationValueDAO;
import app.java.parser.dao.element.leaf.SourceAppellationDAO;
import app.java.parser.dao.impl.element.leaf.AppellationValueDAOImpl;
import app.java.parser.dao.impl.element.leaf.SourceAppellationDAOImpl;
import app.java.parser.model.complex.AppellationComplexType;
import app.java.parser.model.element.leaf.AppellationValue;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.ArrayList;

public class AppellationComplexTypeDAOImpl implements AppellationComplexTypeDAO {
    private static AppellationValueDAO appellValueParser = new AppellationValueDAOImpl();
    private static SourceAppellationDAO sourceAppellParser = new SourceAppellationDAOImpl();

    public AppellationComplexType getAppellationComplexType(Node node) {
        ArrayList<AppellationValue> appellationValueList = new ArrayList<AppellationValue>();
        ArrayList<app.java.parser.model.element.leaf.SourceAppellation> sourceAppellationList = new ArrayList<app.java.parser.model.element.leaf.SourceAppellation>();

        NodeList childNodeList = node.getChildNodes();
        for (int i = 0; i < childNodeList.getLength(); i++) {
            Node child = childNodeList.item(i);
            String childName = child.getNodeName();

            switch (childName) {
                case "lido:appellationValue":
                    appellationValueList.add(appellValueParser.getAppellationValue(child));
                    break;
                case "lido:sourceAppellation":
                    sourceAppellationList.add(sourceAppellParser.getSourceAppellation(child));
                    break;
                default: break;
            }
        }

        return new AppellationComplexType(appellationValueList, sourceAppellationList);
    }
}
