package ro.webdata.lido.parser.parser.model.element.leaf.object;

import ro.webdata.lido.parser.parser.model.complex.TextComplexType;

/**
 * <link rel="stylesheet" type="text/css" href="../../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 		<div class="lido-doc">
 * 			<b>Definition:</b> A free-text description of the object, corresponding to the
 * 			following object element<br/>
 * 			<b>How to record:</b> Contains identifying information and links to another object.
 * 		</div>
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class DisplayObject extends TextComplexType {
	public DisplayObject() {}

	public DisplayObject(TextComplexType textComplexType) {
		super(
			textComplexType.getText(),
			textComplexType.getLang(),
			textComplexType.getEncodingAnalog(),
			textComplexType.getLabel()
		);
	}
}
