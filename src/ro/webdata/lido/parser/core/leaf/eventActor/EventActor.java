package ro.webdata.lido.parser.core.leaf.eventActor;

import ro.webdata.lido.parser.core.attribute.LidoSortOrder;
import ro.webdata.lido.parser.core.complex.actorInRoleSetComplexType.ActorInRoleSetComplexType;

/**
 * <link rel="stylesheet" type="text/css" href="../../../../../javadoc.css"/>
 * <div class="lido">
 * 	<div class="lido-title">Lido documentation:</div>
 * 		<div class="lido-doc">
 * 			<b>Definition:</b> Wrapper for display and index elements for an actor
 * 			with role information (participating or being present in the event).<br/>
 * 			<b>How to record:</b> For multiple actors repeat the element.<br/>
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
public class EventActor extends ActorInRoleSetComplexType {
	private LidoSortOrder sortOrder;

	public EventActor() {}

	public EventActor(ActorInRoleSetComplexType actorInRoleSetComplexType, LidoSortOrder sortOrder) {
		super(
			actorInRoleSetComplexType.getDisplayActorInRole(),
			actorInRoleSetComplexType.getActorInRole()
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
