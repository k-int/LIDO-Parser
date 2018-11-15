package ro.webdata.lido.parser.core.wrap.objectIdentificationWrap;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import ro.webdata.lido.parser.core.wrap.displayStateEditionWrap.DisplayStateEditionWrap;
import ro.webdata.lido.parser.core.wrap.displayStateEditionWrap.DisplayStateEditionWrapDAO;
import ro.webdata.lido.parser.core.wrap.displayStateEditionWrap.DisplayStateEditionWrapDAOImpl;
import ro.webdata.lido.parser.core.wrap.inscriptionsWrap.InscriptionsWrap;
import ro.webdata.lido.parser.core.wrap.inscriptionsWrap.InscriptionsWrapDAO;
import ro.webdata.lido.parser.core.wrap.inscriptionsWrap.InscriptionsWrapDAOImpl;
import ro.webdata.lido.parser.core.wrap.objectDescriptionWrap.ObjectDescriptionWrap;
import ro.webdata.lido.parser.core.wrap.objectDescriptionWrap.ObjectDescriptionWrapDAO;
import ro.webdata.lido.parser.core.wrap.objectDescriptionWrap.ObjectDescriptionWrapDAOImpl;
import ro.webdata.lido.parser.core.wrap.objectMeasurementsWrap.ObjectMeasurementsWrap;
import ro.webdata.lido.parser.core.wrap.objectMeasurementsWrap.ObjectMeasurementsWrapDAO;
import ro.webdata.lido.parser.core.wrap.objectMeasurementsWrap.ObjectMeasurementsWrapDAOImpl;
import ro.webdata.lido.parser.core.wrap.repositoryWrap.RepositoryWrap;
import ro.webdata.lido.parser.core.wrap.repositoryWrap.RepositoryWrapDAO;
import ro.webdata.lido.parser.core.wrap.repositoryWrap.RepositoryWrapDAOImpl;
import ro.webdata.lido.parser.core.wrap.titleWrap.TitleWrap;
import ro.webdata.lido.parser.core.wrap.titleWrap.TitleWrapDAO;
import ro.webdata.lido.parser.core.wrap.titleWrap.TitleWrapDAOImpl;

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