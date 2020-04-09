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

@Service
@Component
public class JenkinsService {

	@Autowired
	private JenkinsClient jenkinsClient;
	/*http://localhost:8080/overallLoad/api/json
http://localhost:8080/job/build%20project/lastBuild/logText/progressiveText
http://localhost:8080/pluginManager/api/json?depth=5

http://localhost:8080/queue/api/json

http://localhost:8080/queue/item/33/api/json
*/
	
	private static final  String  jenkinsJobURI="/api/json";
	
	
	
	 Logger logger = LoggerFactory.getLogger(JenkinsService.class);

	
		public String jenkinsGetAPI() {

			try {
				String URI = jenkinsJobURI;
				return jenkinsClient.jenkinsGetAPI(URI);
			} catch (AuthenticationException e) {
				logger.error("AuthenticationException error" + e);
			} catch (ClientProtocolException e) {
				logger.error("ClientProtocolException error" + e);

			} catch (IOException e) {
				logger.error("IOException error" + e);

			}
			return null;
		}
	
		
		
		public String jenkinsJobNameColor() {

			try {
				String URI = "/api/json?tree=jobs[name,color]";
				return jenkinsClient.jenkinsGetAPI(URI);
			} catch (AuthenticationException e) {
				logger.error("AuthenticationException error" + e);
			} catch (ClientProtocolException e) {
				logger.error("ClientProtocolException error" + e);

			} catch (IOException e) {
				logger.error("IOException error" + e);

			}
			return null;
		}
		
		public String latestBuildOfJob(String jobName) {

			try {
				String URI = "/job/jobName/lastBuild/api/json";
				URI=URI.replace("jobName", jobName);
				return jenkinsClient.jenkinsGetAPI(URI);
			} catch (AuthenticationException e) {
				logger.error("AuthenticationException error" + e);
			} catch (ClientProtocolException e) {
				logger.error("ClientProtocolException error" + e);

			} catch (IOException e) {
				logger.error("IOException error" + e);

			}
			return null;
		}
		
		public String detailsOfJob(String jobName) {

			try {
				String URI = "/job/jobName/api/json?tree=builds[number,status,timestamp,id,result]";
				URI=URI.replace("jobName", jobName);

				return jenkinsClient.jenkinsGetAPI(URI);
			} catch (AuthenticationException e) {
				logger.error("AuthenticationException error" + e);
			} catch (ClientProtocolException e) {
				logger.error("ClientProtocolException error" + e);

			} catch (IOException e) {
				logger.error("IOException error" + e);

			}
			return null;
		}
		
		public String lastBuildSpecificDetails(String jobName) {

			try {
				String URI = "/job/jobName/lastBuild/api/json?tree=result,timestamp,estimatedDuration";
				URI=URI.replace("jobName", jobName);

				return jenkinsClient.jenkinsGetAPI(URI);
			} catch (AuthenticationException e) {
				logger.error("AuthenticationException error" + e);
			} catch (ClientProtocolException e) {
				logger.error("ClientProtocolException error" + e);

			} catch (IOException e) {
				logger.error("IOException error" + e);

			}
			return null;
		}
		
		public String buildDetailOfJob(String jobName,String buildNo) {

			try {
				String URI = "/job/jobName/buildNo/api/json";
				URI=URI.replace("jobName", jobName);
				URI=URI.replace("buildNo", buildNo);


				return jenkinsClient.jenkinsGetAPI(URI);
			} catch (AuthenticationException e) {
				logger.error("AuthenticationException error" + e);
			} catch (ClientProtocolException e) {
				logger.error("ClientProtocolException error" + e);

			} catch (IOException e) {
				logger.error("IOException error" + e);

			}
			return null;
		}
		
		public String jobDescription(String jobName) {

			try {
				String URI = "/job/jobName/description";
				URI=URI.replace("jobName", jobName);


				return jenkinsClient.jenkinsGetAPI(URI);
			} catch (AuthenticationException e) {
				logger.error("AuthenticationException error" + e);
			} catch (ClientProtocolException e) {
				logger.error("ClientProtocolException error" + e);

			} catch (IOException e) {
				logger.error("IOException error" + e);

			}
			return null;
		}
		
		
		
