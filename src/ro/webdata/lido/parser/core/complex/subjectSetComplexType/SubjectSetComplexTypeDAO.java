package ro.webdata.lido.parser.core.complex.subjectSetComplexType;

import org.w3c.dom.Node;

public interface SubjectSetComplexTypeDAO {
	/**
	 *
	 * @param node <b>lido:subjectSetComplexType</b> node type.
	 * @return <b>SubjectSetComplexType</b>
	 */
	SubjectSetComplexType getSubjectSetComplexType(Node node);
}
