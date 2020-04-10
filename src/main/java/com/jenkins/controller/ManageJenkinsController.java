
package com.jenkins.controller;

import java.io.IOException;

import org.apache.http.auth.AuthenticationException;
import org.apache.http.client.ClientProtocolException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jenkins.model.BuildInfo;
import com.jenkins.model.JenkinsDetails;
import com.jenkins.model.JobDetails;
import com.jenkins.model.JobSpecificDetails;
import com.jenkins.model.LastBuild;
import com.jenkins.model.PipelineNode;
import com.jenkins.model.WorkFlow;
import com.jenkins.model.QueueList;
import com.jenkins.service.ManageJenkinsService;
import com.jenkins.model.PluginManager;


@RestController
@RequestMapping("/manageJenkins")
public class ManageJenkinsController {
	
	@Autowired(required=true)
	ManageJenkinsService manageJenkinsService;
	
	
	
	
	
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
	
	/**
	 * Method for getting the details of the last build of a job
	 * by passing the jobName
	 * @param jobName
	 * @return BuildInfo
	 */
	
	@GetMapping("/latestBuildOfJob/{jobName}")
	public BuildInfo latestBuildOfJob(@PathVariable("jobName") String jobName) {

		BuildInfo buildInfo = manageJenkinsService.latestBuildOfJob(jobName);
		return buildInfo;
	}
	
	/**
	 * Method for getting the details of the last Stable build of a Job
	 * passing the jobName
	 * @param jobName
	 * @return BuildInfo 
	 */
	@GetMapping("/lastStableBuild/{jobName}")
	public BuildInfo lastStableBuild(@PathVariable("jobName") String jobName) {

		BuildInfo buildInfo = manageJenkinsService.lastStableBuild(jobName);
		return buildInfo;
	}
	
	/**
	 * Method for getting the details of the last successful build of a job
	 * by passing the jobName
	 * @param jobName
	 * @return BuildInfo
	 */
	@GetMapping("/lastSuccessfulBuild/{jobName}")
	public BuildInfo lastSuccessfulBuild(@PathVariable("jobName") String jobName) {

		BuildInfo buildInfo = manageJenkinsService.lastSuccessfulBuild(jobName);
		return buildInfo;
	}
	
	/**
	 * Method for getting the details of the last failed build of a job
	 * by passing the jobName
	 * @param jobName
	 * @return BuildInfo
	 */
	@GetMapping("/lastFailedBuild/{jobName}")
	public BuildInfo lastFailedBuild(@PathVariable("jobName") String jobName) {

		BuildInfo buildInfo = manageJenkinsService.lastFailedBuild(jobName);
		return buildInfo;
	}
	
	/**
	 * Method for getting the details of a stage/node of a pipeline by passing the
	 * jobName/Pipeline name, build number and nodeId
	 * 
	 * @param jobName
	 * @return PipelineNode
	 */
	@GetMapping("/pipelineNode/{jobName}/{buildNo}/{nodeId}")
	public PipelineNode pipelineNode(@PathVariable("jobName") String jobName, @PathVariable("buildNo") String buildNo,
			@PathVariable("nodeId") String nodeId) {

		PipelineNode details = manageJenkinsService.pipelineNode(jobName, buildNo, nodeId);
		return details;
	}
	
	@GetMapping("/queueList")
	public QueueList queueList() {
		QueueList queueList = manageJenkinsService.queueList();
		return queueList;
	}	

	@GetMapping("/jenkinsJobNameandStatus")
	public JobSpecificDetails jenkinsJobNameandStatus() {

		JobSpecificDetails jobSpecificDetails= manageJenkinsService.jenkinsJobNameColor();
		return jobSpecificDetails;
	}
	
	
	
	@GetMapping("/lastBuildSpecificDetails/{jobName}")
	public LastBuild lastBuildSpeci(@PathVariable("jobName") String jobName) {

		LastBuild lastBuild = manageJenkinsService.lastBuildSpecificDetails(jobName);
		return lastBuild; 
	}
	
	@GetMapping("/workflowAPI/{jobName}/{buildNo}")
	public WorkFlow workflowAPI(@PathVariable("jobName") String jobName,@PathVariable("buildNo") String buildNo) {

		WorkFlow wrkFlow = manageJenkinsService.workflowAPI(jobName, buildNo);

		return wrkFlow;
	}
	
	
	@GetMapping("/jenkinsDetails")
    public JenkinsDetails  jenkinsDetails() 
    {
		
		
		JenkinsDetails jenkinsDetails= manageJenkinsService.jenkinsGetAPI();
		
		return jenkinsDetails;
    }
	
	@GetMapping("/pluginManager")
	public PluginManager pluginManager() {
		PluginManager pluginManager = manageJenkinsService.pluginManager();		
		return pluginManager;
	}
	

}