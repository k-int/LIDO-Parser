package app.java.parser.dao.element.leaf.descriptiveNote;

import app.java.parser.model.element.leaf.descriptiveNote.DescriptiveNoteValue;
import org.w3c.dom.Node;

public interface DescriptiveNoteValueDAO {
	/**
	 *
	 * @param node <b>lido:descriptiveNoteValue</b> node type.
	 * @return <b>DescriptiveNoteValue</b>
	 */
	DescriptiveNoteValue getDescriptiveNoteValue(Node node);
}
