package ro.webdata.lido.parser.core.leaf.administrativeMetadata;

import ro.webdata.lido.parser.core.complex.administrativeMetadataComplexType.AdministrativeMetadataComplexType;

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
