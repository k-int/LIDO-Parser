package ro.webdata.lido.parser.parser.dao.element.leaf;

import ro.webdata.lido.parser.parser.model.element.leaf.DescriptiveMetadata;
import org.w3c.dom.Node;

public interface DescriptiveMetadataDAO {
	/**
	 *
	 * @param node <b>lido:descriptiveMetadata</b> node type.
	 * @return <b>DescriptiveMetadata</b>
	 */
	DescriptiveMetadata getDescriptiveMetadata(Node node);
}
