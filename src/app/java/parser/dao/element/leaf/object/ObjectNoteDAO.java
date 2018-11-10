package app.java.parser.dao.element.leaf.object;

import app.java.parser.model.element.leaf.object.ObjectNote;
import org.w3c.dom.Node;

public interface ObjectNoteDAO {
	/**
	 *
	 * @param node <b>lido:objectNote</b> node type.
	 * @return <b>ObjectNote</b>
	 */
	ObjectNote getObjectNote(Node node);
}
