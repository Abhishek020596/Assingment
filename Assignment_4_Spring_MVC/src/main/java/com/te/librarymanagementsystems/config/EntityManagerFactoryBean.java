package com.te.librarymanagementsystems.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;

@Configuration
public class EntityManagerFactoryBean {
	@Bean
	public LocalEntityManagerFactoryBean factoryBean() {
		LocalEntityManagerFactoryBean bean= new LocalEntityManagerFactoryBean();
		bean.setPersistenceUnitName("stud");
		return bean;
	}
}
