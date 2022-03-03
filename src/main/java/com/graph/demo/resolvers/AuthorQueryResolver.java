package com.graph.demo.resolvers;

import java.util.List;

import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.graph.demo.dto.Author;

@Component
public class AuthorQueryResolver implements GraphQLQueryResolver{
	
	public List<Author> getAuthors(){
		return null;
	}

}
