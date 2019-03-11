package com.lbs.paaskickstart;

import com.lbs.oauthclient.NeverFailWebScope;
import com.lbs.oauthclient.spring.OAFilter;
import com.lbs.paaskickstart.conf.PaasKickStartServiceConfig;
import com.lbs.service.base.annotation.LbsMicroService;
import org.springframework.beans.factory.config.CustomScopeConfigurer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Import;
import org.springframework.core.env.Environment;
import org.springframework.web.context.request.SessionScope;

@SpringBootApplication
@Import({ PaasKickStartServiceConfig.class })
@LbsMicroService(apiVersions = { "v1.0" })
@ComponentScan(value = {"com.lbs.paaskickstart","com.lbs.oauthclient"})
public class PaasKickstartApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaasKickstartApplication.class, args);
	}



}
