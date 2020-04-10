package com.jenkins.model;

import java.util.List;

public class StageFlowNode {
	
	private String id;
	
	private String name;

	private String status;
	
	private String parameterDescription;

	private long startTimeMillis;

	private long durationMillis;

	private List<Long> parentNodes;
	

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
	
	public String getParameterDescription() {
		return parameterDescription;
	}

	public void setParameterDescription(String parameterDescription) {
		this.parameterDescription = parameterDescription;
	}	

	public long getStartTimeMillis() {
		return startTimeMillis;
	}

	public void setStartTimeMillis(long startTimeMillis) {
		this.startTimeMillis = startTimeMillis;
	}

	public long getDurationMillis() {
		return durationMillis;
	}

	public void setDurationMillis(long durationMillis) {
		this.durationMillis = durationMillis;
	}

	public List<Long> getParentNodes() {
		return parentNodes;
	}

	public void setParentNodes(List<Long> parentNodes) {
		this.parentNodes = parentNodes;
	}	

}
