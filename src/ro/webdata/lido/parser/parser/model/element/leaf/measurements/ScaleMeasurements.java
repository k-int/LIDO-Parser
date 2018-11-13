package ro.webdata.lido.parser.parser.model.element.leaf.measurements;

import ro.webdata.lido.parser.parser.model.attribute.lido.LidoSortOrder;
import ro.webdata.lido.parser.parser.model.complex.TextComplexType;

/**<link rel="stylesheet" type="text/css" href="../../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 	<div class="lido-doc">
 * 		<b>Definition:</b> An expression of the ratio between the size of the
 * 		representation of something and that thing (e.g., the size of the drawn
 * 		structure and the actual built work). <br/>
 * 		<b>How to record:</b> Example values for scale: numeric (e.g., 1 inch = 1 foot),
 * 		full-size, life-size, half size,monumental. and others as recommended in CCO and CDWA.
 * 		Combine this tag with Measurement Sets for numeric scales. For measurementsSet type
 * 		for Scale, use "base" for the left side of the equation, and "target" for the right
 * 		side of the equation).<br/>
 * 		<b>Notes:</b> Used for studies, record drawings, models, and other representations
 * 		drawn or constructed to scale.<br/>
 *
 * 		<b>Attributes:</b>
 * 		<div class="lido-attr">
 * 			<b>sortOrder (lido:sortorder)</b>
 * 		</div>
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class ScaleMeasurements extends TextComplexType {
	private LidoSortOrder sortOrder;

	public ScaleMeasurements() {}

	public ScaleMeasurements(TextComplexType textComplexType, LidoSortOrder sortOrder) {
		super(
			textComplexType.getText(),
			textComplexType.getLang(),
			textComplexType.getEncodingAnalog(),
			textComplexType.getLabel()
		);
		setSortOrder(sortOrder);
	}

	public LidoSortOrder getSortOrder() {
		return sortOrder;
	}

	public void setSortOrder(LidoSortOrder sortOrder) {
		this.sortOrder = sortOrder;
	}
}