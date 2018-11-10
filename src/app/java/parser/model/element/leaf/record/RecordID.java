package app.java.parser.model.element.leaf.record;

import app.java.parser.model.complex.IdentifierComplexType;

/**
 * <link rel="stylesheet" type="text/css" href="../../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 		<div class="lido-doc">
 * 			<b>Definition:</b> A unique record identification in the contributor's (local) system.
 * 		</div>
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class RecordID extends IdentifierComplexType {
	public RecordID() {}

	public RecordID(IdentifierComplexType identifierComplexType) {
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
