package webdata.parser.xml.lido.core.leaf.subject;

import org.w3c.dom.Node;
import ro.webdata.parser.xml.lido.core.complex.subjectComplexType.SubjectComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.subjectComplexType.SubjectComplexTypeDAOImpl;

public class SubjectDAOImpl implements SubjectDAO {
    private static SubjectComplexTypeDAO subjectComplexTypeDAO = new SubjectComplexTypeDAOImpl();

    public Subject getSubject(Node node) {
        return new Subject(subjectComplexTypeDAO.getSubjectComplexType(node));
    }
}
