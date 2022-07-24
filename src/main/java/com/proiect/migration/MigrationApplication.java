
package com.proiect.migration;

import com.proiect.migration.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class MigrationApplication implements CommandLineRunner {

	@Autowired
	private MyRepoConfig repository;

	@Override
	public void run(String... args) throws Exception {
		System.err.println(this.repository.movieRepository().findAll());
	}
	public static void main(String[] args) {
		SpringApplication.run(MigrationApplication.class, args);
	}

}
