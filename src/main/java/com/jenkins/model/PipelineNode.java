package com.jenkins.model;

import java.util.List;

public class PipelineNode {
	
	private String id;
	
	private String name;

    private String status;

    private long startTimeMillis;

    private long durationMillis;

    private List<StageFlowNode> stageFlowNodes;
    
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

	public long getDurationMillis() {
		return durationMillis;
	}

	public void setDurationMillis(long durationMillis) {
		this.durationMillis = durationMillis;
	}

	public List<StageFlowNode> getStageFlowNodes() {
		return stageFlowNodes;
	}

	public void setStageFlowNodes(List<StageFlowNode> stageFlowNodes) {
		this.stageFlowNodes = stageFlowNodes;
	}    

}
