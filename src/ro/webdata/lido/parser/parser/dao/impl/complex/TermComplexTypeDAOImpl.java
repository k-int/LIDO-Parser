package ro.webdata.lido.parser.parser.dao.impl.complex;

import ro.webdata.lido.parser.common.Utils;
import ro.webdata.lido.parser.parser.dao.complex.TermComplexTypeDAO;
import ro.webdata.lido.parser.parser.model.attribute.lido.LidoAddedSearchTerm;
import ro.webdata.lido.parser.parser.model.attribute.lido.LidoEncodingAnalog;
import ro.webdata.lido.parser.parser.model.attribute.lido.LidoLabel;
import ro.webdata.lido.parser.parser.model.attribute.lido.LidoPref;
import ro.webdata.lido.parser.parser.model.attribute.xml.XmlLang;
import ro.webdata.lido.parser.parser.model.complex.TermComplexType;
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
