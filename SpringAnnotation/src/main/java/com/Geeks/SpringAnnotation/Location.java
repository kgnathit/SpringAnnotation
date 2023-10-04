package com.Geeks.SpringAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Location {

	@Bean
	public CollegeInfo getDetails()
	{
		return new CollegeInfo();
	}
	@Bean
	public InsituteArea getLocation()
	{
		return new SouthIndia();
	}
}
