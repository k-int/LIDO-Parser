package webdata.parser.xml.lido.core.leaf.extentSubject;

import org.w3c.dom.Node;
import ro.webdata.parser.xml.lido.core.complex.textComplexType.TextComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.textComplexType.TextComplexTypeDAOImpl;

public class ExtentSubjectDAOImpl implements ExtentSubjectDAO {
    private static TextComplexTypeDAO textComplexTypeDAO = new TextComplexTypeDAOImpl();

    public ExtentSubject getExtentSubject(Node node) {
        return new ExtentSubject(textComplexTypeDAO.getTextComplexType(node));
    }
}
