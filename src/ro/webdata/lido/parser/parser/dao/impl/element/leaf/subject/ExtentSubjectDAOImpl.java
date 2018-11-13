package ro.webdata.lido.parser.parser.dao.impl.element.leaf.subject;

import ro.webdata.lido.parser.parser.dao.complex.TextComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.subject.ExtentSubjectDAO;
import ro.webdata.lido.parser.parser.dao.impl.complex.TextComplexTypeDAOImpl;
import ro.webdata.lido.parser.parser.model.element.leaf.subject.ExtentSubject;
import org.w3c.dom.Node;

public class ExtentSubjectDAOImpl implements ExtentSubjectDAO {
    private static TextComplexTypeDAO textComplexTypeDAO = new TextComplexTypeDAOImpl();

    public ExtentSubject getExtentSubject(Node node) {
        return new ExtentSubject(textComplexTypeDAO.getTextComplexType(node));
    }
}
