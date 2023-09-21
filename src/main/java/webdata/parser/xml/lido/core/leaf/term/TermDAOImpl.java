package webdata.parser.xml.lido.core.leaf.term;

import org.w3c.dom.Node;
import ro.webdata.parser.xml.lido.core.complex.termComplexType.TermComplexTypeDAO;
import ro.webdata.parser.xml.lido.core.complex.termComplexType.TermComplexTypeDAOImpl;

public class TermDAOImpl implements TermDAO {
    private static TermComplexTypeDAO termComplexTypeDAO = new TermComplexTypeDAOImpl();

    public Term getTerm(Node node) {
        return new Term(termComplexTypeDAO.getTermComplexType(node));
    }
}
