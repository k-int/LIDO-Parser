package app.java.parser.dao.impl.element.leaf.subject;

import app.java.parser.dao.complex.TextComplexTypeDAO;
import app.java.parser.dao.element.leaf.subject.ExtentSubjectDAO;
import app.java.parser.dao.impl.complex.TextComplexTypeDAOImpl;
import app.java.parser.model.element.leaf.subject.ExtentSubject;
import org.w3c.dom.Node;

public class ExtentSubjectDAOImpl implements ExtentSubjectDAO {
    private static TextComplexTypeDAO textComplexTypeDAO = new TextComplexTypeDAOImpl();

    public ExtentSubject getExtentSubject(Node node) {
        return new ExtentSubject(textComplexTypeDAO.getTextComplexType(node));
    }
}
