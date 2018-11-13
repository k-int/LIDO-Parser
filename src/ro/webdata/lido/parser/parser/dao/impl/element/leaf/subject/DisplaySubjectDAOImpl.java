package ro.webdata.lido.parser.parser.dao.impl.element.leaf.subject;

import ro.webdata.lido.parser.parser.dao.complex.TextComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.subject.DisplaySubjectDAO;
import ro.webdata.lido.parser.parser.dao.impl.complex.TextComplexTypeDAOImpl;
import ro.webdata.lido.parser.parser.model.element.leaf.subject.DisplaySubject;
import org.w3c.dom.Node;

public class DisplaySubjectDAOImpl implements DisplaySubjectDAO {
    private static TextComplexTypeDAO textComplexTypeDAO = new TextComplexTypeDAOImpl();

    public DisplaySubject getDisplaySubject(Node node) {
        return new DisplaySubject(textComplexTypeDAO.getTextComplexType(node));
    }
}
