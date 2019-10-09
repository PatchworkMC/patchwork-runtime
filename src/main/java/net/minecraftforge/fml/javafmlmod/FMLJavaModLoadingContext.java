package net.minecraftforge.fml.javafmlmod;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;

public class FMLJavaModLoadingContext {
	private final FMLModContainer container;

	// TODO: This should be package private
	public FMLJavaModLoadingContext(FMLModContainer container) {
		this.container = container;
	}

	/**
	 * Helper to get the right instance from the {@link ModLoadingContext} correctly.
	 *
	 * @return The FMLJavaMod language specific extension from the ModLoadingContext
	 */
	public static FMLJavaModLoadingContext get() {
		return ModLoadingContext.get().extension();
	}

	/**
	 * @return The mod's event bus, to allow subscription to Mod specific events
	 */
	public IEventBus getModEventBus() {
		return container.getEventBus();
	}
}