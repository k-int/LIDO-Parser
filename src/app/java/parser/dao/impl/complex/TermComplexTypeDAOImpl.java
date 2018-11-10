package app.java.parser.dao.impl.complex;

import app.java.common.Utils;
import app.java.parser.dao.complex.TermComplexTypeDAO;
import app.java.parser.model.attribute.lido.LidoAddedSearchTerm;
import app.java.parser.model.attribute.lido.LidoEncodingAnalog;
import app.java.parser.model.attribute.lido.LidoLabel;
import app.java.parser.model.attribute.lido.LidoPref;
import app.java.parser.model.attribute.xml.XmlLang;
import app.java.parser.model.complex.TermComplexType;
import org.w3c.dom.Node;

import java.util.HashMap;

public class TermComplexTypeDAOImpl implements TermComplexTypeDAO {
    private static Utils utils = new Utils();

    public TermComplexType getTermComplexType(Node node) {
        HashMap<String, String> attributes = utils.getAttributes(node);

        return new TermComplexType(
                node.getTextContent(),
                new LidoPref(attributes.get("lido:pref")),
                new LidoAddedSearchTerm(attributes.get("lido:addedSearchTerm")),
                new XmlLang(attributes.get("xml:lang")),
                new LidoEncodingAnalog(attributes.get("lido:encodinganalog")),
                new LidoLabel(attributes.get("lido:label"))
        );
    }
}
