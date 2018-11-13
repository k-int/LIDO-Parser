package ro.webdata.lido.parser.parser.dao.impl.element.leaf.subject;

import ro.webdata.lido.parser.parser.dao.complex.subject.SubjectComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.subject.SubjectDAO;
import ro.webdata.lido.parser.parser.dao.impl.complex.subject.SubjectComplexTypeDAOImpl;
import ro.webdata.lido.parser.parser.model.element.leaf.subject.Subject;
import org.w3c.dom.Node;

public class SubjectDAOImpl implements SubjectDAO {
    private static SubjectComplexTypeDAO subjectComplexTypeDAO = new SubjectComplexTypeDAOImpl();

    public Subject getSubject(Node node) {
        return new Subject(subjectComplexTypeDAO.getSubjectComplexType(node));
    }
}
