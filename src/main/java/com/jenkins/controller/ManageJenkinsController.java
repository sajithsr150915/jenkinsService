
package com.jenkins.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jenkins.model.BuildInfo;
import com.jenkins.model.JobDetails;
import com.jenkins.service.ManageJenkinsService;


@RestController
@RequestMapping("/manageJenkins")
public class ManageJenkinsController {
	
	@Autowired(required=true)
	ManageJenkinsService manageJenkinsService;
	
	
	@GetMapping("/testlastSucessfulbuild")
    public String  jenkinsDetails() 
    {		
		
		return "";
    }
	
	
	/**
	 * Method for getting the details of the last completed build of a job
	 * by passing the jobName
	 * @param jobName
	 * @return BuildInfo
	 */
	@GetMapping("/lastCompletedBuild/{jobName}")
	public BuildInfo lastCompletedBuild(@PathVariable("jobName") String jobName) {

		BuildInfo buildInfo = manageJenkinsService.lastCompletedBuild(jobName);		
		return buildInfo;
	}
	
	
	@GetMapping("/detailsOfJob/{jobName}")
	public JobDetails detailsOfJob(@PathVariable("jobName") String jobName) {

		JobDetails jobDetails = manageJenkinsService.detailsOfJob(jobName);

		return jobDetails;
	}
	
	
	
	
	
}