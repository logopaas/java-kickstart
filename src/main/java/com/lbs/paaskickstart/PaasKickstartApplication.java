package com.lbs.paaskickstart;

import com.lbs.paaskickstart.paas.PaasKickStartServiceConfig;
import com.lbs.service.base.annotation.LbsMicroService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({ PaasKickStartServiceConfig.class })
@LbsMicroService(apiVersions = { "v1.0" })
@ComponentScan(value = {"com.lbs.paaskickstart","com.lbs.oauthclient"})
public class PaasKickstartApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaasKickstartApplication.class, args);
	}



}
