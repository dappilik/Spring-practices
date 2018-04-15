package com.krishna.springboottest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.base.Predicates;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@RestController
@EnableAutoConfiguration
public class Example {

	public static void main(String[] args) {
		SpringApplication.run(Example.class, args);
	}
	
	@RequestMapping(value ="/hello", method =  RequestMethod.POST)
	public ResponseEntity home(@PathVariable String name) {
		return new ResponseEntity("hello " + name,HttpStatus.OK);
	}
	
	@Bean
    public Docket swaggerSpringMvcPlugin() {
        return new Docket(DocumentationType.SWAGGER_2)
            .useDefaultResponseMessages(false)
            .apiInfo(apiInfo())
            .select()
            .paths(Predicates.not(PathSelectors.regex("/error.*")))
            .build();
    }

	private ApiInfo apiInfo() {
		
		return new ApiInfoBuilder()
	            .title("Springfox petstore API")
	            .description("description")
	            .contact(new Contact("name", "url", "email"))
	            .license("Apache License Version 2.0")
	            .licenseUrl("https://github.com/springfox/springfox/blob/master/LICENSE")
	            .version("2.0")
	            .build();
	}
}
