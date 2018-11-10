package app.java.parser.dao.element.leaf.descriptiveNote;

import app.java.parser.model.element.leaf.descriptiveNote.DescriptiveNoteID;
import org.w3c.dom.Node;

public interface DescriptiveNoteIDDAO {
	/**
	 *
	 * @param node <b>lido:descriptiveNoteID</b> node type.
	 * @return <b>DescriptiveNoteID</b>
	 */
	DescriptiveNoteID getDescriptiveNoteID(Node node);
}
