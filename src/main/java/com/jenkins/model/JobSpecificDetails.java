package com.jenkins.model;

import java.util.ArrayList;
import java.util.List;

public class JobSpecificDetails {

	private String _class;
	private List<JobSpecificDetail> jobs = new ArrayList<JobSpecificDetail>();

	public String get_class() {
		return _class;
	}

	public void set_class(String _class) {
		this._class = _class;
	}

	public List<JobSpecificDetail> getJobs() {
		return jobs;
	}

	public void setJobs(List<JobSpecificDetail> jobs) {
		this.jobs = jobs;
	}

}