		public String configXML(String jobName) {

			try {
				String URI = "/job/jobName/config.xml";
				URI=URI.replace("jobName", jobName);


				return jenkinsClient.jenkinsGetAPI(URI);
			} catch (AuthenticationException e) {
				logger.error("AuthenticationException error" + e);
			} catch (ClientProtocolException e) {
				logger.error("ClientProtocolException error" + e);

			} catch (IOException e) {
				logger.error("IOException error" + e);

			}
			return null;
		}
		
		
		public String workflowAPI(String jobName,String buildNo) {

			try {
				String URI = "/job/jobName/buildNo/wfapi/describe";
				URI=URI.replace("jobName", jobName);
				URI=URI.replace("buildNo", buildNo);


				return jenkinsClient.jenkinsGetAPI(URI);
			} catch (AuthenticationException e) {
				logger.error("AuthenticationException error" + e);
			} catch (ClientProtocolException e) {
				logger.error("ClientProtocolException error" + e);

			} catch (IOException e) {
				logger.error("IOException error" + e);

			}
			return null;
		}
		
		
		public String pipelineNode(String jobName,String buildNo, String nodeId) {

			try {
				String URI = "/job/jobName/buildNo/execution/node/nodeId/wfapi/describe";
				URI=URI.replace("jobName", jobName);
				URI=URI.replace("buildNo", buildNo);
				URI=URI.replace("nodeId", nodeId);

				return jenkinsClient.jenkinsGetAPI(URI);
			} catch (AuthenticationException e) {
				logger.error("AuthenticationException error" + e);
			} catch (ClientProtocolException e) {
				logger.error("ClientProtocolException error" + e);

			} catch (IOException e) {
				logger.error("IOException error" + e);

			}
			return null;
		}
		
		
		public String lastStableBuild(String jobName) {

			try {
				String URI = "/job/jobName/lastStableBuild/api/json";
				URI=URI.replace("jobName", jobName);
				return jenkinsClient.jenkinsGetAPI(URI);
			} catch (AuthenticationException e) {
				logger.error("AuthenticationException error" + e);
			} catch (ClientProtocolException e) {
				logger.error("ClientProtocolException error" + e);

			} catch (IOException e) {
				logger.error("IOException error" + e);

			}
			return null;
		}
		
		
		public String lastSuccessfulBuild(String jobName) {

			try {
				String URI = "/job/jobName/lastSuccessfulBuild/api/json";
				URI=URI.replace("jobName", jobName);
				return jenkinsClient.jenkinsGetAPI(URI);
			} catch (AuthenticationException e) {
				logger.error("AuthenticationException error" + e);
			} catch (ClientProtocolException e) {
				logger.error("ClientProtocolException error" + e);

			} catch (IOException e) {
				logger.error("IOException error" + e);

			}
			return null;
		}
				
		
		public String lastFailedBuild(String jobName) {

			try {
				String URI = "/job/jobName/lastFailedBuild/api/json";
				URI=URI.replace("jobName", jobName);
				return jenkinsClient.jenkinsGetAPI(URI);
			} catch (AuthenticationException e) {
				logger.error("AuthenticationException error" + e);
			} catch (ClientProtocolException e) {
				logger.error("ClientProtocolException error" + e);

			} catch (IOException e) {
				logger.error("IOException error" + e);

			}
			return null;
		}
		
		
		/**
		 * Sample code for getting the last completed build of a job
		 * Used the RestTemplate way to fetch the details from jenkins
		 * as part of a trial method for reducing the code.
		 */
		
		private final RestTemplate restTemplate;		
		@Value("${jenkinsURL}")
		private String url;
		
		private static String username = "admin";
		private static String password = "admin";
		
		public JenkinsService(RestTemplateBuilder restTemplateBuilder) {
			this.restTemplate = restTemplateBuilder
					.basicAuthentication(username, password)
					.build();
		}
			
		public String lastCompletedBuild(String jobName) {
			
			String jenkinsUrl = this.url + "/job/{jobName}/lastCompletedBuild/api/json";
			return this.restTemplate.getForObject(jenkinsUrl, String.class, jobName);
		}
		
		/*
		 * Sample code ends here......
		 */
	
}
