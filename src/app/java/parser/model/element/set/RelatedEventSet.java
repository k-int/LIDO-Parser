package app.java.parser.model.element.set;

import app.java.parser.model.attribute.lido.LidoSortOrder;
import app.java.parser.model.complex.event.RelatedEventSetComplexType;

/**<link rel="stylesheet" type="text/css" href="../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 	<div class="lido-doc">
 * 		<b>Definition:</b> References an event which is linked in some way to this event, e.g. a field trip
 * 		within which this object was collected.<br/>
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
public class RelatedEventSet extends RelatedEventSetComplexType {
	private LidoSortOrder sortOrder;

	public RelatedEventSet() {}

	public RelatedEventSet(RelatedEventSetComplexType relatedEventSetComplexType, LidoSortOrder sortOrder) {
		super(
			relatedEventSetComplexType.getRelatedEvent(),
			relatedEventSetComplexType.getRelatedEventRelType()
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
