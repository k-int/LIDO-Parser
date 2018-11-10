package app.java.parser.model.element.leaf.materials;

import app.java.parser.model.complex.TextComplexType;

/**<link rel="stylesheet" type="text/css" href="../../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 	<div class="lido-doc">
 * 		<b>Definition:</b> Display element for materials/technique, corresponding to the following
 * 		materialsTech element.<br/>
 * 		<b>How to record:</b> It is presented in a syntax suitable for display to the end-user and
 * 		including any necessary indications of uncertainty, ambiguity, and nuance.Repeat this element
 * 		only for language variants.
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class DisplayMaterialsTech extends TextComplexType {
	public DisplayMaterialsTech() {}

	public DisplayMaterialsTech(TextComplexType textComplexType) {
		super(
			textComplexType.getText(),
			textComplexType.getLang(),
			textComplexType.getEncodingAnalog(),
			textComplexType.getLabel()
		);
	}
}
