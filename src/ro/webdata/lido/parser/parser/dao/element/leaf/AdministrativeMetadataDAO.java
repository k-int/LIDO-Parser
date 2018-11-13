package ro.webdata.lido.parser.parser.dao.element.leaf;

import ro.webdata.lido.parser.parser.model.element.leaf.AdministrativeMetadata;
import org.w3c.dom.Node;

public interface AdministrativeMetadataDAO {
	/**
	 *
	 * @param node <b>lido:descriptiveMetadata</b> node type.
	 * @return <b>AdministrativeMetadata</b>
	 */
	AdministrativeMetadata getAdministrativeMetadata(Node node);
}
