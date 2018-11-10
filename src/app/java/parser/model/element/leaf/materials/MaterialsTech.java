package app.java.parser.model.element.leaf.materials;

import app.java.parser.model.complex.materials.MaterialsTechComplexType;

/**<link rel="stylesheet" type="text/css" href="../../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 	<div class="lido-doc">
 * 		<b>Definition:</b> Materials and techniques data used for indexing.
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class MaterialsTech extends MaterialsTechComplexType {
	public MaterialsTech() {}

	public MaterialsTech(MaterialsTechComplexType materialsTechComplexType) {
		super(
			materialsTechComplexType.getTermMaterialsTech(),
			materialsTechComplexType.getExtentMaterialsTech(),
			materialsTechComplexType.getSourceMaterialsTech()
		);
	}
}
