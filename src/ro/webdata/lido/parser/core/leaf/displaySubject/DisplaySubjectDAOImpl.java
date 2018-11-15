package ro.webdata.lido.parser.core.leaf.displaySubject;

import ro.webdata.lido.parser.core.complex.textComplexType.TextComplexTypeDAO;
import ro.webdata.lido.parser.core.complex.textComplexType.TextComplexTypeDAOImpl;
import org.w3c.dom.Node;

public class DisplaySubjectDAOImpl implements DisplaySubjectDAO {
    private static TextComplexTypeDAO textComplexTypeDAO = new TextComplexTypeDAOImpl();

    public DisplaySubject getDisplaySubject(Node node) {
        return new DisplaySubject(textComplexTypeDAO.getTextComplexType(node));
    }
}
