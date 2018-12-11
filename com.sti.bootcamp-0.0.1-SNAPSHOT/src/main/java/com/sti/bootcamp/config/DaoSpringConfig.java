package com.sti.bootcamp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sti.bootcamp.dao.CustomerDao;
import com.sti.bootcamp.dao.impl.CustomerDaoImpl;

@Configuration
public class DaoSpringConfig {
	@Bean
	public CustomerDao customerDao() {
		return new CustomerDaoImpl();
	}
}
