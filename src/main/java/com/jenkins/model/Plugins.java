package com.jenkins.model;

import java.util.List;

public class Plugins {

	private boolean active;
	
	private String backupVersion;
	
	private boolean bundled;
	
	private boolean deleted;
	
	private List<Dependencies> dependencies;
	
	private boolean detached;
	
	private boolean downgradable;
	
	private boolean enabled;
	
	private boolean hasUpdate;
	
	private String longName;
	
	private String minimumJavaVersion;
	
	private boolean pinned;
	
	private String requiredCoreVersion;
	
	private String shortName;
	
	private String url;
	
	private String version;

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getBackupVersion() {
		return backupVersion;
	}

	public void setBackupVersion(String backupVersion) {
		this.backupVersion = backupVersion;
	}

	public boolean isBundled() {
		return bundled;
	}

	public void setBundled(boolean bundled) {
		this.bundled = bundled;
	}

	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

	public List<Dependencies> getDependencies() {
		return dependencies;
	}

	public void setDependencies(List<Dependencies> dependencies) {
		this.dependencies = dependencies;
	}

	public boolean isDetached() {
		return detached;
	}

	public void setDetached(boolean detached) {
		this.detached = detached;
	}

	public boolean isDowngradable() {
		return downgradable;
	}

	public void setDowngradable(boolean downgradable) {
		this.downgradable = downgradable;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public boolean isHasUpdate() {
		return hasUpdate;
	}

	public void setHasUpdate(boolean hasUpdate) {
		this.hasUpdate = hasUpdate;
	}

	public String getLongName() {
		return longName;
	}

	public void setLongName(String longName) {
		this.longName = longName;
	}

	public String getMinimumJavaVersion() {
		return minimumJavaVersion;
	}

	public void setMinimumJavaVersion(String minimumJavaVersion) {
		this.minimumJavaVersion = minimumJavaVersion;
	}

	public boolean isPinned() {
		return pinned;
	}

	public void setPinned(boolean pinned) {
		this.pinned = pinned;
	}

	public String getRequiredCoreVersion() {
		return requiredCoreVersion;
	}

	public void setRequiredCoreVersion(String requiredCoreVersion) {
		this.requiredCoreVersion = requiredCoreVersion;
	}

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}
	
	
	

}
