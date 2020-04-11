package com.jenkins.model;

import java.util.ArrayList;
import java.util.List;

public class JenkinsDetails {
	 private String _class;
	 private List < AssignedLabel > assignedLabels = new ArrayList < AssignedLabel > ();
	 private String mode;
	 private String nodeDescription;
	 private String nodeName;
	 private int numExecutors;
	 private String description;
	 private List < Job > jobs = new ArrayList < Job > ();
	 private OverallLoad overallLoad;
	 private View primaryView;
	 private boolean quietingDown;
	 private int slaveAgentPort;
	 UnLabeledLoad UnlabeledLoad;
	 private String url;
	 private boolean useCrumbs;
	 private boolean useSecurity;
	 List < View > views = new ArrayList < View > ();
	public String get_class() {
		return _class;
	}
	public void set_class(String _class) {
		this._class = _class;
	}
	public List<AssignedLabel> getAssignedLabels() {
		return assignedLabels;
	}
	public void setAssignedLabels(List<AssignedLabel> assignedLabels) {
		this.assignedLabels = assignedLabels;
	}
	public String getMode() {
		return mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}
	public String getNodeDescription() {
		return nodeDescription;
	}
	public void setNodeDescription(String nodeDescription) {
		this.nodeDescription = nodeDescription;
	}
	public String getNodeName() {
		return nodeName;
	}
	public void setNodeName(String nodeName) {
		this.nodeName = nodeName;
	}
	public int getNumExecutors() {
		return numExecutors;
	}
	public void setNumExecutors(int numExecutors) {
		this.numExecutors = numExecutors;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<Job> getJobs() {
		return jobs;
	}
	public void setJobs(List<Job> jobs) {
		this.jobs = jobs;
	}
	public OverallLoad getOverallLoad() {
		return overallLoad;
	}
	public void setOverallLoad(OverallLoad overallLoad) {
		this.overallLoad = overallLoad;
	}
	public View getPrimaryView() {
		return primaryView;
	}
	public void setPrimaryView(View primaryView) {
		this.primaryView = primaryView;
	}
	public boolean isQuietingDown() {
		return quietingDown;
	}
	public void setQuietingDown(boolean quietingDown) {
		this.quietingDown = quietingDown;
	}
	public int getSlaveAgentPort() {
		return slaveAgentPort;
	}
	public void setSlaveAgentPort(int slaveAgentPort) {
		this.slaveAgentPort = slaveAgentPort;
	}
	public UnLabeledLoad getUnlabeledLoad() {
		return UnlabeledLoad;
	}
	public void setUnlabeledLoad(UnLabeledLoad unlabeledLoad) {
		UnlabeledLoad = unlabeledLoad;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public boolean isUseCrumbs() {
		return useCrumbs;
	}
	public void setUseCrumbs(boolean useCrumbs) {
		this.useCrumbs = useCrumbs;
	}
	public boolean isUseSecurity() {
		return useSecurity;
	}
	public void setUseSecurity(boolean useSecurity) {
		this.useSecurity = useSecurity;
	}
	public List<View> getViews() {
		return views;
	}
	public void setViews(List<View> views) {
		this.views = views;
	}


	
	}












