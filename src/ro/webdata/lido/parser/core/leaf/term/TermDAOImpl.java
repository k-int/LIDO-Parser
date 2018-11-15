package ro.webdata.lido.parser.core.leaf.term;

import ro.webdata.lido.parser.core.complex.termComplexType.TermComplexTypeDAO;
import ro.webdata.lido.parser.core.complex.termComplexType.TermComplexTypeDAOImpl;
import org.w3c.dom.Node;

public class TermDAOImpl implements TermDAO {
    private static TermComplexTypeDAO termComplexTypeDAO = new TermComplexTypeDAOImpl();

    public Term getTerm(Node node) {
        return new Term(termComplexTypeDAO.getTermComplexType(node));
    }
}
