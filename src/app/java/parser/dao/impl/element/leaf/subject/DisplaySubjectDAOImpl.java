package app.java.parser.dao.impl.element.leaf.subject;

import app.java.parser.dao.complex.TextComplexTypeDAO;
import app.java.parser.dao.element.leaf.subject.DisplaySubjectDAO;
import app.java.parser.dao.impl.complex.TextComplexTypeDAOImpl;
import app.java.parser.model.element.leaf.subject.DisplaySubject;
import org.w3c.dom.Node;

public class DisplaySubjectDAOImpl implements DisplaySubjectDAO {
    private static TextComplexTypeDAO textComplexTypeDAO = new TextComplexTypeDAOImpl();

    public DisplaySubject getDisplaySubject(Node node) {
        return new DisplaySubject(textComplexTypeDAO.getTextComplexType(node));
    }
}
