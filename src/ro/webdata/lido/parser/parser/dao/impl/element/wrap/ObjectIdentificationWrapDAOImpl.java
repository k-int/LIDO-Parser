package ro.webdata.lido.parser.parser.dao.impl.element.wrap;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import ro.webdata.lido.parser.parser.dao.element.wrap.*;
import ro.webdata.lido.parser.parser.model.element.wrap.*;

public class ObjectIdentificationWrapDAOImpl implements ObjectIdentificationWrapDAO {
    private static TitleWrapDAO titleWrapDAO = new TitleWrapDAOImpl();
    private static InscriptionsWrapDAO inscriptionsWrapDAO = new InscriptionsWrapDAOImpl();
    private static RepositoryWrapDAO repositoryWrapDAO = new RepositoryWrapDAOImpl();
    private static DisplayStateEditionWrapDAO displayStateEditionWrapDAO = new DisplayStateEditionWrapDAOImpl();
    private static ObjectDescriptionWrapDAO objectDescriptionWrapDAO = new ObjectDescriptionWrapDAOImpl();
    private static ObjectMeasurementsWrapDAO objectMeasurementsWrapDAO = new ObjectMeasurementsWrapDAOImpl();

    public ObjectIdentificationWrap getObjectIdentificationWrap(Node node) {
        TitleWrap titleWrap = null;
        InscriptionsWrap inscriptionsWrap = null;
        RepositoryWrap repositoryWrap = null;
        DisplayStateEditionWrap displayStateEditionWrap = null;
        ObjectDescriptionWrap objectDescriptionWrap = null;
        ObjectMeasurementsWrap objectMeasurementsWrap = null;
        NodeList childNodeList = node.getChildNodes();

        for (int i = 0; i < childNodeList.getLength(); i++) {
            Node child = childNodeList.item(i);
            String childName = child.getNodeName();

            switch (childName) {
                case "lido:titleWrap":
                    titleWrap = titleWrapDAO.getTitleWrap(child);
                    break;
                case "lido:inscriptionsWrap":
                    inscriptionsWrap = inscriptionsWrapDAO.getInscriptionsWrap(child);
                    break;
                case "lido:repositoryWrap":
                    repositoryWrap = repositoryWrapDAO.getRepositoryWrap(child);
                    break;
                case "lido:displayStateEditionWrap":
                    displayStateEditionWrap = displayStateEditionWrapDAO.getDisplayStateEditionWrap(child);
                    break;
                case "lido:objectDescriptionWrap":
                    objectDescriptionWrap = objectDescriptionWrapDAO.getObjectDescriptionWrap(child);
                    break;
                case "lido:objectMeasurementsWrap":
                    objectMeasurementsWrap = objectMeasurementsWrapDAO.getObjectMeasurementsWrap(child);
                    break;
                default: break;
            }
        }

        return new ObjectIdentificationWrap(
                titleWrap,
                inscriptionsWrap,
                repositoryWrap,
                displayStateEditionWrap,
                objectDescriptionWrap,
                objectMeasurementsWrap
        );
    }
}
