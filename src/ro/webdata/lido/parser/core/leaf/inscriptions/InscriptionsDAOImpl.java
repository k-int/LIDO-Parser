package ro.webdata.lido.parser.core.leaf.inscriptions;

import ro.webdata.lido.parser.common.Utils;
import ro.webdata.lido.parser.core.leaf.inscriptionTranscription.InscriptionTranscription;
import ro.webdata.lido.parser.core.leaf.inscriptionTranscription.InscriptionTranscriptionDAO;
import ro.webdata.lido.parser.core.leaf.inscriptionTranscription.InscriptionTranscriptionDAOImpl;
import ro.webdata.lido.parser.core.leaf.inscriptionDescription.InscriptionDescription;
import ro.webdata.lido.parser.core.leaf.inscriptionDescription.InscriptionDescriptionDAO;
import ro.webdata.lido.parser.core.leaf.inscriptionDescription.InscriptionDescriptionDAOImpl;
import ro.webdata.lido.parser.core.attribute.LidoSortOrder;
import ro.webdata.lido.parser.core.attribute.LidoType;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.ArrayList;
import java.util.HashMap;

public class InscriptionsDAOImpl implements InscriptionsDAO {
    private static InscriptionTranscriptionDAO inscriptionTranscriptionParser = new InscriptionTranscriptionDAOImpl();
    private static InscriptionDescriptionDAO inscriptionDescriptionParser = new InscriptionDescriptionDAOImpl();
    private static Utils utils = new Utils();

    //TODO: create the InscriptionsComplexTypeDAO (artificial class) to extend the class
    public Inscriptions getInscriptions(Node node) {
        ArrayList<InscriptionTranscription> inscriptionTranscriptionList = new ArrayList<InscriptionTranscription>();
        ArrayList<InscriptionDescription> inscriptionDescriptionList = new ArrayList<InscriptionDescription>();
        HashMap<String, String> attributes = utils.getAttributes(node);
        NodeList childNodeList = node.getChildNodes();

        for (int i = 0; i < childNodeList.getLength(); i++) {
            Node child = childNodeList.item(i);
            String childName = child.getNodeName();

            switch (childName) {
                case "lido:inscriptionTranscription":
                    inscriptionTranscriptionList.add(inscriptionTranscriptionParser.getInscriptionTranscription(child));
                    break;
                case "lido:inscriptionDescription":
                    inscriptionDescriptionList.add(inscriptionDescriptionParser.getInscriptionDescription(child));
                    break;
                default: break;
            }
        }

        return new Inscriptions(
                inscriptionTranscriptionList,
                inscriptionDescriptionList,
                new LidoType(attributes.get("lido:type")),
                new LidoSortOrder(attributes.get("lido:sortorder"))
        );
    }
}
