package de.wps.dockerintro;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class App 
{
	public static void main(String[] args) throws Exception
	{
		System.out.println("Starting Server");
		
		new SpringApplicationBuilder().sources(App.class).run(args);

		System.out.println("Server started");
	}
}
