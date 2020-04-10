package com.jenkins.model;

import java.util.ArrayList;
import java.util.List;

public class WorkFlow {
	
	 private Links _links;
	 private String id;
	 private String name;
	 private String status;
	 private long startTimeMillis;
	 private long endTimeMillis;
	 private long durationMillis;
	 private long queueDurationMillis;
	 private long pauseDurationMillis;
	 private List <Stage> stages = new ArrayList <Stage> ();
	 
	public Links get_links() {
		return _links;
	}
	public void set_links(Links _links) {
		this._links = _links;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public long getStartTimeMillis() {
		return startTimeMillis;
	}
	public void setStartTimeMillis(long startTimeMillis) {
		this.startTimeMillis = startTimeMillis;
	}
	public long getEndTimeMillis() {
		return endTimeMillis;
	}
	public void setEndTimeMillis(long endTimeMillis) {
		this.endTimeMillis = endTimeMillis;
	}
	public long getDurationMillis() {
		return durationMillis;
	}
	public void setDurationMillis(long durationMillis) {
		this.durationMillis = durationMillis;
	}
	public long getQueueDurationMillis() {
		return queueDurationMillis;
	}
	public void setQueueDurationMillis(long queueDurationMillis) {
		this.queueDurationMillis = queueDurationMillis;
	}
	public long getPauseDurationMillis() {
		return pauseDurationMillis;
	}
	public void setPauseDurationMillis(long pauseDurationMillis) {
		this.pauseDurationMillis = pauseDurationMillis;
	}
	public List<Stage> getStages() {
		return stages;
	}
	public void setStages(List<Stage> stages) {
		this.stages = stages;
	}
	

	 
}


	
	
	
	
	

	



