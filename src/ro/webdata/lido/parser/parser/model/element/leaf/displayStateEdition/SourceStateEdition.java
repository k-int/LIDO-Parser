package ro.webdata.lido.parser.parser.model.element.leaf.displayStateEdition;

import ro.webdata.lido.parser.parser.model.complex.TextComplexType;

/**
 * <link rel="stylesheet" type="text/css" href="../../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 		<div class="lido-doc">
 * 			<b>Definition:</b> The published source of the state or edition information.
 * 		</div>
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class SourceStateEdition extends TextComplexType {
	public SourceStateEdition() {}

	public SourceStateEdition(TextComplexType textComplexType) {
		super(
			textComplexType.getText(),
			textComplexType.getLang(),
			textComplexType.getEncodingAnalog(),
			textComplexType.getLabel()
		);
	}
}
