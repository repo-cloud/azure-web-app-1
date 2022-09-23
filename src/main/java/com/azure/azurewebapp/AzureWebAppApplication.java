package com.azure.azurewebapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping(path = "/api")
public class AzureWebAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(AzureWebAppApplication.class, args);
	}

	@GetMapping("test/{var}")
	public String testService(@PathVariable String var){
		return "Test Service....." + var;
	}

}
