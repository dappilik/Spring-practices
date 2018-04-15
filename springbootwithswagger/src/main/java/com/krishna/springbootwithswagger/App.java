package com.krishna.springbootwithswagger;

import static springfox.documentation.builders.PathSelectors.regex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableSwagger2
@ComponentScan("com.krishna")
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
	
	@Bean
	public Docket newApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.groupName("greetings")
				.apiInfo(apiInfo())
				.select()
				.paths(regex("/greeting.*"))
				.build();
				
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder()
                .title("Spring REST Sample with Swagger")
                .description("Spring REST Sample with Swagger")
                .license("Apache License Version 2.0")
                .version("2.0")
                .build();
	}
}
