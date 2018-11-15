package ro.webdata.lido.parser.core.wrap.subjectWrap;

import org.w3c.dom.Node;

public interface SubjectWrapDAO {
	/**
	 *
	 * @param node <b>lido:subjectWrap</b> node type.
	 * @return <b>SubjectWrap</b>
	 */
	SubjectWrap getSubjectWrap(Node node);
}
