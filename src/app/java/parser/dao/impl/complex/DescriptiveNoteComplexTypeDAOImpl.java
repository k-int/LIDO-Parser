package app.java.parser.dao.impl.complex;

import app.java.common.Utils;
import app.java.parser.dao.complex.DescriptiveNoteComplexTypeDAO;
import app.java.parser.dao.element.leaf.descriptiveNote.DescriptiveNoteIDDAO;
import app.java.parser.dao.element.leaf.descriptiveNote.DescriptiveNoteValueDAO;
import app.java.parser.dao.element.leaf.descriptiveNote.SourceDescriptiveNoteDAO;
import app.java.parser.dao.impl.element.leaf.descriptiveNote.DescriptiveNoteIDDAOImpl;
import app.java.parser.dao.impl.element.leaf.descriptiveNote.DescriptiveNoteValueDAOImpl;
import app.java.parser.dao.impl.element.leaf.descriptiveNote.SourceDescriptiveNoteDAOImpl;
import app.java.parser.model.attribute.lido.LidoSortOrder;
import app.java.parser.model.attribute.lido.LidoType;
import app.java.parser.model.complex.DescriptiveNoteComplexType;
import app.java.parser.model.element.leaf.descriptiveNote.DescriptiveNoteID;
import app.java.parser.model.element.leaf.descriptiveNote.DescriptiveNoteValue;
import app.java.parser.model.element.leaf.descriptiveNote.SourceDescriptiveNote;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.ArrayList;
import java.util.HashMap;

public class DescriptiveNoteComplexTypeDAOImpl implements DescriptiveNoteComplexTypeDAO {
    private static DescriptiveNoteIDDAO descriptiveNoteIDParser = new DescriptiveNoteIDDAOImpl();
    private static DescriptiveNoteValueDAO descriptiveNoteValueParser = new DescriptiveNoteValueDAOImpl();
    private static SourceDescriptiveNoteDAO sourceDescriptiveNoteParser = new SourceDescriptiveNoteDAOImpl();
    private Utils utils = new Utils();

    public DescriptiveNoteComplexType getDescriptiveNoteComplexType(Node node) {
        ArrayList<DescriptiveNoteID> descriptiveNoteIDList = new ArrayList<DescriptiveNoteID>();
        ArrayList<DescriptiveNoteValue> descriptiveNoteValueList = new ArrayList<DescriptiveNoteValue>();
        ArrayList<SourceDescriptiveNote> sourceDescriptiveNoteList = new ArrayList<SourceDescriptiveNote>();
        HashMap<String, String> attributes = utils.getAttributes(node);

        NodeList childNodeList = node.getChildNodes();
        for (int i = 0; i < childNodeList.getLength(); i++) {
            Node child = childNodeList.item(i);
            String childName = child.getNodeName();

            switch (childName) {
                case "lido:descriptiveNoteID":
                    descriptiveNoteIDList.add(descriptiveNoteIDParser.getDescriptiveNoteID(child));
                    break;
                case "lido:descriptiveNoteValue":
                    descriptiveNoteValueList.add(descriptiveNoteValueParser.getDescriptiveNoteValue(child));
                    break;
                case "lido:sourceDescriptiveNote":
                    sourceDescriptiveNoteList.add(sourceDescriptiveNoteParser.getSourceDescriptiveNote(child));
                    break;
                default: break;
            }
        }

        return new DescriptiveNoteComplexType(
                descriptiveNoteIDList,
                descriptiveNoteValueList,
                sourceDescriptiveNoteList,
                new LidoType(attributes.get("lido:type")),
                new LidoSortOrder(attributes.get("lido:sortorder"))
        );
    }
}
