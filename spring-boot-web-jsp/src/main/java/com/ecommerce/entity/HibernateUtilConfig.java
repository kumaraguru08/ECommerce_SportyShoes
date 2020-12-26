package com.ecommerce.entity;

import javax.persistence.EntityManagerFactory;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HibernateUtilConfig {

	@Autowired
	private EntityManagerFactory entityManagerFactory;
	
	@Bean
	public SessionFactory getSessionFacoty(){
		if(entityManagerFactory.unwrap(SessionFactory.class)==null){
			throw new NullPointerException();  
		}
		return entityManagerFactory.unwrap(SessionFactory.class);
	}
}
