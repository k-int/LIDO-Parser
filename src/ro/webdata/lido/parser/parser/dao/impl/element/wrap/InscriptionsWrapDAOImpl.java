package ro.webdata.lido.parser.parser.dao.impl.element.wrap;

import ro.webdata.lido.parser.parser.dao.element.leaf.inscription.InscriptionsDAO;
import ro.webdata.lido.parser.parser.dao.element.wrap.InscriptionsWrapDAO;
import ro.webdata.lido.parser.parser.dao.impl.element.leaf.inscription.InscriptionsDAOImpl;
import ro.webdata.lido.parser.parser.model.element.leaf.inscription.Inscriptions;
import ro.webdata.lido.parser.parser.model.element.wrap.InscriptionsWrap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.ArrayList;

public class InscriptionsWrapDAOImpl implements InscriptionsWrapDAO {
    private static InscriptionsDAO inscriptionsDAO = new InscriptionsDAOImpl();

    public InscriptionsWrap getInscriptionsWrap(Node node) {
        ArrayList<Inscriptions> inscriptionsList = new ArrayList<Inscriptions>();
        NodeList childNodeList = node.getChildNodes();

        for (int i = 0; i < childNodeList.getLength(); i++) {
            Node child = childNodeList.item(i);
            String childName = child.getNodeName();

            if (childName.equals("lido:inscriptions")) {
                inscriptionsList.add(inscriptionsDAO.getInscriptions(child));
            }
        }

        return new InscriptionsWrap(inscriptionsList);
    }
}
