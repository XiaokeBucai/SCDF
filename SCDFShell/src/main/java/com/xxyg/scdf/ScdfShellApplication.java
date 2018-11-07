package com.xxyg.scdf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.dataflow.shell.EnableDataFlowShell;

@EnableDataFlowShell
@SpringBootApplication
public class ScdfShellApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScdfShellApplication.class, args);
	}
}
