package app.java.parser.dao.element.leaf;

import app.java.parser.model.element.leaf.AdministrativeMetadata;
import org.w3c.dom.Node;

public interface AdministrativeMetadataDAO {
	/**
	 *
	 * @param node <b>lido:descriptiveMetadata</b> node type.
	 * @return <b>AdministrativeMetadata</b>
	 */
	AdministrativeMetadata getAdministrativeMetadata(Node node);
}
