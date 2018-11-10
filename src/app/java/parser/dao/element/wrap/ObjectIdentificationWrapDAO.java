package app.java.parser.dao.element.wrap;

import app.java.parser.model.element.wrap.ObjectIdentificationWrap;
import org.w3c.dom.Node;

public interface ObjectIdentificationWrapDAO {
    /**
     *
     * @param node <b>lido:objectIdentificationWrap</b> node type.
     * @return <b>ObjectIdentificationWrap</b>
     */
    ObjectIdentificationWrap getObjectIdentificationWrap(Node node);
}
