package ro.webdata.lido.parser.parser.dao.complex;

import ro.webdata.lido.parser.parser.model.complex.DescriptiveNoteComplexType;
import org.w3c.dom.Node;

public interface DescriptiveNoteComplexTypeDAO {
	/**
	 *
	 * @param node <b>lido:descriptiveNoteComplexType</b> node type.
	 * @return <b>DescriptiveNoteComplexType</b>
	 */
	DescriptiveNoteComplexType getDescriptiveNoteComplexType(Node node);
}
