package app.java.parser.model.element.set;

import app.java.parser.model.attribute.lido.LidoSortOrder;
import app.java.parser.model.complex.RightsComplexType;

/**<link rel="stylesheet" type="text/css" href="../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 	<div class="lido-doc">
 * 		<b>Definition:</b> Information about rights management; may include copyright
 * 		and other intellectual property statements about the object / work.<br/>
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
public class RightsWorkSet extends RightsComplexType {
	private LidoSortOrder sortOrder;

	public RightsWorkSet() {}

	public RightsWorkSet(RightsComplexType rightsComplexType, LidoSortOrder sortOrder) {
		super(
			rightsComplexType.getRightsType(),
			rightsComplexType.getRightsDate(),
			rightsComplexType.getRightsHolder(),
			rightsComplexType.getCreditLine()
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
