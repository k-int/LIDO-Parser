package app.java.parser.model.element.leaf.subject;

import app.java.parser.model.complex.subject.SubjectComplexType;

/**
 * <link rel="stylesheet" type="text/css" href="../../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 		<div class="lido-doc">
 * 			<b>Definition:</b> Contains sub-elements for a structured subject description.
 * 			These identify, describe, and/or interpret what is depicted in and by an object
 * 			/ work or what it is about.
 * 		</div>
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class Subject extends SubjectComplexType {
	public Subject() {}

	public Subject(SubjectComplexType subjectComplexType) {
		super(
			subjectComplexType.getExtentSubject(),
			subjectComplexType.getSubjectConcept(),
			subjectComplexType.getSubjectActor(),
			subjectComplexType.getSubjectDate(),
			subjectComplexType.getSubjectEvent(),
			subjectComplexType.getSubjectPlace(),
			subjectComplexType.getSubjectObject(),
			subjectComplexType.getType()
		);
	}
}
