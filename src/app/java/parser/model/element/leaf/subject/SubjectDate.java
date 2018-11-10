package app.java.parser.model.element.leaf.subject;

import app.java.parser.model.attribute.lido.LidoSortOrder;
import app.java.parser.model.complex.date.DateSetComplexType;

/**
 * <link rel="stylesheet" type="text/css" href="../../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 		<div class="lido-doc">
 * 			<b>Definition:</b> A time specification depicted in or by an object / work,
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
public class SubjectDate extends DateSetComplexType {
	private LidoSortOrder sortOrder;

	public SubjectDate() {}

	public SubjectDate(DateSetComplexType dateSetComplexType, LidoSortOrder sortOrder) {
		super(
			dateSetComplexType.getDisplayDate(),
			dateSetComplexType.getDate()
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
