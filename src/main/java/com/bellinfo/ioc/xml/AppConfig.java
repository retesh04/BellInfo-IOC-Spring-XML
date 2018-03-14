package com.bellinfo.ioc.xml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages= {"com.bellinfo"})
public class AppConfig {
	
	
	@Bean
	public MedicalService medicalService() {
		return new MedicalService("medicalService");
	}

	@Bean
	public MedicalService medicalService321() {
		return new MedicalService("medicalService321");
	}
	
}
