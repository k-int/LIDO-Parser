package app.java.parser.dao.element.wrap;

import app.java.parser.model.element.wrap.SubjectWrap;
import org.w3c.dom.Node;

public interface SubjectWrapDAO {
	/**
	 *
	 * @param node <b>lido:subjectWrap</b> node type.
	 * @return <b>SubjectWrap</b>
	 */
	SubjectWrap getSubjectWrap(Node node);
}
