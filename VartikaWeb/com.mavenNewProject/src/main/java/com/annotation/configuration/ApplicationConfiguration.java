package com.annotation.configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.annotatioin.model.Country;

@Configuration
public class ApplicationConfiguration
{
	@Bean(name="countryObject")
	public Country getCountry()
	{
		return new Country("INDIA");
	}
}