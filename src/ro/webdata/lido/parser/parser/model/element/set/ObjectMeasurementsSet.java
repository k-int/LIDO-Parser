package ro.webdata.lido.parser.parser.model.element.set;

import ro.webdata.lido.parser.parser.model.attribute.lido.LidoSortOrder;
import ro.webdata.lido.parser.parser.model.complex.object.ObjectMeasurementsSetComplexType;

/**<link rel="stylesheet" type="text/css" href="../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 	<div class="lido-doc">
 * 		<b>Definition:</b> Wrapper for display and index elements for object / work measurements.<br/>
 * 		<b>How to record:</b> If multiple parts of the object / work are measured repeat this element.<br/>
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
public class ObjectMeasurementsSet extends ObjectMeasurementsSetComplexType {
	private LidoSortOrder sortOrder;

	public ObjectMeasurementsSet() {}

	public ObjectMeasurementsSet(ObjectMeasurementsSetComplexType objectMeasurements, LidoSortOrder sortOrder) {
		super(
			objectMeasurements.getDisplayObjectMeasurements(),
			objectMeasurements.getObjectMeasurements()
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
