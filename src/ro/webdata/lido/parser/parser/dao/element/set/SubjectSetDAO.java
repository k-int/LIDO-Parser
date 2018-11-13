package ro.webdata.lido.parser.parser.dao.element.set;

import ro.webdata.lido.parser.parser.model.element.set.SubjectSet;
import org.w3c.dom.Node;

public interface SubjectSetDAO {
	/**
	 *
	 * @param node <b>lido:subjectSet</b> node type.
	 * @return <b>SubjectSet</b>
	 */
	SubjectSet getSubjectSet(Node node);
}
