package com.fusion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan("controller,service,dao")
@EntityScan("model")
@SpringBootApplication
public class GoshalaServiceApplication extends SpringBootServletInitializer{

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(GoshalaServiceApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(GoshalaServiceApplication.class, args);
	}
}
