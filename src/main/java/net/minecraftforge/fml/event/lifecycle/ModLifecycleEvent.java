package net.minecraftforge.fml.event.lifecycle;

import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.fml.ModContainer;

public class ModLifecycleEvent extends Event {
	private final ModContainer container;

	// For EventBus
	public ModLifecycleEvent() {
		this(null);

		this.description();
	}

	public ModLifecycleEvent(ModContainer container) {
		this.container = container;
	}

	public final String description() {
		String cn = getClass().getName();
		return cn.substring(cn.lastIndexOf('.') + 1);
	}

	/*public Stream<InterModComms.IMCMessage> getIMCStream() {
		return InterModComms.getMessages(this.container.getModId());
	}

	public Stream<InterModComms.IMCMessage> getIMCStream(Predicate<String> methodFilter) {
		return InterModComms.getMessages(this.container.getModId(), methodFilter);
	}*/

	@Override
	public String toString() {
		return description();
	}
}
