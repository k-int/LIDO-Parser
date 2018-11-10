package app.java.parser.model.element.leaf.resource;

import app.java.parser.model.complex.ConceptComplexType;

/**
 * <link rel="stylesheet" type="text/css" href="../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 		<div class="lido-doc">
 * 			<b>Definition:</b> The generic identification of the medium of the image or
 * 			other resource.<br/>
 * 			<b>How to record:</b> Preferably using a controlled published value list.
 * 			Example values: digital image, photograph, slide, videotape, X-ray photograph,
 * 			negative.
 * 		</div>
 * </div>
 * @author WebData
 *
 */
public class ResourceType extends ConceptComplexType {
	public ResourceType() {}

	public ResourceType(ConceptComplexType conceptComplexType) {
		super(
			conceptComplexType.getConceptID(),
			conceptComplexType.getTerm()
		);
	}
}
