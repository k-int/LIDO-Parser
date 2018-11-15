package ro.webdata.lido.parser.core.leaf.descriptiveMetadata;

import ro.webdata.lido.parser.core.complex.descriptiveMetadataComplexType.DescriptiveMetadataComplexType;

/**
 * <link rel="stylesheet" type="text/css" href="../../../../javadoc.css"/>
 *
 * @author WebData
 *
 */
public class DescriptiveMetadata extends DescriptiveMetadataComplexType {
	public DescriptiveMetadata() {}

	public DescriptiveMetadata(DescriptiveMetadataComplexType descriptiveMetadataComplexType) {
		super(
			descriptiveMetadataComplexType.getObjectClassificationWrap(),
			descriptiveMetadataComplexType.getObjectIdentificationWrap(),
			descriptiveMetadataComplexType.getEventWrap(),
			descriptiveMetadataComplexType.getObjectRelationWrap(),
			descriptiveMetadataComplexType.getLang()
		);
	}
}
