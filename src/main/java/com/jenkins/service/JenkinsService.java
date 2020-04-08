package com.jenkins.service;

import java.io.IOException;

import org.apache.http.auth.AuthenticationException;
import org.apache.http.client.ClientProtocolException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class JenkinsService {

	@Autowired
	private JenkinsClient jenkinsClient;
	
	
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
		
		
		
		
		
		
	
}