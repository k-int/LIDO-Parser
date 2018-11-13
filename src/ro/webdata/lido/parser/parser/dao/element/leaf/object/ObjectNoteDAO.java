package ro.webdata.lido.parser.parser.dao.element.leaf.object;

import ro.webdata.lido.parser.parser.model.element.leaf.object.ObjectNote;
import org.w3c.dom.Node;

public interface ObjectNoteDAO {
	/**
	 *
	 * @param node <b>lido:objectNote</b> node type.
	 * @return <b>ObjectNote</b>
	 */
	ObjectNote getObjectNote(Node node);
}
