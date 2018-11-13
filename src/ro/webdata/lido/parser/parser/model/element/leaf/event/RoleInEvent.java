package ro.webdata.lido.parser.parser.model.element.leaf.event;

import ro.webdata.lido.parser.parser.model.complex.ConceptComplexType;

/**
 * <link rel="stylesheet" type="text/css" href="../../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 		<div class="lido-doc">
 * 			<b>Definition:</b> The role played within this event by the described entity.<br/>
 * 			<b>How to record:</b> Preferably taken from a published controlled vocabulary.
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class RoleInEvent extends ConceptComplexType {
	public RoleInEvent() {}

	public RoleInEvent(ConceptComplexType conceptComplexType) {
		super(
			conceptComplexType.getConceptID(),
			conceptComplexType.getTerm()
		);
	}
}
