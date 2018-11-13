package ro.webdata.lido.parser.parser.model.element.leaf.place;

import ro.webdata.lido.parser.parser.model.attribute.lido.LidoType;
import ro.webdata.lido.parser.parser.model.complex.ConceptComplexType;

/**
 * <link rel="stylesheet" type="text/css" href="../../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 		<div class="lido-doc">
 * 			<b>Definition:</b> A classification of the place, e.g. by geological
 * 			complex, stratigraphic unit or habitat type.<br/>
 *
 * 			<b>Attributes:</b>
 * 			<div class="lido-attr">
 * 				<b>type (lido:type)</b><br/>
 * 			</div>
 * 		</div>
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class PlaceClassification extends ConceptComplexType {
	private LidoType type;

	public PlaceClassification() {}

	public PlaceClassification(ConceptComplexType conceptComplexType, LidoType type) {
		super(
			conceptComplexType.getConceptID(),
			conceptComplexType.getTerm()
		);
		setType(type);
	}

	public LidoType getType() {
		return type;
	}

	public void setType(LidoType type) {
		this.type = type;
	}
}
