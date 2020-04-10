package com.jenkins.model;

import java.util.List;

public class Items {
	
	private String _class;
	
	private List<Action> actions;
	
	private long id;
	
	private long inQueueSince;
	

	public String get_class() {
		return _class;
	}

	public void set_class(String _class) {
		this._class = _class;
	}

	public List<Action> getActions() {
		return actions;
	}

	public void setActions(List<Action> actions) {
		this.actions = actions;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getInQueueSince() {
		return inQueueSince;
	}

	public void setInQueueSince(long inQueueSince) {
		this.inQueueSince = inQueueSince;
	}


	

}
