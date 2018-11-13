package ro.webdata.lido.parser.parser.model.element.leaf.event;

import ro.webdata.lido.parser.parser.model.attribute.lido.LidoSortOrder;
import ro.webdata.lido.parser.parser.model.attribute.lido.LidoType;
import ro.webdata.lido.parser.parser.model.complex.place.PlaceSetComplexType;

/**
 * <link rel="stylesheet" type="text/css" href="../../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 		<div class="lido-doc">
 * 			<b>Definition:</b> Place specification of the event.<br/>
 *
 * 			<b>Attributes:</b>
 * 			<div class="lido-attr">
 * 				<b>type (lido:type)</b>
 * 				<div class="lido-attr-doc">
 * 					<b>How to record:</b> Data values may be: moveFrom, moveTo, alternative.
 * 				</div>
 * 				<b>sortOrder (lido:sortorder)</b>
 * 			</div>
 * 		</div>
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class EventPlace extends PlaceSetComplexType {
	private LidoType type;
	private LidoSortOrder sortOrder;

	public EventPlace() {}

	public EventPlace(PlaceSetComplexType placeSetComplexType, LidoType type, LidoSortOrder sortOrder) {
		super(
			placeSetComplexType.getDisplayPlace(),
			placeSetComplexType.getPlace()
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
