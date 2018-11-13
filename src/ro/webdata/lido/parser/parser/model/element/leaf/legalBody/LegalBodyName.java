package ro.webdata.lido.parser.parser.model.element.leaf.legalBody;

import ro.webdata.lido.parser.parser.model.complex.AppellationComplexType;

/**
 * <link rel="stylesheet" type="text/css" href="../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 	<div class="lido-doc">
 * 		<b>Definition:</b> Appellation of the institution or person.
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class LegalBodyName extends AppellationComplexType {
	public LegalBodyName() {}

	public LegalBodyName(AppellationComplexType appellationComplexType) {
		super(
			appellationComplexType.getAppellationValue(),
			appellationComplexType.getSourceAppellation()
		);
	}
}
