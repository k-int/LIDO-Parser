package ro.webdata.lido.parser.parser.dao.impl.element.wrap;

import ro.webdata.lido.parser.parser.dao.element.set.SubjectSetDAO;
import ro.webdata.lido.parser.parser.dao.element.wrap.SubjectWrapDAO;
import ro.webdata.lido.parser.parser.dao.impl.element.set.SubjectSetDAOImpl;
import ro.webdata.lido.parser.parser.model.element.set.SubjectSet;
import ro.webdata.lido.parser.parser.model.element.wrap.SubjectWrap;
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
