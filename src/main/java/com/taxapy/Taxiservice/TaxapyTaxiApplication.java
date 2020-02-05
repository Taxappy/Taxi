package com.taxapy.Taxiservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient // Enable eureka client.
@EnableCircuitBreaker // Enable circuit breakers
public class TaxapyTaxiApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaxapyTaxiApplication.class, args);
	}

}