package ro.webdata.lido.parser.parser.model.element.leaf.materials;

import ro.webdata.lido.parser.parser.model.complex.TextComplexType;

/**<link rel="stylesheet" type="text/css" href="../../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 	<div class="lido-doc">
 * 		<b>Definition:</b> The source of the information about materials and technique,
 * 		often used when citing a published source of watermarks.
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class SourceMaterialsTech extends TextComplexType {
	public SourceMaterialsTech() {}

	public SourceMaterialsTech(TextComplexType textComplexType) {
		super(
			textComplexType.getText(),
			textComplexType.getLang(),
			textComplexType.getEncodingAnalog(),
			textComplexType.getLabel()
		);
	}
}