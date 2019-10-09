package net.minecraftforge.fml.event.lifecycle;

import com.google.common.collect.ImmutableSet;

import java.io.File;
import java.util.Set;

/**
 * A special event used when the {@link Mod#certificateFingerprint()} doesn't match the certificate loaded from the JAR
 * file. You could use this to log a warning that the code that is running might not be yours, for example.
 *
 * TODO: Patchwork will never fire this event. All jars that pass through patchwork are modified sweepingly.
 */
public class FMLFingerprintViolationEvent extends ModLifecycleEvent {

	private final boolean isDirectory;
	private final Set<String> fingerprints;
	private final File source;
	private final String expectedFingerprint;

	public FMLFingerprintViolationEvent(boolean isDirectory, File source, ImmutableSet<String> fingerprints, String expectedFingerprint) {
		super(null);
		this.isDirectory = isDirectory;
		this.source = source;
		this.fingerprints = fingerprints;
		this.expectedFingerprint = expectedFingerprint;
	}

	public boolean isDirectory() {
		return isDirectory;
	}

	public Set<String> getFingerprints() {
		return fingerprints;
	}

	public File getSource() {
		return source;
	}

	public String getExpectedFingerprint() {
		return expectedFingerprint;
	}
}