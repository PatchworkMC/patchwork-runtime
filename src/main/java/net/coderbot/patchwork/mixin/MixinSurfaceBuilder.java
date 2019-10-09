package net.coderbot.patchwork.mixin;

import net.minecraft.util.Identifier;
import net.minecraft.world.gen.surfacebuilder.SurfaceBuilder;
import net.minecraftforge.registries.IForgeRegistryEntry;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(SurfaceBuilder.class)
public class MixinSurfaceBuilder implements IForgeRegistryEntry<SurfaceBuilder> {
	private Identifier registryName;

	@Override
	public IForgeRegistryEntry setRegistryName(Identifier name) {
		this.registryName = name;

		return this;
	}

	public Identifier getRegistryName() {
		return registryName;
	}

	public Class<SurfaceBuilder> getRegistryType() {
		return SurfaceBuilder.class;
	}
}
