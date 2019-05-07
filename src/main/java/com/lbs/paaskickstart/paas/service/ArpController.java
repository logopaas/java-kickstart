package com.lbs.paaskickstart.paas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArpController {
	private static String uri = "http://localhost:8080/logo/restservices/rest/v2.0/arps";

	@Autowired
	private JPlatformARPService jPlatformArpService;
	
	@RequestMapping(value = "/{code}", method = RequestMethod.GET)
	public String get(@PathVariable("code") String arpCode, @RequestHeader(value="access_token", required = false) String accessToken) {
		System.out.println(accessToken);
		return getjPlatformArpService().get(arpCode, accessToken);
	}

	@RequestMapping(method = RequestMethod.PUT)
	public void update(@RequestBody String arp, @RequestHeader(value="access-token") String accessToken) {
		getjPlatformArpService().update(arp, accessToken);
	}

	@RequestMapping(value = "/{code}", method = RequestMethod.PUT)
	public void changeStatus(@PathVariable("code") String arpCode, @RequestHeader(value="access-token") String accessToken) {
		getjPlatformArpService().changeStatus(arpCode, accessToken);

	}
	
	@RequestMapping(value = "/{code}", method = RequestMethod.DELETE)
	public void delete(@PathVariable("code") String arpCode, @RequestHeader(value="access-token") String accessToken) {
		getjPlatformArpService().delete(arpCode, accessToken);

	}

	@RequestMapping(method = RequestMethod.POST)
	public void create(@RequestBody String[] arps, @RequestHeader(value="access-token") String accessToken) {
		getjPlatformArpService().create(arps, accessToken);
	}
	
	public JPlatformARPService getjPlatformArpService() {
		if( jPlatformArpService == null )
			jPlatformArpService = new JPlatformARPService();
		return jPlatformArpService;
	}
}
