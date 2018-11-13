package ro.webdata.lido.parser.parser.model.element.leaf.record;

import ro.webdata.lido.parser.parser.model.complex.WebResourceComplexType;

/**
 * <link rel="stylesheet" type="text/css" href="../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 	<div class="lido-doc">
 * 		<b>Definition:</b> Link of the metadata, e.g., to the object data sheet
 * 		(not the same as link of the object).
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class RecordInfoLink extends WebResourceComplexType {
	public RecordInfoLink() {}

	public RecordInfoLink(WebResourceComplexType webResourceComplexType) {
		super(
			webResourceComplexType.getText(),
			webResourceComplexType.getPref(),
			webResourceComplexType.getFormatResource(),
			webResourceComplexType.getLang(),
			webResourceComplexType.getEncodingAnalog(),
			webResourceComplexType.getLabel()
		);
	}
}
