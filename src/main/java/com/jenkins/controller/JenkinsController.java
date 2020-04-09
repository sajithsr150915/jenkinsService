
package com.jenkins.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.auth.AuthenticationException;
import org.apache.http.client.ClientProtocolException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jenkins.service.JenkinsService;


@RestController
public class JenkinsController {
	
	@Autowired(required=true)
	JenkinsService jenkinsService;
	
	
	@GetMapping("/testStatus")
    public String  testStatus() 
    {
		
		
		return "OK";
    }
	
	@GetMapping("/jenkinsDetails")
    public String  jenkinsDetails() 
    {
		
		
	String value= jenkinsService.jenkinsGetAPI();
		
		return value;
    }
	
	@GetMapping("/jenkinsJobNameandStatus")
    public String  jenkinsJobNameandStatus() 
    {
		
		
	String value= jenkinsService.jenkinsJobNameColor();
		
		return value;
    }

	

	@GetMapping("/latestBuildOfJob/{jobName}")
	public String latestBuildOfJob(@PathVariable("jobName") String jobName) {

		String value = jenkinsService.latestBuildOfJob(jobName);

		return value;
	}
	
	@GetMapping("/detailsOfJob/{jobName}")
	public String detailsOfJob(@PathVariable("jobName") String jobName) {

		String value = jenkinsService.detailsOfJob(jobName);

		return value;
	}
	

	@GetMapping("/lastBuildSpecificDetails/{jobName}")
	public String lastBuildSpecificDetails(@PathVariable("jobName") String jobName) {

		String value = jenkinsService.lastBuildSpecificDetails(jobName);

		return value;
	}
	

	@GetMapping("/buildDetailOfJob/{jobName}/{buildNo}")
	public String buildDetailOfJob(@PathVariable("jobName") String jobName,@PathVariable("buildNo") String buildNo) {

		String value = jenkinsService.buildDetailOfJob(jobName,buildNo);

		return value;
	}
	

	@GetMapping("/jobDescription/{jobName}")
	public String jobDescription(@PathVariable("jobName") String jobName) {

		String value = jenkinsService.jobDescription(jobName);

		return value;
	}
	
	
	@GetMapping("/configXML/{jobName}")
	public String configXML(@PathVariable("jobName") String jobName) {

		String value = jenkinsService.configXML(jobName);

		return value;
	}
	
	@GetMapping("/workflowAPI/{jobName}/{buildNo}")
	public String workflowAPI(@PathVariable("jobName") String jobName,@PathVariable("buildNo") String buildNo) {

		String value = jenkinsService.workflowAPI(jobName, buildNo);

		return value;
	}
	
	@GetMapping("/pipelineNode/{jobName}/{buildNo}/{nodeId}")
	public String pipelineNode(@PathVariable("jobName") String jobName,@PathVariable("buildNo") String buildNo, @PathVariable("nodeId") String nodeId) {

		String value = jenkinsService.pipelineNode(jobName, buildNo, nodeId);
		return value;
	}
	
	/**
	 * Method for getting the details of the last Stable build of a Job
	 * passing the jobName
	 * @param jobName
	 * @return String 
	 */
	@GetMapping("/lastStableBuild/{jobName}")
	public String lastStableBuild(@PathVariable("jobName") String jobName) {

		String value = jenkinsService.lastStableBuild(jobName);

		return value;
	}
	
	/**
	 * Method for getting the details of the last successful build of a job
	 * by passing the jobName
	 * @param jobName
	 * @return String
	 */
	@GetMapping("/lastSuccessfulBuild/{jobName}")
	public String lastSuccessfulBuild(@PathVariable("jobName") String jobName) {

		String value = jenkinsService.lastSuccessfulBuild(jobName);

		return value;
	}
	
	/**
	 * Method for getting the details of the last failed build of a job
	 * by passing the jobName
	 * @param jobName
	 * @return String
	 */
	@GetMapping("/lastFailedBuild/{jobName}")
	public String lastFailedBuild(@PathVariable("jobName") String jobName) {

		String value = jenkinsService.lastFailedBuild(jobName);

		return value;
	}
	
	/**
	 * Method for getting the details of the last completed build of a job
	 * by passing the jobName
	 * @param jobName
	 * @return String
	 */
	@GetMapping("/lastCompletedBuild/{jobName}")
	public String lastCompletedBuild(@PathVariable("jobName") String jobName) {

		String value = jenkinsService.lastCompletedBuild(jobName);
		
		return value;
	}
	

	/**
	 * Method for getting the details of the overallLoad
	 * @return String
	 */
	@GetMapping("/overallLoad")
	public String overallLoad() {

		String value = jenkinsService.overallLoad();
		
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

		String value = jenkinsService.lastBuildLogText(jobName);
		
		return value;
	}
		

	/**
	 * Method for getting the details of the manage plugins
	 * @return String
	 */
	@GetMapping("/pluginManager")
	public String pluginManager() {

		String value = jenkinsService.pluginManager();
		
		return value;
	}
	

	/**
	 * Method for getting the details of the queued items
	 * @return String
	 */
	@GetMapping("/queueList")
	public String queueList() {

		String value = jenkinsService.queueList();
		
		return value;
	}
	
	

	/**
	 * Method for getting the details of the queue item
	 * by passing the item itemNo
	 * @param jobName
	 * @return String
	 */
	@GetMapping("/queueItem/{itemNo}")
	public String queueItem(@PathVariable("itemNo") String itemNo) {

		String value = jenkinsService.queueItem(itemNo);
		
		return value;
	}
	
	
	
	
}