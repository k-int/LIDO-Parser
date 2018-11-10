package app.java.parser.model.element.leaf.rights;

import app.java.parser.model.complex.date.DateComplexType;

/**
 * <link rel="stylesheet" type="text/css" href="../../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 		<div class="lido-doc">
 * 			<b>Definition:</b> The date on which a right is or was current.
 * 		</div>
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class RightsDate extends DateComplexType {
	public RightsDate() {}

	public RightsDate(DateComplexType dateComplexType) {
		super(
			dateComplexType.getEarliestDate(),
			dateComplexType.getLatestDate()
		);
	}
}
