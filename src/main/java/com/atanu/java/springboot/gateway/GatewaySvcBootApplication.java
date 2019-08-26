package com.atanu.java.springboot.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author Atanu Bhowmick
 *
 */
@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
public class GatewaySvcBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewaySvcBootApplication.class, args);
	}

}
