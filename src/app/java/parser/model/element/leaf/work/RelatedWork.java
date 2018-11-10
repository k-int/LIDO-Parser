package app.java.parser.model.element.leaf.work;

import app.java.parser.model.complex.object.ObjectSetComplexType;

/**
 * <link rel="stylesheet" type="text/css" href="../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 		<div class="lido-doc">
 * 			<b>Definition:</b> Wrapper for the display and reference elements of a related object / work.
 * 		</div>
 * </div>
 * @author WebData
 *
 */
public class RelatedWork extends ObjectSetComplexType {
	public RelatedWork() {}

	public RelatedWork(ObjectSetComplexType objectSetComplexType) {
		super(
			objectSetComplexType.getDisplayObject(),
			objectSetComplexType.getObject()
		);
	}
}
