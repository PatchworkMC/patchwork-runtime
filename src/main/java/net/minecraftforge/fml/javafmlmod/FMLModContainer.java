package net.minecraftforge.fml.javafmlmod;

import net.minecraftforge.eventbus.api.BusBuilder;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.IEventListener;

public class FMLModContainer {
	private final IEventBus eventBus;

	public FMLModContainer() {
		this.eventBus = BusBuilder.builder().setExceptionHandler(this::onEventFailed).setTrackPhases(false).build();
	}

	public FMLModContainer(IEventBus bus) {
		this.eventBus = bus;
	}

	public IEventBus getEventBus() {
		return eventBus;
	}

	private void onEventFailed(IEventBus iEventBus, Event event, IEventListener[] listeners, int i, Throwable throwable) {
		// TODO
	}
}
