package ro.webdata.lido.parser.core.set.relatedWorkSet;

import ro.webdata.lido.parser.core.attribute.LidoSortOrder;
import ro.webdata.lido.parser.core.complex.relatedWorkSetComplexType.RelatedWorkSetComplexType;

/**
 * <link rel="stylesheet" type="text/css" href="../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 		<div class="lido-doc">
 * 			<b>Definition:</b> A wrapper for a object / work, group, collection, or series
 * 			that is directly related to the object / work being recorded.<br/>
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
public class RelatedWorkSet extends RelatedWorkSetComplexType {
	private LidoSortOrder sortOrder;

	public RelatedWorkSet() {}

	public RelatedWorkSet(RelatedWorkSetComplexType relatedWorkSetComplexType, LidoSortOrder sortOrder) {
		super(
			relatedWorkSetComplexType.getRelatedWork(),
			relatedWorkSetComplexType.getRelatedWorkRelType()
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
