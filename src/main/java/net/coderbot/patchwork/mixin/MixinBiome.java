package net.coderbot.patchwork.mixin;

import net.minecraft.util.Identifier;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.registries.IForgeRegistryEntry;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(Biome.class)
public class MixinBiome implements IForgeRegistryEntry<Biome> {
	private Identifier registryName;

	@Override
	public IForgeRegistryEntry setRegistryName(Identifier name) {
		this.registryName = name;

		return this;
	}

	public Identifier getRegistryName() {
		return registryName;
	}

	public Class<Biome> getRegistryType() {
		return Biome.class;
	}
}
