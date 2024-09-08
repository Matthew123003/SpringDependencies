package com.CertWork.SpringDependencies;

import org.springframework.boot.SpringApplication;

public class TestFccCertWorkApplication {

	public static void main(String[] args) {
		SpringApplication.from(SpringDependenciesApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
