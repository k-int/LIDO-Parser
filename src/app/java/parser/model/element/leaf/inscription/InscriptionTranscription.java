package app.java.parser.model.element.leaf.inscription;

import app.java.parser.model.complex.TextComplexType;

/**
 * <link rel="stylesheet" type="text/css" href="../../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 		<div class="lido-doc">
 * 			<b>Definition:</b> Transcription of the inscription.<br/>
 * 			<b>How to record:</b> Repeat this element only for language variants.
 * 		</div>
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class InscriptionTranscription extends TextComplexType {
	public InscriptionTranscription() {}

	public InscriptionTranscription(TextComplexType textComplexType) {
		super(
			textComplexType.getText(),
			textComplexType.getLang(),
			textComplexType.getEncodingAnalog(),
			textComplexType.getLabel()
		);
	}
}
