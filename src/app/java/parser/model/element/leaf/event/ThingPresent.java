package app.java.parser.model.element.leaf.event;

import app.java.parser.model.attribute.lido.LidoSortOrder;
import app.java.parser.model.complex.object.ObjectSetComplexType;

/**
 * <link rel="stylesheet" type="text/css" href="../../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 		<div class="lido-doc">
 * 			<b>Definition:</b> References another object that was present at this same event.<br/>
 *
 * 			<b>Attributes:</b>
 * 			<div class="lido-attr">
 * 				<b>sortOrder (lido:sortorder)</b>
 * 			</div>
 * 		</div>
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class ThingPresent extends ObjectSetComplexType {
	private LidoSortOrder sortOrder;

	public ThingPresent() {}

	public ThingPresent(ObjectSetComplexType objectSetComplexType, LidoSortOrder sortOrder) {
		super(
			objectSetComplexType.getDisplayObject(),
			objectSetComplexType.getObject()
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
