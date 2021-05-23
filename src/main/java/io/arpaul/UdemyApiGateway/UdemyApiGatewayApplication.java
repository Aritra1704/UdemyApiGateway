package io.arpaul.UdemyApiGateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UdemyApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(UdemyApiGatewayApplication.class, args);
	}

	/**
	 * Steps to test this
	 * Startup discovery service
	 * Startup the other API(users or accounts)
	 * startup this api
	 * Open Postman
	 * fetch this api http://localhost:8082/UDEMY-USER/users/status/check
	 */
}
