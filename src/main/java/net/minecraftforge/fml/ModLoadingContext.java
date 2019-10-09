package net.minecraftforge.fml;

public class ModLoadingContext {
	private static ThreadLocal<ModLoadingContext> context = ThreadLocal.withInitial(ModLoadingContext::new);
	private String namespace = "minecraft";
	private Object languageExtension;

	public static ModLoadingContext get() {
		return context.get();
	}

	public void setActiveContainer(final Object languageExtension, final String namespace) {
		this.languageExtension = languageExtension;
		this.namespace = namespace;
	}

	public String getActiveNamespace() {
		return namespace;
	}

	@SuppressWarnings("unchecked")
	public <T> T extension() {
		return (T) languageExtension;
	}
}