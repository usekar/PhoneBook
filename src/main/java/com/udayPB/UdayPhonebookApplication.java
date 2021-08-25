package com.udayPB;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
 

@SpringBootApplication
public class UdayPhonebookApplication {
//to deploy in a web container,
//public class UdayPhonebookApplication extends SpringBootServletInitializer {

	/*
	 * @Override protected SpringApplicationBuilder
	 * configure(SpringApplicationBuilder builder) { return
	 * builder.sources(SpringApplication.class); }
	 */
	Logger logger = LoggerFactory.getLogger(UdayPhonebookApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(UdayPhonebookApplication.class, args);
		System.out.println("Welcome to Uday Phonebook project");
	}
	
 /* To do
 
  * scalabality feautures 
  * Add test cases for repository
  * add test cases for mockito  *  
  * Pagination


  */
}
