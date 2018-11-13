package ro.webdata.lido.parser.parser.model.element.leaf.subject;

import ro.webdata.lido.parser.parser.model.attribute.lido.LidoSortOrder;
import ro.webdata.lido.parser.parser.model.complex.object.ObjectSetComplexType;

/**
 * <link rel="stylesheet" type="text/css" href="../../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 		<div class="lido-doc">
 * 			<b>Definition:</b> An object - e.g. a building or a work of art depicted in or by an object / work,
 * 			or what it is about, provided as display and index elements.<br/>
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
public class SubjectObject extends ObjectSetComplexType {
	private LidoSortOrder sortOrder;

	public SubjectObject() {}

	public SubjectObject(ObjectSetComplexType objectSetComplexType, LidoSortOrder sortOrder) {
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
