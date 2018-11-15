package ro.webdata.lido.parser.core.set.subjectSet;

import org.w3c.dom.Node;

public interface SubjectSetDAO {
	/**
	 *
	 * @param node <b>lido:subjectSet</b> node type.
	 * @return <b>SubjectSet</b>
	 */
	SubjectSet getSubjectSet(Node node);
}
