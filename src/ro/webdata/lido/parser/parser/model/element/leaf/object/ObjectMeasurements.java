package ro.webdata.lido.parser.parser.model.element.leaf.object;

import ro.webdata.lido.parser.parser.model.complex.object.ObjectMeasurementsComplexType;

/**
 * <link rel="stylesheet" type="text/css" href="../../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 		<div class="lido-doc">
 * 			<b>Definition:</b> Structured measurement information about the dimensions, size,
 * 			or scale of the object / work.<br/>
 * 			<b>Notes:</b> It may also include the parts of a complex object / work, series,
 * 			or collection.
 * 		</div>
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class ObjectMeasurements extends ObjectMeasurementsComplexType {
	public ObjectMeasurements() {}

	public ObjectMeasurements(ObjectMeasurementsComplexType objectMeasurementsComplexType) {
		super(
			objectMeasurementsComplexType.getMeasurementsSet(),
			objectMeasurementsComplexType.getExtentMeasurements(),
			objectMeasurementsComplexType.getQualifierMeasurements(),
			objectMeasurementsComplexType.getFormatMeasurements(),
			objectMeasurementsComplexType.getShapeMeasurements(),
			objectMeasurementsComplexType.getScaleMeasurements()
		);
	}
}
