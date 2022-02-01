package com.te.librarymanagementsystems.exceptioncontroller;

import org.springframework.context.annotation.Bean;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;

public class StudentExceptionController {

@Bean
public LocalEntityManagerFactoryBean factoryBean() {
	LocalEntityManagerFactoryBean bean= new LocalEntityManagerFactoryBean();
	bean.setPersistenceUnitName("stud");
	return bean;
}
}