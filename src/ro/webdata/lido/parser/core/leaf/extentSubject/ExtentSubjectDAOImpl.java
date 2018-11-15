package ro.webdata.lido.parser.core.leaf.extentSubject;

import ro.webdata.lido.parser.core.complex.textComplexType.TextComplexTypeDAO;
import ro.webdata.lido.parser.core.complex.textComplexType.TextComplexTypeDAOImpl;
import org.w3c.dom.Node;

public class ExtentSubjectDAOImpl implements ExtentSubjectDAO {
    private static TextComplexTypeDAO textComplexTypeDAO = new TextComplexTypeDAOImpl();

    public ExtentSubject getExtentSubject(Node node) {
        return new ExtentSubject(textComplexTypeDAO.getTextComplexType(node));
    }
}
