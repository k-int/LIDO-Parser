package ro.webdata.lido.parser.parser.model.element.set;

import ro.webdata.lido.parser.parser.model.complex.DescriptiveNoteComplexType;

/**<link rel="stylesheet" type="text/css" href="../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 	<div class="lido-doc">
 * 		<b>Definition:</b> Wrapper for a description of the event, including description
 * 		identifer, descriptive note of the event and its sources.<br/>
 * 		<b>How to record:</b> If there is more than one descriptive note, repeat this element.
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class EventDescriptionSet extends DescriptiveNoteComplexType {
	public EventDescriptionSet() {}

	public EventDescriptionSet(DescriptiveNoteComplexType descriptiveNoteComplexType) {
		super(
			descriptiveNoteComplexType.getDescriptiveNoteID(),
			descriptiveNoteComplexType.getDescriptiveNoteValue(),
			descriptiveNoteComplexType.getSourceDescriptiveNote(),
			descriptiveNoteComplexType.getType(),
			descriptiveNoteComplexType.getSortOrder()
		);
	}
}