package ro.webdata.lido.parser.parser.dao.impl.complex;

import ro.webdata.lido.parser.parser.dao.complex.AppellationComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.AppellationValueDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.SourceAppellationDAO;
import ro.webdata.lido.parser.parser.dao.impl.element.leaf.AppellationValueDAOImpl;
import ro.webdata.lido.parser.parser.dao.impl.element.leaf.SourceAppellationDAOImpl;
import ro.webdata.lido.parser.parser.model.complex.AppellationComplexType;
import ro.webdata.lido.parser.parser.model.element.leaf.AppellationValue;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import ro.webdata.lido.parser.parser.model.element.leaf.SourceAppellation;

import java.util.ArrayList;

public class AppellationComplexTypeDAOImpl implements AppellationComplexTypeDAO {
    private static AppellationValueDAO appellValueParser = new AppellationValueDAOImpl();
    private static SourceAppellationDAO sourceAppellParser = new SourceAppellationDAOImpl();

    public AppellationComplexType getAppellationComplexType(Node node) {
        ArrayList<AppellationValue> appellationValueList = new ArrayList<AppellationValue>();
        ArrayList<SourceAppellation> sourceAppellationList = new ArrayList<SourceAppellation>();

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
