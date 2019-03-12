package com.lbs.paaskickstart.paas;

import com.lbs.external.annotation.EnableLbsExternalServices;
import com.lbs.oauthclient.NeverFailWebScope;
import com.lbs.oauthclient.spring.OAFilter;
import com.lbs.service.base.config.LbsAbstractBaseMicroServiceConfig;
import org.springframework.beans.factory.config.CustomScopeConfigurer;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.core.env.Environment;
import org.springframework.web.context.request.SessionScope;

@Configuration
@EnableAutoConfiguration
@EnableConfigurationProperties
@EnableLbsExternalServices
public class PaasKickStartServiceConfig extends LbsAbstractBaseMicroServiceConfig
{

	@Bean
	protected FilterRegistrationBean oaFilter(Environment env) {
		FilterRegistrationBean frb = new FilterRegistrationBean(new OAFilter(env));
		frb.addUrlPatterns("/*");
		frb.addInitParameter(OAFilter.PERMITTED_URL_PATTERN, "^/(?:oauth|login|vaadinServlet|VAADIN|api/api-docs|api/diagnose)(?:|(?:[\\?#/].*))$" );
		frb.setName("Authentication Filter");
		return frb;
	}

	@Bean
	public static NeverFailWebScope neverFailScope(){
		return new NeverFailWebScope(new SessionScope());
	}

	@Bean @DependsOn("neverFailScope")
	public static CustomScopeConfigurer neverFailSession(NeverFailWebScope neverFailWebScope) {
		CustomScopeConfigurer configurer = new CustomScopeConfigurer();
		configurer.addScope("neverFailSession", neverFailWebScope);
		return configurer;
	}



}