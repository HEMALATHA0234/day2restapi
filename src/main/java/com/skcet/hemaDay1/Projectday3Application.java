package com.skcet.hemaDay1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import Json.Jsonignore;

@SpringBootApplication
public class Projectday3Application {

	public static void main(String[] args) throws JsonProcessingException {
		SpringApplication.run(Projectday3Application.class, args);
		Jsonignore obj=new Jsonignore("hema",1,"happy");
		ObjectMapper oa=new ObjectMapper();
		String str=oa.writeValueAsString(obj);
		System.out.println(str);
	}

}
