package com.lbs.paaskickstart.paas.menu;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

import com.google.gson.Gson;
import com.lbs.base.config.service.LbsRestServiceUrlProvider;
import com.lbs.mi.defs.ModuleMenuNode;
import com.lbs.oauthclient.DiscoveryConstants;
import com.lbs.oauthclient.spring.DiscoveryUtil;
import com.lbs.paaskickstart.paas.menu.dto.LangResource;
import com.lbs.paaskickstart.paas.menu.dto.MenuItemDTO;
import com.lbs.paaskickstart.paas.menu.dto.NameDTO;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.lbs.base.config.util.LbsGuidUtil;

import wiremock.org.apache.commons.lang3.StringUtils;


@Service
public class MenuRegistrationService
{

	@Value("${idm.client.id}")
	private String m_AppId;
	@Value("${idm.client.secret}")
	private String m_ClientSecret;
	private String m_Url = "http://localhost:9011";
	private String m_MenuServicePath = "";


	@Autowired
	private LbsRestServiceUrlProvider lbsRestServiceUrlProvider;

	public void registerMenu(List<String> paths)
	{
		m_MenuServicePath = "api/Menus/PostApplicationMenus?appId="+m_AppId;
		//String adress = lbsRestServiceUrlProvider.getServiceUrl("NAFCORESERVICESMENU") + m_MenuServicePath;
		String adress = "http://dev-linux.logo-paas.com:7000/" + m_MenuServicePath;
		RestTemplate restTemplate = new RestTemplate();
		try
		{
			System.out.println(m_AppId);

			System.out.println(new Gson().toJson(prepareHeaders(paths)));
			ResponseEntity<Object> response = restTemplate.exchange(adress, HttpMethod.POST,
					prepareHeaders(paths), Object.class);
			System.out.println(response.getStatusCode());
		}
		catch (RestClientException e)
		{

			e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}


	private void sendMenu (String address, List<String> paths) {
		HttpPost put = new HttpPost(address);
		MenuItemDTO[] menuItems;
			menuItems = new MenuItemDTO[paths.size()];
			for(int i = 0 ; i < paths.size(); i++) {
				try {
					menuItems[i] = prepareMenuItems(paths.get(i).substring(1));
				} catch (UnsupportedEncodingException e) {
					e.printStackTrace();
				}
			}




		StringEntity input = new StringEntity(menuItems.toString() , "utf-8");
		input.setContentType("application/json");
		put.setEntity(input);
		put.addHeader("client_id", m_AppId);
		put.addHeader("client_secret", m_ClientSecret);
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
	private HttpEntity<MenuItemDTO[]> prepareHeaders(List<String> paths)
	{
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.set("client_id", m_AppId);
		httpHeaders.set("client_secret", m_ClientSecret);
		httpHeaders.setContentType(MediaType.APPLICATION_JSON);
		MenuItemDTO[] menuItems;
		try
		{
			menuItems = new MenuItemDTO[paths.size()];
			for(int i = 0 ; i < paths.size(); i++) {
				menuItems[i] = prepareMenuItems(paths.get(i).substring(1));
			}
			return new HttpEntity<MenuItemDTO[]>(menuItems, httpHeaders);
		}
		catch (UnsupportedEncodingException e)
		{
			return null;
		}

	}

	private MenuItemDTO prepareMenuItems(String path)
			throws UnsupportedEncodingException
	{

		MenuItemDTO menuItemDTO = new MenuItemDTO();

		/*
		 * set parent properties
		 */

		LangResource langResource = new LangResource();
		menuItemDTO.setAppId(m_AppId);
		String prettyName = path;
		//menuItemDTO.setDescription(prettyName);
		menuItemDTO.setHasRight(true);

		menuItemDTO.setId(String.valueOf(LbsGuidUtil.generateGuid(path + m_AppId + "1")));
		menuItemDTO.setActive(true);
		menuItemDTO.setInNewTab(false);
		menuItemDTO.setUrlRelative(false);
		//NameDTO nameDTO = new NameDTO();
		//nameDTO.setLang("tr-TR");
		//nameDTO.setValue(prettyName);
		//menuItemDTO.setNames(Arrays.asList(nameDTO));

		//menuItemDTO.setToolTip(path);

		menuItemDTO.setUrl(m_Url + "/"+ path);


		langResource.setDescription(prettyName.toUpperCase());
		langResource.setLang("tr-TR");
		langResource.setName(prettyName);
		langResource.setToolTip(prettyName);
		menuItemDTO.setLangResources(Arrays.asList(langResource));

		return menuItemDTO;
	}

}
