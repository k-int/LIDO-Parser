package ro.webdata.lido.parser.parser.model.element.leaf;

import ro.webdata.lido.parser.parser.model.complex.TermComplexType;

/**
 * <link rel="stylesheet" type="text/css" href="../../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 		<div class="lido-doc">
 * 			<b>Definition:</b> A name for the referred concept, used for indexing.
 * 		</div>
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class Term extends TermComplexType {
	public Term() {}

	public Term(TermComplexType termComplexType) {
		super(
			termComplexType.getText(),
			termComplexType.getPref(),
			termComplexType.getAddedSearchTerm(),
			termComplexType.getLang(),
			termComplexType.getEncodingAnalog(),
			termComplexType.getLabel()
		);
	}
}
