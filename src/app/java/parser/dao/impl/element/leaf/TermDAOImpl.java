package app.java.parser.dao.impl.element.leaf;

import app.java.parser.dao.complex.TermComplexTypeDAO;
import app.java.parser.dao.element.leaf.TermDAO;
import app.java.parser.dao.impl.complex.TermComplexTypeDAOImpl;
import app.java.parser.model.element.leaf.Term;
import org.w3c.dom.Node;

public class TermDAOImpl implements TermDAO {
    private static TermComplexTypeDAO termComplexTypeDAO = new TermComplexTypeDAOImpl();

    public Term getTerm(Node node) {
        return new Term(termComplexTypeDAO.getTermComplexType(node));
    }
}
