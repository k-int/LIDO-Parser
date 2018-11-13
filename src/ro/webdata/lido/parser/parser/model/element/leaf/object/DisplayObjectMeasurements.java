package ro.webdata.lido.parser.parser.model.element.leaf.object;

import ro.webdata.lido.parser.parser.model.complex.TextComplexType;

/**
 * <link rel="stylesheet" type="text/css" href="../../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 		<div class="lido-doc">
 * 			<b>Definition:</b> Display element for one object measurement, corresponding
 * 			to the following objectMeasurement element.<br/>
 * 			<b>How to record:</b> Repeat this element only for language variants.
 * 		</div>
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class DisplayObjectMeasurements extends TextComplexType {
	public DisplayObjectMeasurements() {}

	public DisplayObjectMeasurements(TextComplexType textComplexType) {
		super(
			textComplexType.getText(),
			textComplexType.getLang(),
			textComplexType.getEncodingAnalog(),
			textComplexType.getLabel()
		);
	}
}
