package com.jenkins.model;

public class LastBuild {
	
	 private String _class;
	 private long estimatedDuration;
	 private String result;
	 private long timestamp;
	 
	public String get_class() {
		return _class;
	}
	public void set_class(String _class) {
		this._class = _class;
	}
	public long getEstimatedDuration() {
		return estimatedDuration;
	}
	public void setEstimatedDuration(long estimatedDuration) {
		this.estimatedDuration = estimatedDuration;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public long getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}


	 
	}

