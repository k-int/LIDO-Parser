package ro.webdata.lido.parser.parser.dao.impl.element.wrap;

import ro.webdata.lido.parser.parser.dao.element.set.TitleSetDAO;
import ro.webdata.lido.parser.parser.dao.element.wrap.TitleWrapDAO;
import ro.webdata.lido.parser.parser.dao.impl.element.set.TitleSetDAOImpl;
import ro.webdata.lido.parser.parser.model.element.set.TitleSet;
import ro.webdata.lido.parser.parser.model.element.wrap.TitleWrap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.ArrayList;

public class TitleWrapDAOImpl implements TitleWrapDAO {
    private static TitleSetDAO titleSetParser = new TitleSetDAOImpl();

    public TitleWrap getTitleWrap(Node node) {
        ArrayList<TitleSet> titleSetList = new ArrayList<TitleSet>();
        NodeList childNodeList = node.getChildNodes();

        for (int i = 0; i < childNodeList.getLength(); i++) {
            Node child = childNodeList.item(i);
            String childName = child.getNodeName();

            if (childName.equals("lido:titleSet")) {
                titleSetList.add(titleSetParser.getTitleSet(child));
            }
        }

        return new TitleWrap(titleSetList);
    }
}
