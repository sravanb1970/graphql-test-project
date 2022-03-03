package com.graph.demo.resolvers;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.graph.demo.dto.MessageDto;

@Component
public class HelloWorldQueryResolvers implements GraphQLQueryResolver {

	public String helloWorld() {
		return "Hello World! Graph is awesome";
	}

	public String getGreetingMessage(String firstName, String lastName) {
		return "Hello! " + firstName + " " + lastName;

	}

	public MessageDto getMessage() {
		return MessageDto.builder().id(UUID.randomUUID()).text("Some text with id and message").build();
	}
	
	public List<Integer> getRollDice(){
		return Arrays.asList(1,2,3,4);
	}
}
