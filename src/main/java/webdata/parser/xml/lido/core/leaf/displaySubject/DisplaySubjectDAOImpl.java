package webdata.parser.xml.lido.core.leaf.displaySubject;

import org.w3c.dom.Node;
import ro.webdata.parser.xml.lido.core.complex.textComplexType.TextComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.textComplexType.TextComplexTypeDAOImpl;

public class DisplaySubjectDAOImpl implements DisplaySubjectDAO {
    private static TextComplexTypeDAO textComplexTypeDAO = new TextComplexTypeDAOImpl();

    public DisplaySubject getDisplaySubject(Node node) {
        return new DisplaySubject(textComplexTypeDAO.getTextComplexType(node));
    }
}
