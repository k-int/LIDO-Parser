package app.java.parser.dao.impl.complex;

import app.java.parser.dao.complex.ConceptComplexTypeDAO;
import app.java.parser.dao.element.leaf.ConceptIDDAO;
import app.java.parser.dao.element.leaf.TermDAO;
import app.java.parser.dao.impl.element.leaf.ConceptIDDAOImpl;
import app.java.parser.dao.impl.element.leaf.TermDAOImpl;
import app.java.parser.model.complex.ConceptComplexType;
import app.java.parser.model.element.leaf.ConceptID;
import app.java.parser.model.element.leaf.Term;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.ArrayList;

public class ConceptComplexTypeDAOImpl implements ConceptComplexTypeDAO {
    private static ConceptIDDAO conceptIDParser = new ConceptIDDAOImpl();
    private static TermDAO termParser = new TermDAOImpl();

    public ConceptComplexType getConceptComplexType(Node node) {
        ArrayList<ConceptID> conceptIDList = new ArrayList<ConceptID>();
        ArrayList<Term> termList = new ArrayList<Term>();

        NodeList childNodeList = node.getChildNodes();
        for (int i = 0; i < childNodeList.getLength(); i++) {
            Node child = childNodeList.item(i);
            String childName = child.getNodeName();

            switch (childName) {
                case "lido:conceptID":
                    conceptIDList.add(conceptIDParser.getConceptID(child));
                    break;
                case "lido:term":
                    termList.add(termParser.getTerm(child));
                    break;
                default: break;
            }
        }

        return new ConceptComplexType(conceptIDList, termList);
    }
}
