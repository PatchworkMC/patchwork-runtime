package net.coderbot.patchwork.mixin;

import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.Feature;
import net.minecraftforge.registries.IForgeRegistryEntry;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(Feature.class)
public class MixinFeature implements IForgeRegistryEntry<Feature> {
	private Identifier registryName;

	@Override
	public IForgeRegistryEntry setRegistryName(Identifier name) {
		this.registryName = name;

		return this;
	}

	public Identifier getRegistryName() {
		return registryName;
	}

	public Class<Feature> getRegistryType() {
		return Feature.class;
	}
}
