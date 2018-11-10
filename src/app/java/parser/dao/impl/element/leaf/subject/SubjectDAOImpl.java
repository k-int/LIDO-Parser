package app.java.parser.dao.impl.element.leaf.subject;

import app.java.parser.dao.complex.subject.SubjectComplexTypeDAO;
import app.java.parser.dao.element.leaf.subject.SubjectDAO;
import app.java.parser.dao.impl.complex.subject.SubjectComplexTypeDAOImpl;
import app.java.parser.model.element.leaf.subject.Subject;
import org.w3c.dom.Node;

public class SubjectDAOImpl implements SubjectDAO {
    private static SubjectComplexTypeDAO subjectComplexTypeDAO = new SubjectComplexTypeDAOImpl();

    public Subject getSubject(Node node) {
        return new Subject(subjectComplexTypeDAO.getSubjectComplexType(node));
    }
}
