package app.java.parser.dao.element.set;

import app.java.parser.model.element.set.SubjectSet;
import org.w3c.dom.Node;

public interface SubjectSetDAO {
	/**
	 *
	 * @param node <b>lido:subjectSet</b> node type.
	 * @return <b>SubjectSet</b>
	 */
	SubjectSet getSubjectSet(Node node);
}
