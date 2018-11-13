package ro.webdata.lido.parser.parser.dao.element.wrap;

import ro.webdata.lido.parser.parser.model.element.wrap.SubjectWrap;
import org.w3c.dom.Node;

public interface SubjectWrapDAO {
	/**
	 *
	 * @param node <b>lido:subjectWrap</b> node type.
	 * @return <b>SubjectWrap</b>
	 */
	SubjectWrap getSubjectWrap(Node node);
}
