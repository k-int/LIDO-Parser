package app.java.parser.model.element.leaf.event;

import app.java.parser.model.attribute.lido.LidoSortOrder;
import app.java.parser.model.complex.materials.MaterialsTechSetComplexType;

/**
 * <link rel="stylesheet" type="text/css" href="../../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 		<div class="lido-doc">
 * 			<b>Definition:</b> Indicates the substances or materials used within the event (e.g. the creation
 * 			of an object / work), as well as any implements, production or manufacturing techniques, processes,
 * 			or methods incorporated.<br/>
 * 			<b>How to record:</b> Will be used most often within a production event, but also others such as
 * 			excavation, restoration, etc.<br/>
 *
 * 			<b>Attributes:</b>
 * 			<div class="lido-attr">
 * 				<b>sortOrder (lido:sortorder)</b>
 * 			</div>
 * 		</div>
 * 	</div>
 * </div>
 * @author WebData
 *
 */
public class EventMaterialsTech extends MaterialsTechSetComplexType {
	private LidoSortOrder sortOrder;

	public EventMaterialsTech() {}

	public EventMaterialsTech(MaterialsTechSetComplexType materialsTechSetComplexType, LidoSortOrder sortOrder) {
		super(
			materialsTechSetComplexType.getDisplayMaterialsTech(),
			materialsTechSetComplexType.getMaterialsTech()
		);
		setSortOrder(sortOrder);
	}

	public LidoSortOrder getSortOrder() {
		return sortOrder;
	}

	public void setSortOrder(LidoSortOrder sortOrder) {
		this.sortOrder = sortOrder;
	}
}
