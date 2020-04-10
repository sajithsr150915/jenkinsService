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

@Service
@Component
public class ManageJenkinsService {

	@Autowired
	private JenkinsClient jenkinsClient;
	
	
	private static final  String  jenkinsJobURI="/api/json";
	
	
	
	 Logger logger = LoggerFactory.getLogger(ManageJenkinsService.class);

	
	
		
		
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
		
		public ManageJenkinsService(RestTemplateBuilder restTemplateBuilder) {
			this.restTemplate = restTemplateBuilder
					.basicAuthentication(username, password)
					.build();
		}
			
		public BuildInfo lastCompletedBuild(String jobName) {
			
			String jenkinsUrl = this.url + "/job/{jobName}/lastCompletedBuild/api/json";
			return this.restTemplate.getForObject(jenkinsUrl, BuildInfo.class, jobName);
		}
		
		
		

		
			public String overallLoad() {
			
			String jenkinsUrl = this.url + "/overallLoad/api/json";
			return this.restTemplate.getForObject(jenkinsUrl, String.class);
		}
		
			
			
			
		
	
}
