package app.java.parser.model.element.leaf.repository;

import app.java.parser.model.complex.LegalBodyRefComplexType;

/**<link rel="stylesheet" type="text/css" href="../../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 	<div class="lido-doc">
 * 		<b>Definition:</b> Unambiguous identification, designation and weblink of the
 * 		institution of custody.
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class RepositoryName extends LegalBodyRefComplexType {
	public RepositoryName() {}

	public RepositoryName(LegalBodyRefComplexType legalBodyRefComplexType) {
		super(
			legalBodyRefComplexType.getLegalBodyID(),
			legalBodyRefComplexType.getLegalBodyName(),
			legalBodyRefComplexType.getLegalBodyWeblink()
		);
	}
}
