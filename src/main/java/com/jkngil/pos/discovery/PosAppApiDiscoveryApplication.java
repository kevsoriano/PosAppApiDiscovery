package com.jkngil.pos.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class PosAppApiDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(PosAppApiDiscoveryApplication.class, args);
	}

}
