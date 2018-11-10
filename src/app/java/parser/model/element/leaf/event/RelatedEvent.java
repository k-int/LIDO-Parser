package app.java.parser.model.element.leaf.event;

import app.java.parser.model.complex.event.EventSetComplexType;

/**
 * <link rel="stylesheet" type="text/css" href="../../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 		<div class="lido-doc">
 * 			<b>Definition:</b> Display and index elements for the event related to the event being recorded.
 * 		</div>
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class RelatedEvent extends EventSetComplexType {
	public RelatedEvent() {}

	public RelatedEvent(EventSetComplexType dventSetComplexType) {
		super(
			dventSetComplexType.getDisplayEvent(),
			dventSetComplexType.getEvent()
		);
	}
}
