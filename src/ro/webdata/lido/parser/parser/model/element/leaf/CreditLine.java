package ro.webdata.lido.parser.parser.model.element.leaf;

import ro.webdata.lido.parser.parser.model.complex.TextComplexType;

/**
 * <link rel="stylesheet" type="text/css" href="../../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 		<div class="lido-doc">
 * 			<b>Definition:</b> Acknowledgement of the rights associated with the physical and/or
 * 			digital object as requested.<br/>
 * 			<b>How to record:</b> Repeat this element only for language variants.
 * 		</div>
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class CreditLine extends TextComplexType {
	public CreditLine() {}

	public CreditLine(TextComplexType textComplexType) {
		super(
			textComplexType.getText(),
			textComplexType.getLang(),
			textComplexType.getEncodingAnalog(),
			textComplexType.getLabel()
		);
	}
}