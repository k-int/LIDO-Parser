package ro.webdata.lido.parser.parser.dao.element.leaf.descriptiveNote;

import ro.webdata.lido.parser.parser.model.element.leaf.descriptiveNote.SourceDescriptiveNote;
import org.w3c.dom.Node;

public interface SourceDescriptiveNoteDAO {
	/**
	 *
	 * @param node <b>lido:sourceDescriptiveNote</b> node type.
	 * @return <b>SourceDescriptiveNote</b>
	 */
	SourceDescriptiveNote getSourceDescriptiveNote(Node node);
}
