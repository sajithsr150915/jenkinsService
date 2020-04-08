package com.jenkins.service;

import java.io.IOException;
import org.apache.http.auth.AuthenticationException;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.auth.BasicScheme;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class JenkinsService {

	private static String JenkinsAuthenticationUserName = "admin";
	private static String JenkinsAuthenticationPassword = "admin";

	public  void JenkinsRemoteAPIBuild(String param1, String param2) throws AuthenticationException, ClientProtocolException, IOException {
		CloseableHttpClient client = HttpClients.createDefault();
		HttpPost httpPost = new HttpPost(
				"http://localhost:8080/job/Parameterized_Job/buildWithParameters?token=e82c6c0878521d55f899f897f4ad07d8&Environment="
						+ param1 + "&Architecture=" + param2);

		UsernamePasswordCredentials creds = new UsernamePasswordCredentials(JenkinsAuthenticationUserName,
				JenkinsAuthenticationPassword);
		httpPost.addHeader(new BasicScheme().authenticate(creds, httpPost, null));
		httpPost.addHeader("Content-type", "application/json");
		httpPost.addHeader("Accept", "application/json");
		System.out.println("posting: " + httpPost);
		CloseableHttpResponse response = client.execute(httpPost);
		System.out.println((response.getStatusLine().getStatusCode()));
		System.out.println("Response: " + response);
		client.close();
	}

	
	
	public  String jenkinsGetAPI() throws AuthenticationException, ClientProtocolException, IOException {
		CloseableHttpClient client = HttpClients.createDefault();
		HttpGet httpGet = new HttpGet(
				"http://localhost:8080/api/json?pretty=true");

		UsernamePasswordCredentials creds = new UsernamePasswordCredentials(JenkinsAuthenticationUserName,
				JenkinsAuthenticationPassword);
		httpGet.addHeader(new BasicScheme().authenticate(creds, httpGet, null));
		httpGet.addHeader("Content-type", "application/json");
		httpGet.addHeader("Accept", "application/json");
		System.out.println("send get request: " + httpGet);
		CloseableHttpResponse response = client.execute(httpGet);
		System.out.println((response.getStatusLine().getStatusCode()));
		System.out.println("Response: " + EntityUtils.toString(response.getEntity()));
		String responseString=EntityUtils.toString(response.getEntity());
		client.close();
		return responseString;
		
	}

	
	
}