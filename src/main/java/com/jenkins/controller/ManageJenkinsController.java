
package com.jenkins.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jenkins.model.BuildInfo;
import com.jenkins.model.Item;
import com.jenkins.model.JenkinsDetails;
import com.jenkins.model.JobDetails;
import com.jenkins.model.JobSpecificDetails;
import com.jenkins.model.LastBuild;
import com.jenkins.model.OverallLoad;
import com.jenkins.model.PipelineNode;
import com.jenkins.model.PluginManager;
import com.jenkins.model.QueueList;
import com.jenkins.model.WorkFlow;
import com.jenkins.service.ManageJenkinsService;


@RestController
@RequestMapping("/manageJenkins")
public class ManageJenkinsController {
	
	@Autowired(required=true)
	ManageJenkinsService manageJenkinsService;
	
	
	
	
	
	/**
	 * Method for getting the details of the last completed build of the job
	 * by passing the jobName
	 * @param jobName
	 * @return BuildInfo
	 */
	@GetMapping("/lastCompletedBuild/{jobName}")
	public BuildInfo lastCompletedBuild(@PathVariable("jobName") String jobName) {

		BuildInfo buildInfo = manageJenkinsService.lastCompletedBuild(jobName);		
		return buildInfo;
	}
	
	
	/** Method for getting the details of the job
	 * @param jobName
	 * @return JobDetails
	 */
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
	
	/** Getting the details of the items in queue
	 * @return QueueList
	 */
	@GetMapping("/queueList")
	public QueueList queueList() {
		QueueList queueList = manageJenkinsService.queueList();
		return queueList;
	}	
	
	

	/**Method for getting job name and status of the jobs
	 * @return JobSpecificDetails
	 */
	@GetMapping("/jenkinsJobNameandStatus")
	public JobSpecificDetails jenkinsJobNameandStatus() {

		JobSpecificDetails jobSpecificDetails= manageJenkinsService.jenkinsJobNameColor();
		return jobSpecificDetails;
	}
	
	
	
	/**Method for getting last build specific details of a job
	 * @param jobName
	 * @return LastBuild
	 */
	@GetMapping("/lastBuildSpecificDetails/{jobName}")
	public LastBuild lastBuildSpeci(@PathVariable("jobName") String jobName) {

		LastBuild lastBuild = manageJenkinsService.lastBuildSpecificDetails(jobName);
		return lastBuild; 
	}
	
	/**Method for getting workflow details
	 * @param jobName
	 * @param buildNo
	 * @return WorkFlow
	 */
	@GetMapping("/workflowAPI/{jobName}/{buildNo}")
	public WorkFlow workflowAPI(@PathVariable("jobName") String jobName,@PathVariable("buildNo") String buildNo) {

		WorkFlow wrkFlow = manageJenkinsService.workflowAPI(jobName, buildNo);

		return wrkFlow;
	}
	
	
	/**Method for getting jenkins Details
	 * @return JenkinsDetails
	 */
	@GetMapping("/jenkinsDetails")
    public JenkinsDetails  jenkinsDetails() 
    {
		
		
		JenkinsDetails jenkinsDetails= manageJenkinsService.jenkinsGetAPI();
		
		return jenkinsDetails;
    }
	
	/**Methof for getting plugin details
	 * @return PluginManager
	 */
	@GetMapping("/pluginManager")
	public PluginManager pluginManager() {
		PluginManager pluginManager = manageJenkinsService.pluginManager();		
		return pluginManager;
	}
	
	
	/**
	 * Method for getting the details of the queue item
	 * by passing the item itemNo
	 * @param jobName
	 * @return Item
	 */
	@GetMapping("/queueItem/{itemNo}")
	public Item queueItem(@PathVariable("itemNo") String itemNo) {

		Item item = manageJenkinsService.queueItem(itemNo);
		
		return item;
	}
	
	
	/**
	 * Method for getting the details of the overallLoad
	 * @return OverallLoad
	 */
	@GetMapping("/overallLoad")
	public OverallLoad overallLoad() {

		OverallLoad overallLoad = manageJenkinsService.overallLoad();
		
		return overallLoad;
	}
	
	
	/**Method for getting configuration xml of a job
	 * @param jobName
	 * @return String
	 */
	@GetMapping("/configXML/{jobName}")
	public String configXML(@PathVariable("jobName") String jobName) {

		String value = manageJenkinsService.configXML(jobName);

		return value;
	}
	
	
	/**Method for the getting job description of a job
	 * @param jobName
	 * @return String
	 */
	@GetMapping("/jobDescription/{jobName}")
	public String jobDescription(@PathVariable("jobName") String jobName) {

		String value = manageJenkinsService.jobDescription(jobName);

		return value;
	}
	
	

	/**
	 * Method for getting the details of the log of last build of a job
	 * by passing the jobName
	 * @param jobName
	 * @return String
	 */
	@GetMapping("/lastBuildLog/{jobName}")
	public String lastBuildLog(@PathVariable("jobName") String jobName) {

		String value = manageJenkinsService.lastBuildLogText(jobName);
		
		return value;
	}
	

	/** Method for build information of the build of a job
	 * @param jobName
	 * @param buildNo
	 * @return BuildInfo
	 */
	@GetMapping("/buildDetailOfJob/{jobName}/{buildNo}")
	public BuildInfo buildDetailOfJob(@PathVariable("jobName") String jobName,@PathVariable("buildNo") String buildNo) {

		BuildInfo buildInfo = manageJenkinsService.buildDetailOfJob(jobName,buildNo);

		return buildInfo;
	}
	
	

}