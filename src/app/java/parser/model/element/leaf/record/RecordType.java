package app.java.parser.model.element.leaf.record;

import app.java.parser.model.complex.ConceptComplexType;

/**
 * <link rel="stylesheet" type="text/css" href="../../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 		<div class="lido-doc">
 * 			<b>Definition:</b> Term establishing whether the record represents an individual item
 * 			or a collection, series, or group of works.<br/>
 * 			<b>How to record:</b> Mandatory. Example values: item, collection, series, group, volume,
 * 			fonds. Preferably taken from a published controlled value list.
 * 		</div>
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class RecordType extends ConceptComplexType {
	public RecordType() {}

	public RecordType(ConceptComplexType conceptComplexType) {
		super(
			conceptComplexType.getConceptID(),
			conceptComplexType.getTerm()
		);
	}
}
