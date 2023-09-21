package webdata.parser.xml.lido.core.leaf.periodName;

import ro.webdata.parser.xml.lido.core.attribute.LidoSortOrder;
import ro.webdata.parser.xml.lido.core.attribute.LidoType;
import ro.webdata.parser.xml.lido.core.complex.conceptComplexType.ConceptComplexType;

/**
 * <link rel="stylesheet" type="text/css" href="../../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 		<div class="lido-doc">
 * 			<b>Definition:</b> A period in which the event happened. <br/>
 * 			<b>How to record:</b> Preferably taken from a published controlled vocabulary.
 * 			Repeat this element only for indicating an earliest and latest period delimiting
 * 			the event.<br/>
 * 			<b>Notes:</b> Period concepts have delimiting character in time and space.<br/>
 *
 * 			<b>Attributes:</b>
 * 			<div class="lido-attr">
 * 				<b>sortOrder (lido:sortorder)</b><br/>
 * 				<b>type (lido:type)</b>
 * 				<div class="lido-attr-doc">
 * 					<b>How to record:</b> Data values may be: earliestPeriod, latestPeriod.
 * 				</div>
 * 			</div>
 * 		</div>
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class PeriodName extends ConceptComplexType {
	private LidoType type;
	private LidoSortOrder sortOrder;

	public PeriodName() {}

	public PeriodName(ConceptComplexType conceptComplexType, LidoType type, LidoSortOrder sortOrder) {
		super(
			conceptComplexType.getConceptID(),
			conceptComplexType.getTerm()
		);
		setType(type);
		setSortOrder(sortOrder);
	}

	public LidoType getType() {
		return type;
	}

	public void setType(LidoType type) {
		this.type = type;
	}

	public LidoSortOrder getSortOrder() {
		return sortOrder;
	}

	public void setSortOrder(LidoSortOrder sortOrder) {
		this.sortOrder = sortOrder;
	}
}
