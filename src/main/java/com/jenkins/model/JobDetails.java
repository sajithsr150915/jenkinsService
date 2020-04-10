package com.jenkins.model;

import java.util.ArrayList;
import java.util.List;

// FreeStyleProject
public class JobDetails {
	
	 private String _class;
	 List<BuildDetail> builds = new ArrayList<BuildDetail>();
	public String get_class() {
		return _class;
	}
	public void set_class(String _class) {
		this._class = _class;
	}
	public List<BuildDetail> getBuilds() {
		return builds;
	}
	public void setBuilds(List<BuildDetail> builds) {
		this.builds = builds;
	}

	 
}

	




