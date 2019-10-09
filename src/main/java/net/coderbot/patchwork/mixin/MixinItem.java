package net.coderbot.patchwork.mixin;

import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraftforge.registries.IForgeRegistryEntry;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(Item.class)
public class MixinItem implements IForgeRegistryEntry<Item> {
	private Identifier registryName;

	@Override
	public IForgeRegistryEntry setRegistryName(Identifier name) {
		this.registryName = name;

		return this;
	}

	public Identifier getRegistryName() {
		return registryName;
	}

	public Class<Item> getRegistryType() {
		return Item.class;
	}
}
