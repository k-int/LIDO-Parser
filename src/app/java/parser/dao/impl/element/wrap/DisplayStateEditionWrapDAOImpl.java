package app.java.parser.dao.impl.element.wrap;

import app.java.parser.dao.element.leaf.displayStateEdition.DisplayEditionDAO;
import app.java.parser.dao.element.leaf.displayStateEdition.DisplayStateDAO;
import app.java.parser.dao.element.leaf.displayStateEdition.SourceStateEditionDAO;
import app.java.parser.dao.element.wrap.DisplayStateEditionWrapDAO;
import app.java.parser.dao.impl.element.leaf.displayStateEdition.DisplayEditionDAOImpl;
import app.java.parser.dao.impl.element.leaf.displayStateEdition.DisplayStateDAOImpl;
import app.java.parser.dao.impl.element.leaf.displayStateEdition.SourceStateEditionDAOImpl;
import app.java.parser.model.element.leaf.displayStateEdition.DisplayEdition;
import app.java.parser.model.element.leaf.displayStateEdition.DisplayState;
import app.java.parser.model.element.leaf.displayStateEdition.SourceStateEdition;
import app.java.parser.model.element.wrap.DisplayStateEditionWrap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.ArrayList;

public class DisplayStateEditionWrapDAOImpl implements DisplayStateEditionWrapDAO {
    private static DisplayStateDAO displayStateParser = new DisplayStateDAOImpl();
    private static DisplayEditionDAO displayEditionParser = new DisplayEditionDAOImpl();
    private static SourceStateEditionDAO sourceStateEditionParser = new SourceStateEditionDAOImpl();

    public DisplayStateEditionWrap getDisplayStateEditionWrap(Node node) {
        ArrayList<DisplayState> displayStateList = new ArrayList<DisplayState>();
        ArrayList<DisplayEdition> displayEditionList = new ArrayList<DisplayEdition>();
        ArrayList<SourceStateEdition> sourceStateEditionList = new ArrayList<SourceStateEdition>();
        NodeList childNodeList = node.getChildNodes();

        for (int i = 0; i < childNodeList.getLength(); i++) {
            Node child = childNodeList.item(i);
            String childName = child.getNodeName();

            switch (childName) {
                case "lido:displayState":
                    displayStateList.add(displayStateParser.getDisplayState(child));
                    break;
                case "lido:displayEdition":
                    displayEditionList.add(displayEditionParser.getDisplayEdition(child));
                    break;
                case "lido:sourceStateEdition":
                    sourceStateEditionList.add(sourceStateEditionParser.getSourceStateEdition(child));
                    break;
                default: break;
            }
        }

        return new DisplayStateEditionWrap(
                displayStateList,
                displayEditionList,
                sourceStateEditionList
        );
    }
}
