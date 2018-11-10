package app.java.parser.dao.impl.element.wrap;

import app.java.parser.dao.element.set.SubjectSetDAO;
import app.java.parser.dao.element.wrap.SubjectWrapDAO;
import app.java.parser.dao.impl.element.set.SubjectSetDAOImpl;
import app.java.parser.model.element.set.SubjectSet;
import app.java.parser.model.element.wrap.SubjectWrap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.ArrayList;

public class SubjectWrapDAOImpl implements SubjectWrapDAO {
    private static SubjectSetDAO subjectSetParser = new SubjectSetDAOImpl();

    public SubjectWrap getSubjectWrap(Node node) {
        ArrayList<SubjectSet> subjectSetList = new ArrayList<SubjectSet>();
        NodeList childNodeList = node.getChildNodes();

        for (int i = 0; i < childNodeList.getLength(); i++) {
            Node child = childNodeList.item(i);
            String childName = child.getNodeName();

            if (childName.equals("lido:subjectSet")) {
                subjectSetList.add(subjectSetParser.getSubjectSet(child));
            }
        }

        return new SubjectWrap(subjectSetList);
    }
}
