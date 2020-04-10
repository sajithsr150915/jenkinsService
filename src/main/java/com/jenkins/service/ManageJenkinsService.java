package com.jenkins.service;

import java.io.IOException;

import org.apache.http.auth.AuthenticationException;
import org.apache.http.client.ClientProtocolException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.jenkins.model.BuildInfo;
import com.jenkins.model.JobDetails;
import com.jenkins.model.PipelineNode;

@Service
@Component
public class ManageJenkinsService {

	@Autowired
	private JenkinsClient jenkinsClient;

	private static final String jenkinsJobURI = "/api/json";

	Logger logger = LoggerFactory.getLogger(ManageJenkinsService.class);

	private final RestTemplate restTemplate;
	@Value("${jenkinsURL}")
	private String url;

	private static String username = "admin";
	private static String password = "admin";
	

	public ManageJenkinsService(RestTemplateBuilder restTemplateBuilder) {
		this.restTemplate = restTemplateBuilder
				.basicAuthentication(username, password)
				.build();
	}

	/**
	 * Sample code for getting the last completed build of a job Used the
	 * RestTemplate way to fetch the details from jenkins as part of a trial method
	 * for reducing the code.
	 */
	public BuildInfo lastCompletedBuild(String jobName) {

		String jenkinsUrl = this.url + "/job/{jobName}/lastCompletedBuild/api/json";
		return this.restTemplate.getForObject(jenkinsUrl, BuildInfo.class, jobName);
	}

	public JobDetails detailsOfJob(String jobName) {

		String jenkinsUrl = this.url + "/job/{jobName}/api/json?tree=builds[number,status,timestamp,id,result]";
		return this.restTemplate.getForObject(jenkinsUrl, JobDetails.class, jobName);

	}

	public String overallLoad() {

		String jenkinsUrl = this.url + "/overallLoad/api/json";
		return this.restTemplate.getForObject(jenkinsUrl, String.class);
	}
	
	public BuildInfo latestBuildOfJob(String jobName) {
		
		String jenkinsUrl = this.url + "/job/{jobName}/lastBuild/api/json";
		return this.restTemplate.getForObject(jenkinsUrl, BuildInfo.class, jobName);
	}
	
	public BuildInfo lastStableBuild(String jobName) {
		
		String jenkinsUrl = this.url + "/job/{jobName}/lastStableBuild/api/json";
		return this.restTemplate.getForObject(jenkinsUrl, BuildInfo.class, jobName);
	}
	
	public BuildInfo lastSuccessfulBuild(String jobName) {
		
		String jenkinsUrl = this.url + "/job/{jobName}/lastSuccessfulBuild/api/json";
		return this.restTemplate.getForObject(jenkinsUrl, BuildInfo.class, jobName);
	}
	
	public BuildInfo lastFailedBuild(String jobName) {
		
		String jenkinsUrl = this.url + "/job/{jobName}/lastFailedBuild/api/json";
		return this.restTemplate.getForObject(jenkinsUrl, BuildInfo.class, jobName);
	}
	
	public PipelineNode pipelineNode(String jobName, String buildNo, String nodeId) {

		String jenkinsUrl = this.url + "/job/{jobName}/{buildNo}/execution/node/{nodeId}/wfapi/describe";
		return this.restTemplate.getForObject(jenkinsUrl, PipelineNode.class, jobName, buildNo, nodeId);
	}

}
