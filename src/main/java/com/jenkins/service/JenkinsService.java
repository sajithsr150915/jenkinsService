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
	
	
}