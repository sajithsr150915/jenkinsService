package com.jenkins.model;

import java.util.List;

public class QueueList {
	
	
	private String _class;
	
	private List<DiscoverableItems> discoverableItems;
	
	private List<Items> items;

	public String get_class() {
		return _class;
	}

	public void set_class(String _class) {
		this._class = _class;
	}

	public List<DiscoverableItems> getDiscoverableItems() {
		return discoverableItems;
	}

	public void setDiscoverableItems(List<DiscoverableItems> discoverableItems) {
		this.discoverableItems = discoverableItems;
	}

	public List<Items> getItems() {
		return items;
	}

	public void setItems(List<Items> items) {
		this.items = items;
	}
		
	
}
