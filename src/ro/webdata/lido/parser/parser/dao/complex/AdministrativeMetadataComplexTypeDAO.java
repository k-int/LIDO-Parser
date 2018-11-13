package ro.webdata.lido.parser.parser.dao.complex;

import ro.webdata.lido.parser.parser.model.complex.AdministrativeMetadataComplexType;
import org.w3c.dom.Node;

public interface AdministrativeMetadataComplexTypeDAO {
	/**
	 *
	 * @param node <b>lido:administrativeMetadata</b> node type.
	 * @return <b>AdministrativeMetadataComplexType</b>
	 */
	AdministrativeMetadataComplexType getAdministrativeMetadataComplexType(Node node);
}
