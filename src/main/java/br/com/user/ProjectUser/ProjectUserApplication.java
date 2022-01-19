package br.com.user.ProjectUser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan(basePackages = "br.com.user.entity")
@EnableJpaRepositories(basePackages = "br.com.user.repository")
@ComponentScan(basePackages = "br.com.user.resource")
@ComponentScan(basePackages = "br.com.user.services")
@SpringBootApplication
public class ProjectUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectUserApplication.class, args);
	}

}
