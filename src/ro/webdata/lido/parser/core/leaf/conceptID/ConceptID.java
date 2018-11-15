package ro.webdata.lido.parser.core.leaf.conceptID;

import ro.webdata.lido.parser.core.complex.identifierComplexType.IdentifierComplexType;

/**
 * <link rel="stylesheet" type="text/css" href="../../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 		<div class="lido-doc">
 * 			<b>Definition:</b> A unique identifier for the concept.<br/>
 * 			<b>How to record:</b> Preferably taken from and linking to a published controlled vocabulary.
 * 		</div>
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class ConceptID extends IdentifierComplexType {
	public ConceptID() {}

	public ConceptID(IdentifierComplexType identifierComplexType) {
		super(
			identifierComplexType.getText(),
			identifierComplexType.getPref(),
			identifierComplexType.getType(),
			identifierComplexType.getSource(),
			identifierComplexType.getEncodingAnalog(),
			identifierComplexType.getLabel()
		);
	}
}
