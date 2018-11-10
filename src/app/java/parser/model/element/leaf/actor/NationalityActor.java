package app.java.parser.model.element.leaf.actor;

import app.java.parser.model.attribute.lido.LidoSortOrder;
import app.java.parser.model.complex.ConceptComplexType;

/**
 * <link rel="stylesheet" type="text/css" href="../../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 		<div class="lido-doc">
 * 			<b>Definition:</b> National or cultural affiliation of the person or corporate body.<br/>
 * 			<b>How to record:</b> Preferably taken from a published controlled vocabulary.<br/>
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
public class NationalityActor extends ConceptComplexType {
	private LidoSortOrder sortOrder;

	public NationalityActor() {}

	public NationalityActor(ConceptComplexType conceptComplexType, LidoSortOrder sortOrder) {
		super(
			conceptComplexType.getConceptID(),
			conceptComplexType.getTerm()
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
