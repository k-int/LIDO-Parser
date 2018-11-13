package ro.webdata.lido.parser.parser.model.element.leaf;

import ro.webdata.lido.parser.parser.model.complex.AdministrativeMetadataComplexType;

/**
 * <link rel="stylesheet" type="text/css" href="../../../../javadoc.css"/>
 *
 * @author WebData
 *
 */
public class AdministrativeMetadata extends AdministrativeMetadataComplexType {
	public AdministrativeMetadata() {}

	public AdministrativeMetadata(AdministrativeMetadataComplexType administrativeMetadataComplexType) {
		super(
			administrativeMetadataComplexType.getRightsWorkWrap(),
			administrativeMetadataComplexType.getRecordWrap(),
			administrativeMetadataComplexType.getResourceWrap(),
			administrativeMetadataComplexType.getLang()
		);
	}
}
