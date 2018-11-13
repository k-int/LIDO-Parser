package ro.webdata.lido.parser.parser.dao.impl.complex.subject;

import ro.webdata.lido.parser.parser.dao.complex.subject.SubjectSetComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.subject.DisplaySubjectDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.subject.SubjectDAO;
import ro.webdata.lido.parser.parser.dao.impl.element.leaf.subject.DisplaySubjectDAOImpl;
import ro.webdata.lido.parser.parser.dao.impl.element.leaf.subject.SubjectDAOImpl;
import ro.webdata.lido.parser.parser.model.complex.subject.SubjectSetComplexType;
import ro.webdata.lido.parser.parser.model.element.leaf.subject.DisplaySubject;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import ro.webdata.lido.parser.parser.model.element.leaf.subject.Subject;

import java.util.ArrayList;

public class SubjectSetComplexTypeDAOImpl implements SubjectSetComplexTypeDAO {
    private static DisplaySubjectDAO displaySubjectParser = new DisplaySubjectDAOImpl();
    private static SubjectDAO subjectDAOParser = new SubjectDAOImpl();

    public SubjectSetComplexType getSubjectSetComplexType(Node node) {
        ArrayList<DisplaySubject> displaySubjectList = new ArrayList<DisplaySubject>();
        Subject subject = null;

        NodeList childNodeList = node.getChildNodes();
        for (int i = 0; i < childNodeList.getLength(); i++) {
            Node child = childNodeList.item(i);
            String childName = child.getNodeName();

            switch (childName) {
                case "lido:displaySubject":
                    displaySubjectList.add(displaySubjectParser.getDisplaySubject(child));
                    break;
                case "lido:subject":
                    subject = subjectDAOParser.getSubject(child);
                    break;
                default: break;
            }
        }

        return new SubjectSetComplexType(displaySubjectList, subject);
    }
}
