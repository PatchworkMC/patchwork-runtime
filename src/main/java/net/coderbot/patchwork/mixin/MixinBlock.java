package net.coderbot.patchwork.mixin;

import net.minecraft.block.Block;
import net.minecraft.util.Identifier;
import net.minecraftforge.registries.IForgeRegistryEntry;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(Block.class)
public class MixinBlock implements IForgeRegistryEntry<Block> {
	private Identifier registryName;

	@Override
	public IForgeRegistryEntry setRegistryName(Identifier name) {
		this.registryName = name;

		return this;
	}

	public Identifier getRegistryName() {
		return registryName;
	}

	public Class<Block> getRegistryType() {
		return Block.class;
	}
}
