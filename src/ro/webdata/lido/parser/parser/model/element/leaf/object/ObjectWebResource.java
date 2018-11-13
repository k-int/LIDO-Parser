package ro.webdata.lido.parser.parser.model.element.leaf.object;

import ro.webdata.lido.parser.parser.model.complex.WebResourceComplexType;

/**
 * <link rel="stylesheet" type="text/css" href="../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 	<div class="lido-doc">
 * 		<b>Definition:</b> A URL-Reference to a description of the object / work
 * 		in the worldwide web environment.
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class ObjectWebResource extends WebResourceComplexType {
	public ObjectWebResource() {}

	public ObjectWebResource(WebResourceComplexType webResourceComplexType) {
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