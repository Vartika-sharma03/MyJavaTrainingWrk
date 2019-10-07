package com.customer.config;

import javax.persistence.EntityManagerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;;
@Configuration
@EnableJpaRepositories(basePackages= {"com.customer.config"})
@EnableTransactionManagement
public class JpaConfig {
@Bean
public LocalEntityManagerFactoryBean entityManagerFactory()
{
	LocalEntityManagerFactoryBean factorybean=new LocalEntityManagerFactoryBean();
	factorybean.setPersistenceUnitName("Salesdb");
	return factorybean;
	
}
@Bean
public JpaTransactionManager transactionManager(EntityManagerFactory entityManagerFactory)
{
	JpaTransactionManager transactionManager=new JpaTransactionManager();
	transactionManager.setEntityManagerFactory(entityManagerFactory);
	return transactionManager;
}
	
}