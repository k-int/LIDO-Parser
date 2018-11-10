package app.java.parser.dao.element.leaf;

import app.java.parser.model.element.leaf.DescriptiveMetadata;
import org.w3c.dom.Node;

public interface DescriptiveMetadataDAO {
	/**
	 *
	 * @param node <b>lido:descriptiveMetadata</b> node type.
	 * @return <b>DescriptiveMetadata</b>
	 */
	DescriptiveMetadata getDescriptiveMetadata(Node node);
}
