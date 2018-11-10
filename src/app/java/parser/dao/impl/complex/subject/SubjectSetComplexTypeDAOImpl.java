package app.java.parser.dao.impl.complex.subject;

import app.java.parser.dao.complex.subject.SubjectSetComplexTypeDAO;
import app.java.parser.dao.element.leaf.subject.DisplaySubjectDAO;
import app.java.parser.dao.element.leaf.subject.SubjectDAO;
import app.java.parser.dao.impl.element.leaf.subject.DisplaySubjectDAOImpl;
import app.java.parser.dao.impl.element.leaf.subject.SubjectDAOImpl;
import app.java.parser.model.complex.subject.SubjectSetComplexType;
import app.java.parser.model.element.leaf.subject.DisplaySubject;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.ArrayList;

public class SubjectSetComplexTypeDAOImpl implements SubjectSetComplexTypeDAO {
    private static DisplaySubjectDAO displaySubjectParser = new DisplaySubjectDAOImpl();
    private static SubjectDAO subjectDAOParser = new SubjectDAOImpl();

    public SubjectSetComplexType getSubjectSetComplexType(Node node) {
        ArrayList<DisplaySubject> displaySubjectList = new ArrayList<DisplaySubject>();
        app.java.parser.model.element.leaf.subject.Subject subject = null;

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
