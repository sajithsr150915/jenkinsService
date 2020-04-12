package com.jenkins.model;

import java.util.List;

public class QueueList {
	
	
	private String _class;
	
	private List<DiscoverableItems> discoverableItems;
	
	private List<Item> items;

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

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}
		
	
}
