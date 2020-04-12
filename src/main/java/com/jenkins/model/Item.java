package com.jenkins.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Item {
	
	private String _class;
	private List<Action> actions;

	public boolean blocked;

	public boolean buildable;

	public int id;

	public long inQueueSince;

	//public Map<String, String> params=new HashMap<String,String>();

	public boolean stuck;

	public Task task;

	public String url;

	public String why;

	public long buildableStartMilliseconds;

	public boolean cancelled;

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

	public boolean isBlocked() {
		return blocked;
	}

	public void setBlocked(boolean blocked) {
		this.blocked = blocked;
	}

	public boolean isBuildable() {
		return buildable;
	}

	public void setBuildable(boolean buildable) {
		this.buildable = buildable;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getInQueueSince() {
		return inQueueSince;
	}

	public void setInQueueSince(long inQueueSince) {
		this.inQueueSince = inQueueSince;
	}

	/*public Map<String, String> getParams() {
		return params;
	}

	public void setParams(Map<String, String> params) {
		this.params = params;
	}*/

	public boolean isStuck() {
		return stuck;
	}

	public void setStuck(boolean stuck) {
		this.stuck = stuck;
	}

	public Task getTask() {
		return task;
	}

	public void setTask(Task task) {
		this.task = task;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getWhy() {
		return why;
	}

	public void setWhy(String why) {
		this.why = why;
	}

	public long getBuildableStartMilliseconds() {
		return buildableStartMilliseconds;
	}

	public void setBuildableStartMilliseconds(long buildableStartMilliseconds) {
		this.buildableStartMilliseconds = buildableStartMilliseconds;
	}

	public boolean isCancelled() {
		return cancelled;
	}

	public void setCancelled(boolean cancelled) {
		this.cancelled = cancelled;
	}

	

}
