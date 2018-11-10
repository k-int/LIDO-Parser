package app.java.parser.model.element.leaf.rights;

import app.java.parser.model.attribute.lido.LidoSortOrder;
import app.java.parser.model.complex.LegalBodyRefComplexType;

/**<link rel="stylesheet" type="text/css" href="../../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 	<div class="lido-doc">
 * 		<b>Definition:</b> The holder of the right.<br/>
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
public class RightsHolder extends LegalBodyRefComplexType {
	private LidoSortOrder sortOrder;

	public RightsHolder() {}

	public RightsHolder(LidoSortOrder sortOrder) {
		setSortOrder(sortOrder);
	}

	public RightsHolder(LegalBodyRefComplexType legalBodyRefComplexType, LidoSortOrder sortOrder) {
		super(
			legalBodyRefComplexType.getLegalBodyID(),
			legalBodyRefComplexType.getLegalBodyName(),
			legalBodyRefComplexType.getLegalBodyWeblink()
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
