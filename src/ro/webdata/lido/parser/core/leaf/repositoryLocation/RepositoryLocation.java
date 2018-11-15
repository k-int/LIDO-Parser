package ro.webdata.lido.parser.core.leaf.repositoryLocation;

import ro.webdata.lido.parser.core.complex.placeComplexType.PlaceComplexType;

/**
 * <link rel="stylesheet" type="text/css" href="../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 	<div class="lido-doc">
 * 		<b>Definition:</b> Location of the object, especially relevant for architecture
 * 		and archaeological sites.
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class RepositoryLocation extends PlaceComplexType {
	public RepositoryLocation() {}

	public RepositoryLocation(PlaceComplexType placeComplexType) {
		super(
			placeComplexType.getPlaceID(),
			placeComplexType.getNamePlaceSet(),
			placeComplexType.getGml(),
			placeComplexType.getPartOfPlace(),
			placeComplexType.getPlaceClassification(),
			placeComplexType.getPoliticalEntity(),
			placeComplexType.getGeographicalEntity()
		);
	}
}
