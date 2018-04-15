package com.krishna;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.krishna.service.InstituteService;

public class Application {
	public static void main(String[] args) {
		
//		InstituteService instituteService = new InstituteServiceImpl();
		ApplicationContext appContext = new ClassPathXmlApplicationContext("appContext.xml");
		InstituteService instituteService = appContext.getBean("instituteService", InstituteService.class);
		
		System.out.println(instituteService.searchInstitute().getName());
	}
}
