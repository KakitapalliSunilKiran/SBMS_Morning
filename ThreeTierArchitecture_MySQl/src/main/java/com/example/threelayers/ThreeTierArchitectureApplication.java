package com.example.threelayers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.threelayers.repo.RepoInfo;

@SpringBootApplication
public class ThreeTierArchitectureApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(ThreeTierArchitectureApplication.class, args);
		RepoInfo ri = ctx.getBean(RepoInfo.class);
		System.out.println(ri.getClass().getName());
	}

}
