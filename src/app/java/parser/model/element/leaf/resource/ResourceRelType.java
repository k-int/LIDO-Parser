package app.java.parser.model.element.leaf.resource;

import app.java.parser.model.complex.ConceptComplexType;

/**
 * <link rel="stylesheet" type="text/css" href="../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 		<div class="lido-doc">
 * 			<b>Definition:</b> The relationship of the resource to the object / work being
 * 			described.<br/>
 * 			<b>How to record:</b> Example values: conservation image, documentary image,
 * 			contextual image, historical image, reconstruction, and installation image
 * 		</div>
 * </div>
 * @author WebData
 *
 */
public class ResourceRelType extends ConceptComplexType {
	public ResourceRelType() {}

	public ResourceRelType(ConceptComplexType conceptComplexType) {
		super(
			conceptComplexType.getConceptID(),
			conceptComplexType.getTerm()
		);
	}
}
