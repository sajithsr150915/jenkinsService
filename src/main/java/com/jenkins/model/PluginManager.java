package com.jenkins.model;

import java.util.List;

public class PluginManager {

	private String _class;
	
	private List<Plugins> plugins;

	public String get_class() {
		return _class;
	}

	public void set_class(String _class) {
		this._class = _class;
	}

	public List<Plugins> getPlugins() {
		return plugins;
	}

	public void setPlugins(List<Plugins> plugins) {
		this.plugins = plugins;
	}
	
	
	
}
