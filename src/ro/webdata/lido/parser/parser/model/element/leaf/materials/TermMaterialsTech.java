package ro.webdata.lido.parser.parser.model.element.leaf.materials;

import ro.webdata.lido.parser.parser.model.attribute.lido.LidoSortOrder;
import ro.webdata.lido.parser.parser.model.attribute.lido.LidoType;
import ro.webdata.lido.parser.parser.model.complex.ConceptComplexType;

/**
 * <link rel="stylesheet" type="text/css" href="../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 		<div class="lido-doc">
 * 			<b>Definition:</b> A concept to index materials and/or technique.<br/>
 * 			<b>How to record:</b> Preferably taken from a published controlled vocabulary.<br/>
 *
 * 			<b>Attributes:</b>
 * 			<div class="lido-attr">
 * 				<b>type (lido:type)</b>
 * 				<div class="lido-attr-doc">
 * 					<b>How to record:</b> Example values: technique, material, implement, mark (e.g., 
 * 					watermark or other mark inherent in the material).
 * 				</div>
 * 				<b>sortOrder (lido:sortorder)</b>
 * 			</div>
 * 		</div>
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class TermMaterialsTech extends ConceptComplexType {
	private LidoType type;
	private LidoSortOrder sortOrder;

	public TermMaterialsTech() {}

	public TermMaterialsTech(ConceptComplexType conceptComplexType, LidoType type, LidoSortOrder sortOrder) {
		super(
			conceptComplexType.getConceptID(),
			conceptComplexType.getTerm()
		);
		setType(type);
		setSortOrder(sortOrder);
	}

	public LidoType getType() {
		return type;
	}

	public void setType(LidoType type) {
		this.type = type;
	}

	public LidoSortOrder getSortOrder() {
		return sortOrder;
	}

	public void setSortOrder(LidoSortOrder sortOrder) {
		this.sortOrder = sortOrder;
	}
}
