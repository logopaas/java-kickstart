package com.lbs.paaskickstart.paas.service;

import java.io.UnsupportedEncodingException;

import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class JPlatformARPService {
	
	private String uri = "http://localhost:8080/logo/restservices/rest/v2.0/arps";
	
	public String get(String arpCode, String accessToken) {
		RestTemplate restTemplate = new RestTemplate();
		String result = null;
		UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(uri).queryParam("arpCode", arpCode);
		try {
			result = restTemplate.getForObject(builder.toUriString(), String.class);
			System.out.println(result);
		} catch (Exception e) {
			System.out.println();
		}
		return result;
	}
	
	public void update(String arp, String accessToken) {
		HttpPut put = new HttpPut(uri);
		StringEntity input = new StringEntity(arp, "utf-8");
		input.setContentType("application/json");
		put.setEntity(input);

		RequestConfig requestConfig = RequestConfig.copy(RequestConfig.DEFAULT).setConnectTimeout(3000)
				.setConnectionRequestTimeout(5000).build();

		try (CloseableHttpClient httpClient = HttpClientBuilder.create().setDefaultRequestConfig(requestConfig)
				.build()) {

			HttpResponse response = httpClient.execute(put);

			if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
				System.out.println("ARP Updated");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void changeStatus(String arpCode, String accessToken) {
		uri +="/status";
		UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(uri).queryParam("arpCode", arpCode);
		HttpPut put = new HttpPut(builder.toUriString());
		StringEntity input = null;
		try {
			input = new StringEntity(arpCode);
		} catch (UnsupportedEncodingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		input.setContentType("application/json");
		put.setEntity(input);
		RequestConfig requestConfig = RequestConfig.copy(RequestConfig.DEFAULT).setConnectTimeout(3000)
				.setConnectionRequestTimeout(5000).build();

		try (CloseableHttpClient httpClient = HttpClientBuilder.create().setDefaultRequestConfig(requestConfig)
				.build()) {
			HttpResponse response = httpClient.execute(put);

			if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
				String json1 = EntityUtils.toString(response.getEntity(), "utf-8");
				System.out.println("ARP's Status Changed");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void delete(String arpCode, String accessToken) {
		UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(uri).queryParam("arpCode", arpCode);
		HttpDelete delete = new HttpDelete(builder.toUriString());


		RequestConfig requestConfig = RequestConfig.copy(RequestConfig.DEFAULT).setConnectTimeout(3000)
				.setConnectionRequestTimeout(5000).build();

		try (CloseableHttpClient httpClient = HttpClientBuilder.create().setDefaultRequestConfig(requestConfig)
				.build()) {
			HttpResponse response = httpClient.execute(delete);

			if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
				String json1 = EntityUtils.toString(response.getEntity(), "utf-8");
				System.out.println("ARP Deleted");
			}
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
			e.printStackTrace();
		}

	}
	public void create(String[] arps, String accessToken) {
		HttpPost post = new HttpPost(uri);
		for (int i = 0; i < arps.length; i++) {
			StringEntity input = new StringEntity(arps[i], "utf-8");
			input.setContentType("application/json");
			post.setEntity(input);

			RequestConfig requestConfig = RequestConfig.copy(RequestConfig.DEFAULT).setConnectTimeout(3000)
					.setConnectionRequestTimeout(5000).build();

			try (CloseableHttpClient httpClient = HttpClientBuilder.create().setDefaultRequestConfig(requestConfig)
					.build()) {

				HttpResponse response = httpClient.execute(post);

				if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
					String json1 = EntityUtils.toString(response.getEntity(), "utf-8");
					System.out.println("ARP Created with " + json1);
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
