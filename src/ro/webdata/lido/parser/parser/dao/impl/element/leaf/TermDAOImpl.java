package ro.webdata.lido.parser.parser.dao.impl.element.leaf;

import ro.webdata.lido.parser.parser.dao.complex.TermComplexTypeDAO;
import ro.webdata.lido.parser.parser.dao.element.leaf.TermDAO;
import ro.webdata.lido.parser.parser.dao.impl.complex.TermComplexTypeDAOImpl;
import ro.webdata.lido.parser.parser.model.element.leaf.Term;
import org.w3c.dom.Node;

public class TermDAOImpl implements TermDAO {
    private static TermComplexTypeDAO termComplexTypeDAO = new TermComplexTypeDAOImpl();

    public Term getTerm(Node node) {
        return new Term(termComplexTypeDAO.getTermComplexType(node));
    }
}
