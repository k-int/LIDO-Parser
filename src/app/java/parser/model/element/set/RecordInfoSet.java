package app.java.parser.model.element.set;

import app.java.parser.model.complex.RecordInfoSetComplexType;

/**
 * <link rel="stylesheet" type="text/css" href="../../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 		<div class="lido-doc">
 * 			<b>Definition:</b> Wrapper for metadata information about this record.
 * 		</div>
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class RecordInfoSet extends RecordInfoSetComplexType {
	public RecordInfoSet() {}

	public RecordInfoSet(RecordInfoSetComplexType recordInfoSetComplexType) {
		super(
			recordInfoSetComplexType.getRecordInfoID(),
			recordInfoSetComplexType.getRecordInfoLink(),
			recordInfoSetComplexType.getRecordMetadataDate(),
			recordInfoSetComplexType.getType()
		);
	}
}
